package ccu.model.basicdata;

// Generated 2015-5-7 9:42:43 by Hibernate Tools 3.4.0.CR1

import ccu.model.auxiliaryinfo.ControlRoomInfo;
import ccu.model.auxiliaryinfo.EnterUnitInfo;
import ccu.model.auxiliaryinfo.WatchPersonInfo;
import ccu.model.business.CheckInfo;
import ccu.model.business.CrtInfo;
import ccu.model.business.VideoInfo;
import ccu.model.system.UserInfo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;



/**
 *鍗曚綅琛�
 */

@Entity
@Table(name = "UnitInfo")
public class UnitInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;//鏍囪瘑

	@Column(name = "UpdateUserId")
	private UserInfo updateUser;//鏇存柊浜�
	
	@Column(name = "UnitCode")
	private String unitCode;//鍗曚綅缂栧彿

	@Column(name = "UnitName")
	private String unitName;//鍗曚綅鍚嶇О

	@Column(name = "UnitAddr")
	private String unitAddr;//鍗曚綅鍦板潃

	@Column(name = "Organization")
	private String organization;//缁勭粐鏈烘瀯

	@Column(name = "EnterpriseType")
	private String enterpriseType;//浼佷笟绫诲瀷

	@Column(name = "UnitType")
	private String unitType;//鍗曚綅绫诲瀷

	@Column(name = "ContactsName")
	private String contactsName;//鑱旂郴浜哄鍚�

	@Column(name = "ContactsTel")
	private String contactsTel;//鑱旂郴浜虹數璇�

	@Column(name = "ContactsMail")
	private String contactsMail;//鑱旂郴浜洪偖绠�

	@Column(name = "Coordinate")
	private String coordinate;//鍦扮悊浣嶇疆

	@Column(name = "ManageName")
	private String manageName;//绠＄悊浜哄鍚�

	@Column(name = "ManageTel")
	private String manageTel;//绠＄悊浜虹數璇�

	@Column(name = "JoinTime")
	private Date joinTime;//鍏ョ綉鏃堕棿

	@Column(name = "NodeNum")
	private String nodeNum;//鎬昏妭鐐规暟

	@Column(name = "ISRemove")
	private Boolean isRemove;//鏄惁鎺掗櫎

	@Column(name = "UpdateTime")
	private Date updateTime;//鏇存柊鏃堕棿

	@Column(name = "LegalPersonName")
	private String legalPersonName;//娉曚汉

	@Column(name = "LegalPersonTel")
	private String legalPersonTel;//娉曚汉鐢佃瘽

	@Column(name = "HeadName")
	private String headName;//璐ｄ换浜�

	@Column(name = "HeadTel")
	private String headTel;//璐ｄ换浜虹數璇�

	@Column(name = "CalledUnitId")
	private UnitInfo calledUnit; //鎺ヨ鍗曚綅

	@Column(name = "MonitoringUnitId")
	private UnitInfo monitoringUnitId;//鐩戞帶鍗曚綅


	//private Set<UnitInfo> socialUnits = new HashSet<UnitInfo>();//绀句細鍗曚綅
	//private Set<CrtInfo> crtInfos = new HashSet<CrtInfo>();//CRT
	//private Set<WatchPersonInfo> watchPersonInfos = new HashSet<WatchPersonInfo>();//鍊肩彮浜哄憳
	//private Set<EnterUnitInfo> enterUnitInfos = new HashSet<EnterUnitInfo>();//鍏ラ┗鍗曚綅
	//private Set<UserInfo> userInfos = new HashSet<UserInfo>();//鐢ㄦ埛
	//private Set<CheckInfo> checkInfos = new HashSet<CheckInfo>();//鏌ュ矖
	//private Set<EventInfo> eventInfos = new HashSet<EventInfo>();//浜嬩欢
	//private Set<EventType> eventTypes = new HashSet<EventType>();//浜嬩欢绫诲瀷
	//private Set<VideoInfo> videoInfos = new HashSet<VideoInfo>();//鐩戞帶瑙嗛
	//private Set<ControlRoomInfo> controlRoomInfos = new HashSet<ControlRoomInfo>();//娑堟帶瀹�
	//private Set<MachineInfo> machineInfos = new HashSet<MachineInfo>();//璁惧 

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUnitCode() {
		return unitCode;
	}
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
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
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getEnterpriseType() {
		return enterpriseType;
	}
	public void setEnterpriseType(String enterpriseType) {
		this.enterpriseType = enterpriseType;
	}

	public String getContactsName() {
		return contactsName;
	}
	public void setContactsName(String contactsName) {
		this.contactsName = contactsName;
	}
	public String getContactsTel() {
		return contactsTel;
	}
	public void setContactsTel(String contactsTel) {
		this.contactsTel = contactsTel;
	}
	public String getContactsMail() {
		return contactsMail;
	}
	public void setContactsMail(String contactsMail) {
		this.contactsMail = contactsMail;
	}
	public String getCoordinate() {
		return coordinate;
	}
	public void setCoordinate(String coordinate) {
		this.coordinate = coordinate;
	}
	public String getManageName() {
		return manageName;
	}
	public void setManageName(String manageName) {
		this.manageName = manageName;
	}
	public String getManageTel() {
		return manageTel;
	}
	public void setManageTel(String manageTel) {
		this.manageTel = manageTel;
	}
	public Date getJoinTime() {
		return joinTime;
	}
	public void setJoinTime(Date joinTime) {
		this.joinTime = joinTime;
	}
	public String getNodeNum() {
		return nodeNum;
	}
	public void setNodeNum(String nodeNum) {
		this.nodeNum = nodeNum;
	}
	public Boolean getIsRemove() {
		return isRemove;
	}
	public void setIsRemove(Boolean isRemove) {
		this.isRemove = isRemove;
	}

	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getLegalPersonName() {
		return legalPersonName;
	}
	public void setLegalPersonName(String legalPersonName) {
		this.legalPersonName = legalPersonName;
	}
	public String getLegalPersonTel() {
		return legalPersonTel;
	}
	public void setLegalPersonTel(String legalPersonTel) {
		this.legalPersonTel = legalPersonTel;
	}
	public String getHeadName() {
		return headName;
	}
	public void setHeadName(String headName) {
		this.headName = headName;
	}
	public String getHeadTel() {
		return headTel;
	}
	public void setHeadTel(String headTel) {
		this.headTel = headTel;
	}
