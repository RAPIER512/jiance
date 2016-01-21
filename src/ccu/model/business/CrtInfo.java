package ccu.model.business;

// Generated 2015-5-7 9:42:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;
import java.io.Serializable;


/**
 *CRT配置表
 */

@Entity
@Table(name = "CrtInfo")
public class CrtInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;//标识

	@Column(name = "UnitId")
	private String unitId;//所属单位

	@Column(name = "filePath")
	private String filePath;//文件地址

	@Column(name = "Description")
	private String description;//描述信息

	@Column(name = "FileType")
	private String fileType;//文件类型

	@Column(name = "IsUsed")
	private Boolean isUsed;//是否可用


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
//	public UnitInfo getUnitInfo() {
//		return unitInfo;
//	}
//	public void setUnitInfo(UnitInfo unitInfo) {
//		this.unitInfo = unitInfo;
//	}


	public String getUnitId() {
		return unitId;
	}

	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public Boolean getIsUsed() {
		return isUsed;
	}
	public void setIsUsed(Boolean isUsed) {
		this.isUsed = isUsed;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
