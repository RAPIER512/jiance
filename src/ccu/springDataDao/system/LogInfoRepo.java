package ccu.springDataDao.system;

import ccu.model.system.LogInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Courage on 2015/11/3.
 */
public interface LogInfoRepo extends JpaRepository<LogInfo,String> {
}
