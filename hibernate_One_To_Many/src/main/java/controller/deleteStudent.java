package controller;

import dao.SchoolDao;

public class deleteStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SchoolDao schoolDao = new SchoolDao();
		schoolDao.deleteStudent(6);
	}

}
