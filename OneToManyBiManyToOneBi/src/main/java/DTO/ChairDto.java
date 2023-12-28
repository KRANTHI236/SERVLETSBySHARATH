package DTO;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ChairDto {
	@Id
	private int chairId;
	private String chairCompany;
	private String chairColour;

	@ManyToOne

	public int getChairId() {
		return chairId;
	}

	public void setChairId(int chairId) {
		this.chairId = chairId;
	}

	public String getChairCompany() {
		return chairCompany;
	}

	public void setChairCompany(String chairCompany) {
		this.chairCompany = chairCompany;
	}

	public String getChairColour() {
		return chairColour;
	}

	public void setChairColour(String chairColour) {
		this.chairColour = chairColour;
	}

	@Override
	public String toString() {
		return "ChairDto [chairId=" + chairId + ", chairCompany=" + chairCompany + ", chairColour=" + chairColour + "]";
	}

}
