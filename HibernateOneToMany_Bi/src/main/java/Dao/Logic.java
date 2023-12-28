package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Dto.Bag;
import Dto.Books;

public class Logic {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("kranthi");
	static EntityManager em = emf.createEntityManager();
	static EntityTransaction et = em.getTransaction();

	public void insertBoth(Bag bag) {
		List<Books> b = bag.getBook();

		et.begin();
		em.persist(bag);
		for (Books books : b) {
			em.persist(books);
//			em.persist(b);
		}
		et.commit();

	}

	public void fetchById(int bagNumber) {
		Bag bag = em.find(Bag.class, bagNumber);
		System.out.println(bag);

	}

	public void fetchByAll() {
		Query q = em.createQuery("Select b from Books b ");
		List<Books> b = q.getResultList();
		System.out.println(b);
	}

	public void updateBoth(int id, Bag bag) {
		Bag dbbag = em.find(Bag.class, id);
		if (dbbag != null) {
			bag.setBagNumber(id);
			et.begin();
			List<Books> list = dbbag.getBook();
			for (Books book : list) {
				em.merge(book);
			}
			em.merge(bag);
			et.commit();
		}
	}
}
