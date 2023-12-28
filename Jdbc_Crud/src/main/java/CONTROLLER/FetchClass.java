package CONTROLLER;

import DAO.PersonDao;

public class FetchClass {

	public static void main(String[] args) {

		PersonDao dao = new PersonDao();
		dao.fetchPerson();
	}

}
