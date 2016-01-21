package ccu.springDataDao.system;

import ccu.model.system.MenuModel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Courage on 2015/11/3.
 */
public interface MenuModelRepo extends JpaRepository<MenuModel,String> {
}
