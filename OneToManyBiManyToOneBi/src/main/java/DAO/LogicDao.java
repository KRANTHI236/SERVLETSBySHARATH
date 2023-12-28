package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import DTO.RoomDto;
import DTO.ChairDto;

public class LogicDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("kranthi");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public void insertBoth(RoomDto classdto) {
		List<ChairDto> b = classdto.getChairdto();

		et.begin();
		em.persist(classdto);
		for (ChairDto c1 : b) {
			em.persist(c1);
//				em.persist(b);
		}
		et.commit();

	}

	public void fetchById(int classId) {
		RoomDto cd = em.find(RoomDto.class, classId);
		if (cd != null) {
			System.out.println(cd);

		} else {
			System.out.println("not found");
		}

	}

	public void fetchByAll() {
		Query q = em.createQuery("Select c from  ChairDto  c");
		List<ChairDto> b = q.getResultList();
		System.out.println(b);
	}

	public void updateBoth(int id, RoomDto cd) {
		RoomDto cd1 = em.find(RoomDto.class, id);
		if (cd1 != null) {
			cd1.setroomId(id);
			et.begin();
			List<ChairDto> list = cd1.getChairdto();
			for (ChairDto cd2 : list) {
				em.merge(cd2);
			}
			em.merge(cd1);
			et.commit();
		}
	}
}
