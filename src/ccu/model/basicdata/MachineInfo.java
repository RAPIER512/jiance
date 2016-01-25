 package ccu.model.basicdata;

// Generated 2015-5-7 9:42:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;
import java.io.Serializable;


/**
 * 璁惧琛�
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
	private String id;//鏍囪瘑

	@Column(name = "UnitId")
	private String unitId;//鎵�灞炲崟浣�

	@Column(name = "MachineCode")
	private String machineCode;//璁惧缂栧彿

	@Column(name = "MachineName")
	private String machineName;//璁惧鍚嶇О

	@Column(name = "MachineType")
	private String machineType;//璁惧绫诲瀷

	@Column(name = "MachineIndex")
	private Integer machineIndex;//璁惧搴忓彿

	@Column(name = "Maker")
	private String maker;//鍒堕�犲晢

	@Column(name = "MachineVersion")
	private String machineVersion;//璁惧鍨嬪彿

	@Column(name = "IsUsed")
	private Boolean isUsed;//鏄惁鍙敤

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
