package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import DTO.StudentDto;

public class StudentDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("kranthi");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public void saveStudent(StudentDto studentDto) {

		et.begin();
		em.persist(studentDto);
		et.commit();
	}

	public StudentDto fetchStudent(int id) {

		StudentDto studentDto = em.find(StudentDto.class, id);

		return studentDto;

	}

}
