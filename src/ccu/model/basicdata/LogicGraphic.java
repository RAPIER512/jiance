package ccu.model.basicdata;

// Generated 2015-5-7 9:42:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;
import java.io.Serializable;


/**
 * 逻辑图
 */
@Entity
@Table(name = "LogicGraphic")

public class LogicGraphic implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;//标识

	@Column(name = "EventType")
	private EventType eventType;//所属事件类型

	@Column(name = "IsUsed")
	private Boolean isUsed;//是否可用

	@Column(name = "Result")
	private Boolean result;//计算结果

	@Column(name = "Expression")
	private String expression;//公式

	@Column(name = "GraphicName")
	private String graphicName;//逻辑图名称


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public EventType getEventType() {
		return eventType;
	}
	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}
	public Boolean getIsUsed() {
		return isUsed;
	}
	public void setIsUsed(Boolean isUsed) {
		this.isUsed = isUsed;
	}
	public Boolean getResult() {
		return result;
	}
	public void setResult(Boolean result) {
		this.result = result;
	}
	public String getExpression() {
		return expression;
	}
	public void setExpression(String expression) {
		this.expression = expression;
	}
	public String getGraphicName() {
		return graphicName;
	}
	public void setGraphicName(String graphicName) {
		this.graphicName = graphicName;
	}
}
