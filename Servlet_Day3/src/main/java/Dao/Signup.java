package Dao;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import Dto.Person;

public class Signup {

	static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("kranthi");
	static EntityManager entityManager = entityManagerFactory.createEntityManager();
	static EntityTransaction entityTransaction = entityManager.getTransaction();

	public static void insertRecords(Person p) {
		entityTransaction.begin();
		entityManager.persist(p);
		entityTransaction.commit();
	}

}
