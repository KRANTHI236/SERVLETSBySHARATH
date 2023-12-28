package com.jsp.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.jsp.dao.Student_dao;
import com.jsp.dto.Student;

@Component
public class Student_Service {
	Student_dao dao = new Student_dao();

	public Student saveService(Student student) {
		return dao.saveStudent(student);
	}

	public Student updateService(Student student) {
		return dao.updateStudent(student);
	}

	public Student deleteService(int id) {
		return dao.deleteStudent(id);
	}

	public Student getByIdService(int id) {
		return dao.getByIdStudent(id);
	}

	public List<Student> getAllService() {
		return dao.getAllStudent();
	}
}