//	public Set<CrtInfo> getCrtInfos() {
//		return crtInfos;
//	}
//	public void setCrtInfos(Set<CrtInfo> crtInfos) {
//		this.crtInfos = crtInfos;
//	}
//	public Set<WatchPersonInfo> getWatchPersonInfos() {
//		return watchPersonInfos;
//	}
//	public void setWatchPersonInfos(Set<WatchPersonInfo> watchPersonInfos) {
//		this.watchPersonInfos = watchPersonInfos;
//	}
//	public Set<EnterUnitInfo> getEnterUnitInfos() {
//		return enterUnitInfos;
//	}
//	public void setEnterUnitInfos(Set<EnterUnitInfo> enterUnitInfos) {
//		this.enterUnitInfos = enterUnitInfos;
//	}
//	public Set<UserInfo> getUserInfos() {
//		return userInfos;
//	}
//	public void setUserInfos(Set<UserInfo> userInfos) {
//		this.userInfos = userInfos;
//	}
//	public Set<CheckInfo> getCheckInfos() {
//		return checkInfos;
//	}
//	public void setCheckInfos(Set<CheckInfo> checkInfos) {
//		this.checkInfos = checkInfos;
//	}
//	public Set<EventInfo> getEventInfos() {
//		return eventInfos;
//	}
//	public void setEventInfos(Set<EventInfo> eventInfos) {
//		this.eventInfos = eventInfos;
//	}
//	public Set<EventType> getEventTypes() {
//		return eventTypes;
//	}
//	public void setEventTypes(Set<EventType> eventTypes) {
//		this.eventTypes = eventTypes;
//	}
//	public Set<VideoInfo> getVideoInfos() {
//		return videoInfos;
//	}
//	public void setVideoInfos(Set<VideoInfo> videoInfos) {
//		this.videoInfos = videoInfos;
//	}
//	public Set<ControlRoomInfo> getControlRoomInfos() {
//		return controlRoomInfos;
//	}
//	public void setControlRoomInfos(Set<ControlRoomInfo> controlRoomInfos) {
//		this.controlRoomInfos = controlRoomInfos;
//	}
//	public Set<MachineInfo> getMachineInfos() {
//		return machineInfos;
//	}
//	public void setMachineInfos(Set<MachineInfo> machineInfos) {
//		this.machineInfos = machineInfos;
//	}
	public UserInfo getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(UserInfo updateUser) {
		this.updateUser = updateUser;
	}

	public UnitInfo getCalledUnit() {
		return calledUnit;
	}
	public void setCalledUnit(UnitInfo calledUnit) {
		this.calledUnit = calledUnit;
	}
	
	public UnitInfo getMonitoringUnitId() {
		return monitoringUnitId;
	}
	public void setMonitoringUnitId(UnitInfo monitoringUnitId) {
		this.monitoringUnitId = monitoringUnitId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	//	public Set<UnitInfo> getSocialUnits() {
//		return socialUnits;
//	}
//	public void setSocialUnits(Set<UnitInfo> socialUnits) {
//		this.socialUnits = socialUnits;
//	}
	public String getUnitType() {
		return unitType;
	}
	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}


}
