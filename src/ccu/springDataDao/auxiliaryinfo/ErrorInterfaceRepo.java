package ccu.springDataDao.auxiliaryinfo;

import org.springframework.data.jpa.repository.JpaRepository;

import ccu.model.auxiliaryinfo.ErrorInterface;
import ccu.model.system.LogInfo;

public interface ErrorInterfaceRepo extends JpaRepository<ErrorInterface,String> {

}
