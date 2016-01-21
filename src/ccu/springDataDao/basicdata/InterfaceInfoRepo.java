package ccu.springDataDao.basicdata;

import ccu.model.basicdata.InterfaceInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Courage on 2015/11/3.
 */
public interface InterfaceInfoRepo extends JpaRepository<InterfaceInfo,String> {
}
