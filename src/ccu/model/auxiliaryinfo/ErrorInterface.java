package ccu.model.auxiliaryinfo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "ErrorInterface")
public class ErrorInterface implements Serializable{
	
	@Id
    @GeneratedValue(generator = "paymentableGenerator")
    @GenericGenerator(name = "paymentableGenerator",strategy = "guid")
	private String id;
	
	@Column(name ="EventId")
	private String eventId;
	
	@Column(name ="ErroPort")
	private String errorPort;
	
	@Column(name = "ErrorValue")
	private String errorValue;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getErrorPort() {
		return errorPort;
	}

	public void setErrorPort(String errorPort) {
		this.errorPort = errorPort;
	}

	public String getErrorValue() {
		return errorValue;
	}

	public void setErrorValue(String errorValue) {
		this.errorValue = errorValue;
	}
	
	

}
