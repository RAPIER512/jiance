package ccu.model.basicdata;

// Generated 2015-5-7 9:42:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;
import java.io.Serializable;

/**
 * 接口定义表
 */

@Entity
@Table(name = "InterfaceInfo")
public class InterfaceInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;//标识

	@Column(name = "MachineCode")
	private String machineCode;//设备编码

	@Column(name = "InterfaceName")
	private String interfaceName;//接口名称

	@Column(name = "InterfaceType")
	private String interfaceType;//接口类型

	@Column(name = "Port")
	private Integer port;//端口

	@Column(name = "SingnalName")
	private String singnalName;//信号名称

	@Column(name = "MaxValue")
	private Double maxValue;//上限

	@Column(name = "MainValue")
	private Double minValue;//下限

	@Column(name = "ReferenceValue")
	private Double referenceValue;//模拟量参考值

	@Column(name = "IsUsed")
	private Boolean isUsed;//是否可用


	@Column(name = "ExpressionKey")
	private String expressionKey;//公示关键字

	@Column(name = "OrderIndex")
	private Integer orderIndex;//排序序号

	@Column(name = "NomalValue")
	private Double nomalValue;//正常点平

	@Column(name = "NomalShowName")
	private String nomalShowName;//正常状态显示名

	@Column(name = "ExceptShowName")
	private String exceptShowName;//异常状态显示名

	@Column(name = "Unit")
	private String unit;//度量单位


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMachineCode() {
		return machineCode;
	}
	public void setMachineCode(String machineCode) {
		this.machineCode = machineCode;
	}
	public String getInterfaceName() {
		return interfaceName;
	}
	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}
	public String getInterfaceType() {
		return interfaceType;
	}
	public void setInterfaceType(String interfaceType) {
		this.interfaceType = interfaceType;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public String getSingnalName() {
		return singnalName;
	}
	public void setSingnalName(String singnalName) {
		this.singnalName = singnalName;
	}
	public Double getMaxValue() {
		return maxValue;
	}
	public void setMaxValue(Double maxValue) {
		this.maxValue = maxValue;
	}
	public Double getMinValue() {
		return minValue;
	}
	public void setMinValue(Double minValue) {
		this.minValue = minValue;
	}
	public Double getReferenceValue() {
		return referenceValue;
	}
	public void setReferenceValue(Double referenceValue) {
		this.referenceValue = referenceValue;
	}
	public boolean getIsUsed() {
		return isUsed;
	}
	public void setIsUsed(Boolean isUsed) {
		this.isUsed = isUsed;
	}
	public String getExpressionKey() {
		return expressionKey;
	}
	public void setExpressionKey(String expressionKey) {
		this.expressionKey = expressionKey;
	}
	public Integer getOrderIndex() {
		return orderIndex;
	}
	public void setOrderIndex(Integer orderIndex) {
		this.orderIndex = orderIndex;
	}
	public Double getNomalValue() {
		return nomalValue;
	}
	public void setNomalValue(Double nomalValue) {
		this.nomalValue = nomalValue;
	}
	public String getNomalShowName() {
		return nomalShowName;
	}
	public void setNomalShowName(String nomalShowName) {
		this.nomalShowName = nomalShowName;
	}
	public String getExceptShowName() {
		return exceptShowName;
	}
	public void setExceptShowName(String exceptShowName) {
		this.exceptShowName = exceptShowName;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}



}
