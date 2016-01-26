package ccu.model.basicdata;

// Generated 2015-5-7 9:42:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;
import java.io.Serializable;


/**
 * 浜嬩欢琛�
 */

@Entity
@Table(name = "EventInfo")
public class EventInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;//鏍囪瘑

	@Column(name = "UnitId")
	private String unitId;//鎵�灞炲崟浣�

	@Column(name = "HandleUserId")
	private String handleUserId;//澶勭悊浜�

	@Column(name = "EventTypeId")
	private String eventTypeId;//浜嬩欢绫诲瀷ID

	@Column(name = "UnitName")
	private String unitName;//閮ㄩ棬鍚嶇О

	@Column(name = "UnitAddr")
	private String unitAddr;//閮ㄩ棬鍦板潃

	@Column(name = "ContactTel")
	private String contactTel;//鑱旂郴浜虹數璇�

	@Column(name = "MachineCode")
	private String machineCode;//璁惧缂栫爜

	@Column(name = "AlertMachine")
	private String alertMachine;//鎶ヨ璁惧

	@Column(name = "AlertSource")
	private String alertSource;//鎶ヨ婧�

	@Column(name = "AlertDescription")
	private String alertDescription;//鎻忚堪淇℃伅

	@Column(name = "HappenPlace")
	private String happenPlace;//鍙戠敓鍦扮偣

	@Column(name = "EventName")
	private String eventName;//浜嬩欢鍚嶇О

	@Column(name = "HappenTime")
	private String happenTime;//鍙戠敓鏃堕棿

	@Column(name = "EventDescription")
	private String eventDescription;//浜嬩欢璇存槑

	@Column(name = "HandleDescription")
	private String handleDescription;//澶勭悊璇存槑

	@Column(name = "HandleTime")
	private String handleTime;//澶勭悊鏃堕棿

	@Column(name = "IsHandle")
	private Boolean isHandle;//鏄惁澶勭悊

	@Column(name = "IsFalseReport")
	private Boolean isFalseReport;//鏄惁璇姤
	
	
	
	
	public EventInfo() {
		
	}
	
	public EventInfo(String unitId, String handleUserId, String eventTypeId,
			String unitName, String unitAddr, String contactTel,
			String machineCode, String alertMachine, String alertSource,
			String alertDescription, String happenPlace, String eventName,
			String happenTime, String eventDescription,
			String handleDescription, String handleTime, Boolean isHandle,
			Boolean isFalseReport) {
		this.unitId = unitId;
		this.handleUserId = handleUserId;
		this.eventTypeId = eventTypeId;
		this.unitName = unitName;
		this.unitAddr = unitAddr;
		this.contactTel = contactTel;
		this.machineCode = machineCode;
		this.alertMachine = alertMachine;
		this.alertSource = alertSource;
		this.alertDescription = alertDescription;
		this.happenPlace = happenPlace;
		this.eventName = eventName;
		this.happenTime = happenTime;
		this.eventDescription = eventDescription;
		this.handleDescription = handleDescription;
		this.handleTime = handleTime;
		this.isHandle = isHandle;
		this.isFalseReport = isFalseReport;
	}

	public EventInfo(String id, String unitId, String handleUserId,
			String eventTypeId, String unitName, String unitAddr,
			String contactTel, String machineCode, String alertMachine,
			String alertSource, String alertDescription, String happenPlace,
			String eventName, String happenTime, String eventDescription,
			String handleDescription, String handleTime, Boolean isHandle,
			Boolean isFalseReport) {
		this.id = id;
		this.unitId = unitId;
		this.handleUserId = handleUserId;
		this.eventTypeId = eventTypeId;
		this.unitName = unitName;
		this.unitAddr = unitAddr;
		this.contactTel = contactTel;
		this.machineCode = machineCode;
		this.alertMachine = alertMachine;
		this.alertSource = alertSource;
		this.alertDescription = alertDescription;
		this.happenPlace = happenPlace;
		this.eventName = eventName;
		this.happenTime = happenTime;
		this.eventDescription = eventDescription;
		this.handleDescription = handleDescription;
		this.handleTime = handleTime;
		this.isHandle = isHandle;
		this.isFalseReport = isFalseReport;
	}
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUnitId() {
		return unitId;
	}
	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}
	public String getHandleUserId() {
		return handleUserId;
	}
	public void setHandleUserId(String handleUserId) {
		this.handleUserId = handleUserId;
	}
	public String getEventTypeId() {
		return eventTypeId;
	}
	public void setEventTypeId(String eventTypeId) {
		this.eventTypeId = eventTypeId;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	public String getUnitAddr() {
		return unitAddr;
	}
	public void setUnitAddr(String unitAddr) {
		this.unitAddr = unitAddr;
	}
	public String getContactTel() {
		return contactTel;
	}
	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}
	public String getMachineCode() {
		return machineCode;
	}
	public void setMachineCode(String machineCode) {
		this.machineCode = machineCode;
	}
	public String getAlertMachine() {
		return alertMachine;
	}
	public void setAlertMachine(String alertMachine) {
		this.alertMachine = alertMachine;
	}
	public String getAlertSource() {
		return alertSource;
	}
	public void setAlertSource(String alertSource) {
		this.alertSource = alertSource;
	}
	public String getAlertDescription() {
		return alertDescription;
	}
	public void setAlertDescription(String alertDescription) {
		this.alertDescription = alertDescription;
	}
	public String getHappenPlace() {
		return happenPlace;
	}
	public void setHappenPlace(String happenPlace) {
		this.happenPlace = happenPlace;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getHappenTime() {
		return happenTime;
	}
	public void setHappenTime(String happenTime) {
		this.happenTime = happenTime;
	}
	public String getEventDescription() {
		return eventDescription;
	}
	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}
	public String getHandleDescription() {
		return handleDescription;
	}
	public void setHandleDescription(String handleDescription) {
		this.handleDescription = handleDescription;
	}
	public String getHandleTime() {
		return handleTime;
	}
	public void setHandleTime(String handleTime) {
		this.handleTime = handleTime;
	}
	public Boolean getIsHandle() {
		return isHandle;
	}
	public void setIsHandle(Boolean isHandle) {
		this.isHandle = isHandle;
	}
	public Boolean getIsFalseReport() {
		return isFalseReport;
	}
	public void setIsFalseReport(Boolean isFalseReport) {
		this.isFalseReport = isFalseReport;
	}
}
