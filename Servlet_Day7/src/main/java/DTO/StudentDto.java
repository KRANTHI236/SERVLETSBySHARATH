package DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stuId;
	private String stuName;
	private String stuFatherName;
	private String stuMotherName;
	private String stuEmail;
	private String stuPassword;
	private double studentFee;
	private String stuSchool;

	public double getStudentFee() {
		return studentFee;
	}

	public void setStudentFee(double studentFee) {
		this.studentFee = studentFee;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuFatherName() {
		return stuFatherName;
	}

	public void setStuFatherName(String stuFatherName) {
		this.stuFatherName = stuFatherName;
	}

	public String getStuMotherName() {
		return stuMotherName;
	}

	public void setStuMotherName(String stuMotherName) {
		this.stuMotherName = stuMotherName;
	}

	public String getStuEmail() {
		return stuEmail;
	}

	public void setStuEmail(String stuEmail) {
		this.stuEmail = stuEmail;
	}

	public String getStuPassword() {
		return stuPassword;
	}

	public void setStuPassword(String stuPassword) {
		this.stuPassword = stuPassword;
	}

	public String getStuSchool() {
		return stuSchool;
	}

	public void setStuSchool(String stuSchool) {
		this.stuSchool = stuSchool;
	}

}
