package ccu.springDataDao.basicdata;

import ccu.model.basicdata.UnitInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Courage on 2015/11/3.
 */
public interface UnitInfoRepo extends JpaRepository<UnitInfo,String> {
}
