package ccu.service;

import ccu.model.system.UserInfo;

public interface UserInfoService {

	public UserInfo getUserByAccount(String account);
}
