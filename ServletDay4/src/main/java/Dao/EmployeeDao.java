package Dao;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Dto.Employee;

public class EmployeeDao {
	static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("kranthi");
	static EntityManager entityManager = entityManagerFactory.createEntityManager();
	static EntityTransaction entityTransaction = entityManager.getTransaction();

	public static void saveEmp(Employee emp) {
		entityTransaction.begin();
		entityManager.persist(emp);
		entityTransaction.commit();
	}

	public Employee login(String empEmail) {

		javax.persistence.Query q = entityManager.createQuery("select e from Employee e where e.empEmail=?1");
		q.setParameter(1, empEmail);
		Employee empEmail1 = (Employee) q.getSingleResult();
		return empEmail1;

	}

}
