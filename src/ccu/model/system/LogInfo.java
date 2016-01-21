package ccu.model.system;

// Generated 2015-5-7 9:42:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *系统日志
 */

@Entity
@Table(name = "LogInfo")
public class LogInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;//标识

	@Column(name = "UserId")
	private String userId;//登入人

	@Column(name = "LoginTime")
	private Date loginTime;//登录时间

	@Column(name = "MenuName")
	private String menuName;//操作菜单

	@Column(name = "OperateTime")
	private Date operateTime;//操作时间

	@Column(name = "ExceptionMess")
	private String exceptionMess;//异常信息

	@Column(name = "UserIp")
	private String userIp;//登录Ip


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
//	public UserInfo getUserInfo() {
//		return userInfo;
//	}
//	public void setUserInfo(UserInfo userInfo) {
//		this.userInfo = userInfo;
//	}


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public Date getOperateTime() {
		return operateTime;
	}
	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}
	public String getExceptionMess() {
		return exceptionMess;
	}
	public void setExceptionMess(String exceptionMess) {
		this.exceptionMess = exceptionMess;
	}
	public String getUserIp() {
		return userIp;
	}
	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}
}
