package ccu.model.auxiliaryinfo;

// Generated 2015-5-7 9:42:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * 消控室
 */
@Entity
@Table(name = "ControlRoomInfo")

public class ControlRoomInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;//标识


	@Column(name = "UnitId")
	private String unitId;//所属单位

	@Column(name = "ControlRoomCode")
	private String controlRoomCode;//消控室编号

	@Column(name = "ControlRoomName")
	private String controlRoomName;//消控室名称

	@Column(name = "CreateTime")
	private Date createTime;//建立时间

	@Column(name = "RoomAddr")
	private String roomAddr;//消控室所在地

	@Column(name = "HeadName")
	private String headName;//负责人

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getUnitId() {
		return unitId;
	}

	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}
	public String getControlRoomCode() {
		return controlRoomCode;
	}
	public void setControlRoomCode(String controlRoomCode) {
		this.controlRoomCode = controlRoomCode;
	}
	public String getControlRoomName() {
		return controlRoomName;
	}
	public void setControlRoomName(String controlRoomName) {
		this.controlRoomName = controlRoomName;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getRoomAddr() {
		return roomAddr;
	}
	public void setRoomAddr(String roomAddr) {
		this.roomAddr = roomAddr;
	}
	public String getHeadName() {
		return headName;
	}
	public void setHeadName(String headName) {
		this.headName = headName;
	}


}
