package ccu.springDataDao.business;

import ccu.model.business.CrtInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Courage on 2015/11/3.
 */
public interface CrtInfoRepo extends JpaRepository<CrtInfo,String> {
}
