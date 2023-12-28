package controller;

import dao.SchoolDao;

public class deleteSchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SchoolDao schoolDao = new SchoolDao();
		schoolDao.deleteSchool(2);
	}

}
