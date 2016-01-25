package ccu.control;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ccu.model.basicdata.EventInfo;
import ccu.model.basicdata.MachineInfo;
import ccu.model.basicdata.UnitInfo;
import ccu.model.more.SimpliFireControlMess;
import ccu.springDataDao.basicdata.EventInfoRepo;
import ccu.springDataDao.basicdata.MachineInfoRepo;
import ccu.springDataDao.basicdata.UnitInfoRepo;
import ccu.springDataDao.system.UserInfoRepo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

@RestController
@Transactional
public class SimpMessageOfEquip {

	@Autowired
	private UnitInfoRepo unitInfoRepo;

	@Autowired
	private MachineInfoRepo machineInfoRepo;

	@Autowired
	private EventInfoRepo eventInfoRepo;

	@Autowired
	private UserInfoRepo userInfoRepo;

	/**
	 * 查询精简的消防设施信息
	 * 
	 * 输入数据：userId 查询类型 1（所有）,2（本单位） 输出数据：json 窜
	 * 
	 * @param str
	 * @return
	 */
	// @SuppressWarnings("deprecation")
	// @RequestMapping(value = "messageOfEquipSimpl",method =
	// RequestMethod.POST,produces="text/plain;charset=UTF-8")
	// public String MessageOfEquip(@RequestBody String str)
	// {
	// JSONObject jsonObject = JSON.parseObject(str);
	// List<SimpliFireControlMess> list = new
	// ArrayList<SimpliFireControlMess>();
	// if(jsonObject.getInteger("flag")==1)
	// {
	// UserInfo userInfo = userInfoRepo.findOne(jsonObject.getString("userid"));
	// UnitInfo unitInfo = unitInfoRepo.findOne(userInfo.getUnitId());
	// Date date =new Date();
	// date.setDate(1);;
	// SimpleDateFormat formatter;
	// formatter = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
	// String time = formatter.format(date);
	// int fireCount =
	// eventInfoRepo.findTheSumOfFirEvent(unitInfo.getId(),time);
	// int stopCount = eventInfoRepo.findTheSumOfStop(unitInfo.getId(),time);
	// SimpliFireControlMess sm = new SimpliFireControlMess();
	// double rate=
	// (fireCount+stopCount)/(Integer.parseInt(unitInfo.getNodeNum()));
	// sm.setUnitcode(unitInfo.getUnitCode());
	// sm.setUnitname(unitInfo.getUnitName());
	// sm.setEvetcount(fireCount);
	// sm.setTotlafailure(stopCount);
	// sm.setEquipmentintegrityrate(rate);
	//
	// list.add(sm);
	// }
	// else if(jsonObject.getInteger("flag")==2)
	// {
	// List<UnitInfo> unitInfos = unitInfoRepo.findAll();
	// for(int i=0;i<unitInfos.size();i++)
	// {
	// UnitInfo unitInfo = unitInfos.get(i);
	// Date date =new Date();
	// date.setDate(1);;
	// SimpleDateFormat formatter;
	// formatter = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
	// String time = formatter.format(date);
	// int fireCount =
	// eventInfoRepo.findTheSumOfFirEvent(unitInfo.getId(),time);
	// int stopCount = eventInfoRepo.findTheSumOfStop(unitInfo.getId(),time);
	// SimpliFireControlMess sm = new SimpliFireControlMess();
	// double rate=
	// (fireCount+stopCount)/(Integer.parseInt(unitInfo.getNodeNum()));
	// sm.setUnitId(unitInfo.getId());
	// sm.setUnitcode(unitInfo.getUnitCode());
	// sm.setUnitname(unitInfo.getUnitName());
	// sm.setEvetcount(fireCount);
	// sm.setTotlafailure(stopCount);
	// sm.setEquipmentintegrityrate(rate);
	// list.add(sm);
	// }
	// }
	// if(list.size()>0)
	// return JSON.toJSONString(list);
	// else
	// return "null";
	// }

	
	//按单位分页查询过单位的简单的设备信息
	@RequestMapping(value = "messageOfEquipSimpl", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
	public String MessageOfEquip(@RequestBody String str) 
	{
		boolean theNextPage = false;
		//传回的数据是：页数和每页的大小      格式：pageNum    ,pageSize。
		JSONObject jsonObject = JSON.parseObject(str);
		System.out.println("接收到的数据信息："+jsonObject.toString());
		List<SimpliFireControlMess> list = new ArrayList<SimpliFireControlMess>();
		Pageable pageable = new PageRequest(jsonObject.getIntValue("pageNum"),jsonObject.getIntValue("pageSize"));
		System.out.println("接收到的数据："+jsonObject.getIntValue("pageNum")+"   "+jsonObject.getIntValue("pageSize"));
		Page<UnitInfo> page= unitInfoRepo.findAll(pageable);
		System.out.println("分页查询通过！");
		if(page.getTotalElements()==0)
			return "null";
		if(page.hasNextPage())
			theNextPage = true;
		System.out.println("单位数目："+page.getSize());
		List<UnitInfo> unitInfos = page.getContent();
		for (int i = 0; i < unitInfos.size(); i++) 
		{
			int fireCount=0,stopCount=0,sum=0;
			double rate = 0;
			UnitInfo unitInfo = unitInfos.get(i);
			fireCount = eventInfoRepo.findTheSumOfFirEvent(unitInfo.getId());
			stopCount = eventInfoRepo.findTheSumOfStop(unitInfo.getId());
			if(unitInfo.getNodeNum() != null)
				sum = Integer.parseInt(unitInfo.getNodeNum());
			System.out.println(fireCount+" "+stopCount+" "+" "+sum);
			if(sum!=0)
			{
				rate = (fireCount + stopCount) / (sum*1.0);
			}
			else{
				System.out.println("赋值");
				rate = 0;
			}
			SimpliFireControlMess sm = new SimpliFireControlMess();
			sm.setUnitId(unitInfo.getId());
			sm.setUnitcode(unitInfo.getUnitCode());
			sm.setUnitname(unitInfo.getUnitName());
			sm.setEvetcount(fireCount);
			sm.setTotlafailure(stopCount);
			sm.setEquipmentintegrityrate(rate);
			sm.setTheNextPage(theNextPage);
			list.add(sm);
			System.err.println(list);
		}
		System.out.println("返回了简单的设备信息！");
		return JSON.toJSONString(list);
	}
	/*
	 * 根据单位获取本单位的设备精简信息
	 */
	@RequestMapping(value = "getMachineInfoSimpl", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
	public String getMachineInfo(@RequestBody String str) {
		int pageNum = 0;
		int pageSize = 0;
		final String  unitid = null;
		JSONObject jsonObject = JSON.parseObject(str);
		pageNum = jsonObject.getIntValue("pageNum");
		pageSize = jsonObject.getIntValue("pageSize");
		System.out.println("该单位的单位id：" + jsonObject.getString("unitid"));
		UnitInfo unitInfo = unitInfoRepo.findOne(jsonObject.getString("unitid"));
		Specification<MachineInfo> specification= new Specification<MachineInfo>() {
			@Override
			public Predicate toPredicate(Root<MachineInfo> root,
					CriteriaQuery<?> query, CriteriaBuilder cb) {
				
				Path path = root.get("unitid");
				Predicate predicate = cb.equal(path,unitid);
				return predicate;
			}
		};
		Pageable pageable = new PageRequest(pageNum, pageSize);
		Page<MachineInfo> page = machineInfoRepo.findAll(specification, pageable);
		List<MachineInfo> list = page.getContent();
		if (list.size() > 0)
			return JSON.toJSONString(list);
		else
			return "null";
	}

	/*
	 * 根据单位获取本单位的（火警）精简事件的信息
	 */
	@RequestMapping(value = "getEventInfoSimpl", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
	public String getEventInfo(@RequestBody String str) {
		int pageNum = 0;
		int pageSize = 0;
		JSONObject jsonObject = JSON.parseObject(str);
		final String  unitid = jsonObject.getString("unitid");
		pageNum = jsonObject.getIntValue("pageNum");
		pageSize = jsonObject.getIntValue("pageSize");
		Specification<EventInfo> specification= new Specification<EventInfo>() {
			@Override
			public Predicate toPredicate(Root<EventInfo> root,
					CriteriaQuery<?> query, CriteriaBuilder cb) {
				
				Path path = root.get("unitId");
				Predicate predicate = cb.equal(path,unitid);
				return predicate;
			}
		};
		Pageable pageable = new PageRequest(pageNum, pageSize);
		Page page= eventInfoRepo.findAll(specification, pageable);
		List<EventInfo> list = page.getContent();
		if (list.size() > 0)
			return JSON.toJSONString(list);
		else
			return "null";
	}
}
