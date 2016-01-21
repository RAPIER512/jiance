package ccu.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import ccu.model.basicdata.EventInfo;
import ccu.model.basicdata.EventType;
import ccu.model.basicdata.MachineInfo;
import ccu.model.system.UserInfo;
import ccu.springDataDao.basicdata.EventInfoRepo;
import ccu.springDataDao.basicdata.EventTypeRepo;
import ccu.springDataDao.basicdata.MachineInfoRepo;
import ccu.springDataDao.system.UserInfoRepo;



@RestController
@Transactional
public class DetailMessageOfEquip {
	@Autowired
	private MachineInfoRepo machineInfoRepo;
	
	@Autowired
	private EventInfoRepo eventInfoRepo;
	
	@Autowired
	private UserInfoRepo userInfoRepo;
	
	@Autowired
	private EventTypeRepo eventTypeRepo;
	
	
	@RequestMapping(value = "getMachineInfo",method = RequestMethod.POST,produces="text/plain;charset=UTF-8")
	public String getMachineInfo(@RequestBody String str)
	{
		JSONObject jsonObject = JSONObject.parseObject(str);
		MachineInfo machineInfo = machineInfoRepo.findByMachineCode(jsonObject.getString("machinecode"));
		
		if(machineInfo == null)
			return "null";
		else 
			return JSON.toJSONString(machineInfo);
	}
	
	
	
	@RequestMapping(value = "getEventInfo",method = RequestMethod.POST,produces="text/plain;charset=UTF-8")
	public String getEventInfo(@RequestBody String str)
	{
		JSONObject jsonObject = JSONObject.parseObject(str);
		EventInfo eventInfo = eventInfoRepo.findOne(jsonObject.getString("eventid"));
		
		if(eventInfo == null)
			return "null";
		else 
			return JSON.toJSONString(eventInfo);
	}
	
	
	
	
	@RequestMapping(value = "getUserInfo",method = RequestMethod.POST,produces="text/plain;charset=UTF-8")
	public String getUserInfo(@RequestBody String str)
	{
		JSONObject jsonObject = JSONObject.parseObject(str);
		
		UserInfo userInfo = userInfoRepo.findOne(jsonObject.getString("userid"));
		if(userInfo == null)
			return "null";
		else 
			return JSON.toJSONString(userInfo);
	}
	
	
	
	@RequestMapping(value = "getEventType",method = RequestMethod.POST,produces="text/plain;charset=UTF-8")
	public String getEventType(@RequestBody String str)
	{
		JSONObject jsonObject = JSONObject.parseObject(str);
		EventType eventType = eventTypeRepo.findOne(jsonObject.getString("typeid"));
		if(eventType == null)
			return "null";
		else
			return JSON.toJSONString(eventType);
	}
	
	
}
