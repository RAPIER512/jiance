package ccu.model.auxiliaryinfo;

// Generated 2015-5-7 9:42:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 *入驻单位
 */

@Entity
@Table(name = "EnterUnitInfo")
public class EnterUnitInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;//标识


	@Column(name = "UnitId")
	private String unitId;//所属单位

	@Column(name = "CompanyName")
	private String companyName;//公司名称

	@Column(name = "EnterTime")
	private Date enterTime;//入驻时间

	@Column(name = "LegalPersonName")
	private String legalPersonName;//法人

	@Column(name = "LegalPersonTel")
	private String legalPersonTel;//电话


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

	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Date getEnterTime() {
		return enterTime;
	}
	public void setEnterTime(Date enterTime) {
		this.enterTime = enterTime;
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
}
