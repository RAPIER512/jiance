package ccu.model.basicdata;

// Generated 2015-5-7 9:42:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


/**
 * 浜嬩欢绫诲瀷
 */

@Entity
@Table(name = "EventType")
public class EventType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private String id;//鏍囪瘑

	@Column(name = "UnitId")
	private String unitId;//鎵�灞炵ぞ鍖�

	@Column(name = "TypeName")
	private String typeName;//绫诲瀷鍚嶇О



	@Column(name = "GetID")
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

	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	

}
