package ccu.control;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import ccu.model.basicdata.EventInfo;
import ccu.model.basicdata.MachineInfo;
import ccu.model.basicdata.UnitInfo;
import ccu.model.system.UserInfo;
import ccu.springDataDao.basicdata.EventInfoRepo;
import ccu.springDataDao.basicdata.MachineInfoRepo;
import ccu.springDataDao.basicdata.UnitInfoRepo;
import ccu.springDataDao.system.UserInfoRepo;
import ccu.model.more.SimpliFireControlMess;

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

	@RequestMapping(value = "messageOfEquipSimpl", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
	public String MessageOfEquip(@RequestBody String str) 
	{
		JSONObject jsonObject = JSON.parseObject(str);
		System.out.println("aaaaaaaaa");
		List<SimpliFireControlMess> list = new ArrayList<SimpliFireControlMess>();
		List<UnitInfo> unitInfos = unitInfoRepo.findAll();
		System.out.println("bbbbbbbbb   "+unitInfos.size());
		for (int i = 0; i < unitInfos.size(); i++) 
		{
			UnitInfo unitInfo = unitInfos.get(i);
			System.out.println("ccccccc"+"  "+unitInfo.getId());
//			int fireCount = eventInfoRepo.findTheSumOfFirEvent(unitInfo.getId());
//			
//			System.out.println("ccccccc"+"  "+unitInfo.getId());
//			
//			int stopCount = eventInfoRepo.findTheSumOfStop(unitInfo.getId());
			int fireCount=0,stopCount=0,sum=0;
			double rate = 0;
			
			fireCount = eventInfoRepo.findTheSumOfFirEvent(unitInfo.getId());
			stopCount = eventInfoRepo.findTheSumOfStop(unitInfo.getId());
			System.out.println("ttttttttttttt");
			sum = Integer.parseInt(unitInfo.getNodeNum());
			System.out.println(fireCount+" "+stopCount+" "+" "+sum);
			if(sum!=0)
			{
				System.out.println("计算");
				rate = (fireCount + stopCount) / (sum*1.0);
				System.out.println("计算"+ rate);
			}
			else{
				System.out.println("赋值");
				rate = (Double) null;
			}
			System.out.println("dddddddd");
			SimpliFireControlMess sm = new SimpliFireControlMess();
			sm.setUnitId(unitInfo.getId());
			sm.setUnitcode(unitInfo.getUnitCode());
			sm.setUnitname(unitInfo.getUnitName());
			sm.setEvetcount(fireCount);
			sm.setTotlafailure(stopCount);
			sm.setEquipmentintegrityrate(rate);
			list.add(sm);
//			System.out.println(unitInfo.getId() + "          sdfsdf");
//			System.out.println(eventInfoRepo.findTheSumOfFirEvent(unitInfo.getId()));
		}
		if (list.size() > 0)
		{
			System.out.println("sdsdssd");
			return JSON.toJSONString(list);
		}
		else{
			System.out.println("ghfhfgf");
			return "null";
		}
	}

	@RequestMapping(value = "getMachineInfoSimpl", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
	public String getMachineInfo(@RequestBody String str) {
		JSONObject jsonObject = JSON.parseObject(str);
		System.out.println("  " + jsonObject.getString("unitid"));
		UnitInfo unitInfo = unitInfoRepo
				.findOne(jsonObject.getString("unitid"));
		System.out.println("  " + unitInfo.getId());
		List<MachineInfo> list = machineInfoRepo.findByUnitId(unitInfo.getId());

		if (list.size() > 0)
			return JSON.toJSONString(list);
		else
			return "null";
	}

	@RequestMapping(value = "getEventInfoSimpl", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
	public String getEventInfo(@RequestBody String str) {
		JSONObject jsonObject = JSON.parseObject(str);
		List<EventInfo> list = eventInfoRepo.findByUnitId(jsonObject
				.getString("unitid"));
		if (list.size() > 0)
			return JSON.toJSONString(list);
		else
			return "null";
	}

}
