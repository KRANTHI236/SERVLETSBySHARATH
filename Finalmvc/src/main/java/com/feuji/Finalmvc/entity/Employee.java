package com.feuji.Finalmvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.Max;
//import javax.validation.constraints.Min;
//import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.Pattern;
//import javax.validation.constraints.Size;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table(name = "employee_mvc")
public class Employee {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name")
	// @Size(min=1,message="required")
	// @NotEmpty(message = " is required")
	private String name;

	@Column(name = "age")
//	@Min(value=18, message="must be equal or greater than 18")  
//	@Max(value=45, message="must be equal or less than 45") 
//	@NotEmpty(message = "Age is required")
	private int age;
	@Column(name = "phone")
//	@Min(value = 10, message = "Minimum 10 charactors required")
//	@Max(value = 10, message = "Max 10 charactors required")
//	@NotEmpty(message = "Phone number is required")
//	@Pattern(regexp = "^[0-9A-Z]{10}", message = "Phone number is not valid")
	private long phone;

}
