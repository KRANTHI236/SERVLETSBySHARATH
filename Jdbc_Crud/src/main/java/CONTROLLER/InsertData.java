package CONTROLLER;

import DAO.PersonDao;

public class InsertData {
	
	public static void main(String[] args) {
		PersonDao personDao=new PersonDao();
		personDao.insertPerson();
	}

}

