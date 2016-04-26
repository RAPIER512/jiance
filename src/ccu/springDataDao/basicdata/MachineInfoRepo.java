package ccu.springDataDao.basicdata;

import java.util.List;

import ccu.model.basicdata.MachineInfo;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by Courage on 2015/11/3.JpaSpecificationExecutor
 */
public interface MachineInfoRepo extends JpaRepository<MachineInfo,String> ,JpaSpecificationExecutor<MachineInfo>{
	
	
	public List<MachineInfo> findByUnitId(String id);
	
	public MachineInfo findByMachineCode(String machineCode);
	
	
}
