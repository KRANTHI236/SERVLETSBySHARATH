package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import Dto.Person;

@Component
public class Persondao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("kranthi");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void saveBoth(Person person) {
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
	}
	public void fetchById(int id) {
		Person dbperson=entityManager.find(Person.class, id);
		System.out.println(dbperson);
	}
	public void fetchAll() {
		Query query=entityManager.createQuery("select p from Person p");
		List<Person>list=query.getResultList();
		System.out.println(list);
	}
	public void delete(int id) {
		Person dbperson=entityManager.find(Person.class,id);
		if(dbperson!=null)
		{
			entityTransaction.begin();
		entityManager.remove(dbperson);
		entityTransaction.commit();
		}
	}
	public void update(int id,Person person) {
		Person dbperson=entityManager.find(Person.class, id);
		if(dbperson!=null)
		{
		 person.setPersonId(id);
			entityTransaction.begin();
			entityManager.merge(person);
			entityTransaction.commit();
		}
		
	}
}
