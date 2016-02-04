package ccu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ccu.model.system.UserInfo;
import ccu.springDataDao.system.UserInfoRepo;

@Service("userInfoService")
public class UserInfoServiceImp implements UserInfoService{

	@Autowired
	UserInfoRepo userInfoRepo;
	
	public UserInfo getUserByAccount(String account){
		return userInfoRepo.findByAccount(account);
	}
}
