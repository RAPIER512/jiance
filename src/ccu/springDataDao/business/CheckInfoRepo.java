package ccu.springDataDao.business;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Courage on 2015/11/3.
 */
public interface CheckInfoRepo extends JpaRepository<ccu.model.business.CheckInfo,String> {
}
