package spring_with_hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring_with_hibernate.dto.Employee;

@Component
public class EmployeeDao {

	@Autowired
	public EntityManager entityManager;

	public void saveEmployee(Employee employee) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}

	public void updateEmployee(int id, String name) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Employee employee = entityManager.find(Employee.class, id);
		if (employee != null) {
			employee.setName(name);
			entityTransaction.begin();
			entityManager.persist(employee);
			entityTransaction.commit();
			System.out.println("updated successfully");
		} else {
			System.out.println("wrong details");
		}
	}

	public void deleteEmployee(int id) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Employee employee = entityManager.find(Employee.class, id);
		if (employee != null) {
			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();
			System.out.println("removed successfully");
		} else {
			System.out.println("not removed ");
		}
	}

	public void fetchById(int id) {
		Employee employee = entityManager.find(Employee.class, id);
		System.out.println(employee);
	}

	public void fetchAll() {
		Query query = entityManager.createQuery("select e from Employee e");
		List<Employee> list = query.getResultList();
		System.out.println(list);
	}
}
