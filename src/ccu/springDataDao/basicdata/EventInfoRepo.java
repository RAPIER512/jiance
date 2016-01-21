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
	 * ���� ��λId ���·ݲ�ѯ������
	 * @return
	 */
	//@Modifying
    @Transactional
    @Query(value="select COUNT(DISTINCT MachineCode) from EventInfo ev where ev.Unitid = ?1  and  ev.EventName like '%��%' and datediff(month,ev.HappenTime,getdate())=0",nativeQuery = true)
	public Integer findTheSumOfFirEvent(String untiId);
	
//	@Modifying
//    @Transactional
//    @Query(value="select * from EventInfo ",nativeQuery = true)
//	public List findTheSumOfFirEvent(String untiId);
	
	/**
	 * ���� ��λId ���·ݲ�ѯ��������
	 * @return
	 */
	//@Modifying
    @Transactional
    @Query(value = "select COUNT(DISTINCT MachineCode) from EventInfo ev where ev.Unitid = ?1  and (ev.EventName like '%����%' or ev.EventName like '%��ʧ%' )and datediff(month,ev.HappenTime,getdate())=0",nativeQuery=true)
	public Integer findTheSumOfStop(String untiId);
	
	
//	@Modifying
//    @Transactional
//    @Query(value = "select * from EventInfo ",nativeQuery=true)
//	public List findTheSumOfStop(String untiId);
	
	/**
	 * ���ߵ�λId ��ѯʱ��ľ�����Ϣ
	 */
	public List<EventInfo> findByUnitId(String unitid);
	
}
