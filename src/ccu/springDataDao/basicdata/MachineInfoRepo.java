package ccu.springDataDao.basicdata;

import java.util.List;

import ccu.model.basicdata.MachineInfo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Courage on 2015/11/3.
 */
public interface MachineInfoRepo extends JpaRepository<MachineInfo,String> {
	
	
	public List<MachineInfo> findByUnitId(String id);
	
	public MachineInfo findByMachineCode(String machineCode);
}
