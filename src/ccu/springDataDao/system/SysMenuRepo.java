package ccu.springDataDao.system;

import ccu.model.system.SysMenu;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Courage on 2015/11/3.
 */
public interface SysMenuRepo extends JpaRepository<SysMenu,String> {
}
