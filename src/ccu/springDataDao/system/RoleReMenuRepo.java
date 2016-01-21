package ccu.springDataDao.system;

import org.springframework.data.jpa.repository.JpaRepository;

import ccu.model.system.LogInfo;
import ccu.model.system.RoleReMenu;

public interface RoleReMenuRepo extends JpaRepository<RoleReMenu,String> {

}
