package Dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Entity
@Component
public class Pancard {
	@Id
	@Value("3")
private int pancardId;
	@Value("Hk45REWr98")
private String pancardNo;
	@Value("GOK")
	private String pancardAuthority;
	public int getPancardId() {
		return pancardId;
	}
	public void setPancardId(int pancardId) {
		this.pancardId = pancardId;
	}
	public String getPancardNo() {
		return pancardNo;
	}
	public void setPancardNo(String pancardNo) {
		this.pancardNo = pancardNo;
	}
	public String getPancardAuthority() {
		return pancardAuthority;
	}
	public void setPancardAuthority(String pancardAuthority) {
		this.pancardAuthority = pancardAuthority;
	}
	@Override 
	public String toString() {
		return "Pancard [pancardId=" + pancardId + ", pancardNo=" + pancardNo + ", pancardAuthority=" + pancardAuthority
				+ "]";
	}
	
	
		

	
	

	}
