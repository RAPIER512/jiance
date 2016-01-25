package ccu.model.system;

import java.io.Serializable;
import java.util.List;



public class MenuModel implements Serializable{
	//鐖惰彍鍗曞悕绉�
	private String pMenu;
	//鐖惰彍鍗曚笅鐨勫瓙鑿滃崟闆嗗悎
	private List<SysMenu> listMenu;
	private String icon;
	public String getPMenu() {
		return pMenu;
	}
	public void setPMenu(String pMenu) {
		this.pMenu = pMenu;
	}
	public List<SysMenu> getListMenu() {
		return listMenu;
	}
	public void setListMenu(List<SysMenu> listMenu) {
		this.listMenu = listMenu;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	
	
}
