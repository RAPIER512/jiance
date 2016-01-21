package ccu.model.system;

// Generated 2015-5-7 9:42:43 by Hibernate Tools 3.4.0.CR1

import ccu.model.basicdata.EventInfo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * 鐢ㄦ埛琛�
 */
@Entity
@Table(name = "UserInfo")
public class UserInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;//鏍囪瘑


	@Column(name = "UpdateUserId")
	private String updateUserId;//鏇存柊鐢ㄦ埛

	@Column(name = "UnitId")
	private String unitId;//鎵�灞炲崟浣�

	@Column(name = "createUserId")
	private String createUserId;//鍒涘缓鐢ㄦ埛

	@Column(name = "Account")
	private String account;//甯愬彿

	@Column(name = "Password")
	private String password;//瀵嗙爜

	@Column(name = "UserName")
	private String userName;//鐢ㄦ埛鍚�

	@Column(name = "UserTel")
	private String userTel;//鑱旂郴鐢佃瘽

	@Column(name = "UserMail")
	private String userMail;//鑱旂郴閭

	@Column(name = "CreateTime")
	private Date createTime;//鍒涘缓鏃堕棿

	@Column(name = "UpdateTime")
	private Date updateTime;//鏇存柊鏃堕棿

	@Column(name = "IsManager")
	private Boolean isManager;//鏄惁绠＄悊鍛�


//	private Set<EventInfo> eventInfos = new HashSet<EventInfo>();//浜嬩欢
//	private Set<LogInfo> logInfos = new HashSet<LogInfo>();//鏃ュ織

//	@Column(name = "")
//	private Role role;//


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
//	public UserInfo getUpdateUser() {
//		return UpdateUser;
//	}
//	public void setUpdateUser(UserInfo updateUser) {
//		UpdateUser = updateUser;
//	}
//	public UnitInfo getUnitInfo() {
//		return unitInfo;
//	}
//	public void setUnitInfo(UnitInfo unitInfo) {
//		this.unitInfo = unitInfo;
//	}
//	public UserInfo getCreateUser() {
//		return CreateUser;
//	}
//	public void setCreateUser(UserInfo createUser) {
//		CreateUser = createUser;
//	}


	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public String getUnitId() {
		return unitId;
	}

	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

	public String getUpdateUserId() {
		return updateUserId;
	}

	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}

	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserTel() {
		return userTel;
	}
	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Boolean getIsManager() {
		return isManager;
	}
	public void setIsManager(Boolean isManager) {
		this.isManager = isManager;
	}
//	public Set<EventInfo> getEventInfos() {
//		return eventInfos;
//	}
//	public void setEventInfos(Set<EventInfo> eventInfos) {
//		this.eventInfos = eventInfos;
//	}
//	public Set<LogInfo> getLogInfos() {
//		return logInfos;
//	}
//	public void setLogInfos(Set<LogInfo> logInfos) {
//		this.logInfos = logInfos;
//	}
//	public Role getRole() {
//		return role;
//	}
//	public void setRole(Role role) {
//		this.role = role;
//	}



}
