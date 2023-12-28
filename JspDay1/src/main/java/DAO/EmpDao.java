package DAO;

import java.io.PrintWriter;
import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.http.HttpServletResponse;

import DTO.EmpDtoo;

public class EmpDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("kranthi");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public EmpDtoo saveBoth(EmpDtoo emp) {

		et.begin();
		em.persist(emp);
		et.commit();
		return emp;

	}

	public EmpDtoo loginByUsingMail(String empEmail) {

		Query q = em.createQuery("select e from EmpDtoo e where e.empEmail=?1");
		try {
			q.setParameter(1, empEmail);
			EmpDtoo empEmail1 = (EmpDtoo) q.getSingleResult();
			return empEmail1;
		} catch (Exception e) {
			System.out.println("email not there");

		}
		return null;

	}

	public EmpDtoo loginByUsingPhno(long empPhno) {

		Query q = em.createQuery("select e from EmpDtoo e where e.empPhno=?1");
		q.setParameter(1, empPhno);
		try {
			EmpDtoo empPhno1 = (EmpDtoo) q.getSingleResult();
			return empPhno1;
		} catch (Exception e) {
			System.out.println("mobile number not present in the db");

		}
		return null;

	}

	public List<EmpDtoo> getAllEmp() {

		Query q = em.createQuery("Select e from EmpDtoo e ");
		List<EmpDtoo> employee = q.getResultList();

		return employee;

	}

	public EmpDtoo updateById(EmpDtoo empDtoo) {

		et.begin();
		em.merge(empDtoo);
		et.commit();

		return empDtoo;

	}

	public EmpDtoo getEmpById(int id) {
		return em.find(EmpDtoo.class, id);

	}

	public boolean deleteEmp(int id) {

		EmpDtoo empDtoo = em.find(EmpDtoo.class, id);

		if (empDtoo != null) {
			et.begin();
			em.remove(empDtoo);
			et.commit();
			return true;

		}
		return false;

	}

}