package ccu.springDataDao.basicdata;

import java.util.List;

import ccu.model.basicdata.EventInfo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Courage on 2015/11/3.
 */
public interface EventInfoRepo extends JpaRepository<EventInfo,String> {
	
	
	/**
	 * 根据 单位Id 按月份查询火警总数
	 * @return
	 */
	//@Modifying
    @Transactional
    @Query(value="select COUNT(DISTINCT MachineCode) from EventInfo ev where ev.Unitid = ?1  and  ev.EventName like '%火警%' and datediff(month,ev.HappenTime,getdate())=0",nativeQuery = true)
	public Integer findTheSumOfFirEvent(String untiId);
	
//	@Modifying
//    @Transactional
//    @Query(value="select * from EventInfo ",nativeQuery = true)
//	public List findTheSumOfFirEvent(String untiId);
	
	/**
	 * 根据 单位Id 按月份查询故障总数
	 * @return
	 */
	//@Modifying
    @Transactional
    @Query(value = "select COUNT(DISTINCT MachineCode) from EventInfo ev where ev.Unitid = ?1  and (ev.EventName like '%故障%' or ev.EventName like '%丢失%' )and datediff(month,ev.HappenTime,getdate())=0",nativeQuery=true)
	public Integer findTheSumOfStop(String untiId);
	
	
//	@Modifying
//    @Transactional
//    @Query(value = "select * from EventInfo ",nativeQuery=true)
//	public List findTheSumOfStop(String untiId);
	
	/**
	 * 更具单位Id 查询时间的精简信息
	 */
	public List<EventInfo> findByUnitId(String unitid);
	
}
