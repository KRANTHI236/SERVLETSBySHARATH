package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import DTO.CustomerDto;

public class CustomerDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("kranthi");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public void insertCustomer(CustomerDto customerDto) {

		et.begin();
		em.persist(customerDto);
		et.commit();

	}

	public CustomerDto loginByEmail(String customerEmail) {

		Query q = em.createQuery("select c from CustomerDto c where c.customerEmail=?1 ");
		try {
			q.setParameter(1, customerEmail);
			CustomerDto customerDto = (CustomerDto) q.getSingleResult();

			return customerDto;
		} catch (Exception e) {
			System.out.println("invalid data");
		}
		return null;
	}
}
