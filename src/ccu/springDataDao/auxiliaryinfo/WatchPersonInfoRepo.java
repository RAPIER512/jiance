package ccu.springDataDao.auxiliaryinfo;

import ccu.model.auxiliaryinfo.WatchPersonInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Courage on 2015/11/3.
 */
public interface WatchPersonInfoRepo extends JpaRepository<WatchPersonInfo,String> {
}
