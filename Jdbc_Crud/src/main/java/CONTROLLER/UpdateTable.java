package CONTROLLER;

import DAO.PersonDao;

public class UpdateTable {
	public static void main(String[] args) {

		PersonDao personDao = new PersonDao();
		personDao.updatePerson();
	}

}
