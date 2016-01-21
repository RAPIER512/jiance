package ccu.model.auxiliaryinfo;

// Generated 2015-5-7 9:42:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;
import java.io.Serializable;


/**
 * 值班人员表
 */

@Entity
@Table(name = "WathcPersonInfo")

public class WatchPersonInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;//标识

	@Column(name = "UnitId")
	private String unitId;//所属单位

	@Column(name = "WatchPersonName")
	private String watchPersonName;//姓名

	@Column(name = "ContactTel")
	private String contactTel;//联系电话

	@Column(name = "PersonId")
	private String personId;//身份证

	@Column(name = "WorkCard")
	private String workCard;//上岗证


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

	public String getWatchPersonName() {
		return watchPersonName;
	}
	public void setWatchPersonName(String watchPersonName) {
		this.watchPersonName = watchPersonName;
	}
	public String getContactTel() {
		return contactTel;
	}
	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}
	public String getPersonId() {
		return personId;
	}
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	public String getWorkCard() {
		return workCard;
	}
	public void setWorkCard(String workCard) {
		this.workCard = workCard;
	}
}
