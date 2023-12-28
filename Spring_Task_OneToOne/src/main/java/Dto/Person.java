package Dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Entity
@Component
public class Person {
	@Id
	@Value("3")
	private int personId;
	@Value("kranthi")
	private String personName;
	@Value("Delhi")
	private String personAddress;
	@Value("23")
	private int personAge;
	@OneToOne(cascade = CascadeType.ALL)
	@Autowired
	private Pancard pancard;

	public int getPersonId() {
		return personId;
	}

	public String getPersonName() {
		return personName;
	}

	public String getPersonAddress() {
		return personAddress;
	}

	public int getPersonAge() {
		return personAge;
	}

	public Pancard getPancard() {
		return pancard;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personAddress=" + personAddress
				+ ", personAge=" + personAge + ", pancard=" + pancard + "]";
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	public void setPancard(Pancard pancard) {
		this.pancard = pancard;
	}
	
}
