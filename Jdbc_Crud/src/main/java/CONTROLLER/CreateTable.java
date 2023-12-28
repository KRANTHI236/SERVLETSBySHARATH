package CONTROLLER;

import DAO.PersonDao;

public class CreateTable {
	
	public static void main(String[] args) {
		PersonDao personDao=new  PersonDao();
		personDao.createPersonTable();
	}

}
