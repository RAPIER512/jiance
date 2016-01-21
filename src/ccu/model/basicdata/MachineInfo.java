package ccu.model.basicdata;

// Generated 2015-5-7 9:42:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;
import java.io.Serializable;


/**
 * 设备表
 */

@Entity
@Table(name = "MachineInfo")
public class MachineInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;//标识

	@Column(name = "UnitId")
	private String unitId;//所属单位

	@Column(name = "MachineCode")
	private String machineCode;//设备编号

	@Column(name = "MachineName")
	private String machineName;//设备名称

	@Column(name = "MachineType")
	private String machineType;//设备类型

	@Column(name = "MachineIndex")
	private Integer machineIndex;//设备序号

	@Column(name = "Maker")
	private String maker;//制造商

	@Column(name = "MachineVersion")
	private String machineVersion;//设备型号

	@Column(name = "IsUsed")
	private Boolean isUsed;//是否可用

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

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getMachineCode() {
		return machineCode;
	}
	public void setMachineCode(String machineCode) {
		this.machineCode = machineCode;
	}
	public String getMachineName() {
		return machineName;
	}
	public void setMachineName(String machineName) {
		this.machineName = machineName;
	}
	public String getMachineType() {
		return machineType;
	}
	public void setMachineType(String machineType) {
		this.machineType = machineType;
	}
	public Integer getMachineIndex() {
		return machineIndex;
	}
	public void setMachineIndex(Integer machineIndex) {
		this.machineIndex = machineIndex;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getMachineVersion() {
		return machineVersion;
	}
	public void setMachineVersion(String machineVersion) {
		this.machineVersion = machineVersion;
	}
	public Boolean getIsUsed() {
		return isUsed;
	}
	public void setIsUsed(Boolean isUsed) {
		this.isUsed = isUsed;
	}
}
