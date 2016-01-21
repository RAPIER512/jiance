package ccu.springDataDao.system;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import ccu.model.system.UserReRole;

public interface UserReRoleRepo extends JpaRepository<UserReRole,String> {
	
	public List<UserReRole> findByUserId(String usre);

}
