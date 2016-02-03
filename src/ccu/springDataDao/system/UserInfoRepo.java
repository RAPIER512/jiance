package ccu.springDataDao.system;

import ccu.model.system.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Courage on 2015/11/3.
 */
public interface UserInfoRepo extends JpaRepository<UserInfo,String> {
	
	//����Account, Password��ѯ�ȹ���Ϣ
    public UserInfo findByAccountAndPassword(String account,String password);
    
    public UserInfo findByAccount(String account);
}
