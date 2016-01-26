package ccu.control;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;

import ccu.model.system.Role;
import ccu.model.system.UserInfo;
import ccu.model.system.UserReRole;
import ccu.springDataDao.system.RoleRepo;
import ccu.springDataDao.system.UserInfoRepo;
import ccu.springDataDao.system.UserReRoleRepo;


@RestController
@Transactional
public class LoginCtr {
	
	@Autowired
	private RoleRepo roleRepo;
	
	@Autowired
	private UserReRoleRepo userReRoleRepo;
	
	@Autowired
	private UserInfoRepo userInfoRepo;
	
	@RequestMapping(value = "login",method = RequestMethod.POST,produces="text/plain;charset=UTF-8")
	public String Login(@RequestBody String str)
	{
		JSONObject jsonObject = JSON.parseObject(str);
		try 
		{
			System.out.println(jsonObject.getString("username")+"    "+ jsonObject.getString("password"));
			UserInfo user = userInfoRepo.findByAccountAndPassword(jsonObject.getString("username"), jsonObject.getString("password"));
			if(user == null)
			{
				System.out.println("�û���¼Ϊ��");
				return "null";
			}
			List<UserReRole> list = userReRoleRepo.findByUserId(user.getId());
			System.out.println("�Ƿ����û���ɫ��"+list.size());
			Role role = roleRepo.findOne(list.get(0).getRoleId());
			System.out.println("���û���ɫ��"+role);
			Map<String,String> p = new HashMap<String, String>();
			p.put("userid", user.getId());
			p.put("rolename", role.getRoleName());
			p.put("unitid", user.getUnitId());
			System.out.println("�ɹ���½��");
			return JSON.toJSONString(p);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�������");
			return "null";
		}
	}
}
