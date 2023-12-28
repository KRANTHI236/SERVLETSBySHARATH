package Dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bag {
	@Id
	private int bagNumber;
	private String bagCompany;
	private double bagPrice;
	private String bagColour;

	@OneToMany

	private List<Books> book;

	public List<Books> getBook() {
		return book;
	}

	public void setBook(List<Books> book) {
		this.book = book;
	}

	public int getBagNumber() {
		return bagNumber;
	}

	public void setBagNumber(int bagNumber) {
		this.bagNumber = bagNumber;
	}

	public String getBagCompany() {
		return bagCompany;
	}

	public void setBagCompany(String bagCompany) {
		this.bagCompany = bagCompany;
	}

	public double getBagPrice() {
		return bagPrice;
	}

	public void setBagPrice(double bagPrice) {
		this.bagPrice = bagPrice;
	}

	public String getBagColour() {
		return bagColour;
	}

	public void setBagColour(String bagColour) {
		this.bagColour = bagColour;
	}

	@Override
	public String toString() {
		return "Bag [bagNumber=" + bagNumber + ", bagCompany=" + bagCompany + ", bagPrice=" + bagPrice + ", bagColour="
				+ bagColour +"]";
	}

}
