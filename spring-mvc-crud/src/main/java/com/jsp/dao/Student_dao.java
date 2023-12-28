package com.jsp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.jsp.dto.Student;

@Component
public class Student_dao {
	public Student saveStudent(Student student) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mani");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Student student2 = entityManager.find(Student.class, student.getId());
		if (student2 != null) {
			return null;
		} else {
			entityTransaction.begin();
			entityManager.persist(student);
			entityTransaction.commit();
			return student;
		}

	}

	public Student updateStudent(Student student) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mani");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Student student2 = entityManager.find(Student.class, student.getId());
		if (student2 != null) {
			entityTransaction.begin();
			student2.setId(student.getId());
			student2.setName(student.getName());
			student2.setAge(student.getAge());
			student2.setEmail(student.getEmail());
			student2.setPassword(student.getPassword());
			entityManager.merge(student2);
			entityTransaction.commit();
		}
		return student2;
	}

	public Student deleteStudent(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mani");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Student student = entityManager.find(Student.class, id);
		if (student != null) {
			entityTransaction.begin();
			entityManager.remove(student);
			entityTransaction.commit();
		}
		return student;
	}

	public Student getByIdStudent(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mani");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find(Student.class, id);
	}

	public List<Student> getAllStudent() {
		List<Student> list = new ArrayList<Student>();
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mani");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("select u from Student u");
		list = query.getResultList();
		return list;
	}
}
