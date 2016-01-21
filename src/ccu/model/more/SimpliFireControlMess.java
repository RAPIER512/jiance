package ccu.model.more;

import java.io.Serializable;

public class SimpliFireControlMess implements Serializable{
	
	private String unitcode;
	private String unitname;
	private int evetcount;
	private int totlafailure;
	private double equipmentintegrityrate;
	
	private String unitId;
	
	public String getUnitcode() {
		return unitcode;
	}
	public void setUnitcode(String unitcode) {
		this.unitcode = unitcode;
	}
	public String getUnitname() {
		return unitname;
	}
	public void setUnitname(String unitname) {
		this.unitname = unitname;
	}
	public int getEvetcount() {
		return evetcount;
	}
	public void setEvetcount(int evetcount) {
		this.evetcount = evetcount;
	}
	public int getTotlafailure() {
		return totlafailure;
	}
	public void setTotlafailure(int totlafailure) {
		this.totlafailure = totlafailure;
	}
	public double getEquipmentintegrityrate() {
		return equipmentintegrityrate;
	}
	public void setEquipmentintegrityrate(double equipmentintegrityrate) {
		this.equipmentintegrityrate = equipmentintegrityrate;
	}
	public String getUnitId() {
		return unitId;
	}
	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}
	
	
	
}
