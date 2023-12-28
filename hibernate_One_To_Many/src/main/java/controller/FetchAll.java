package controller;

import dao.SchoolDao;
import dto.School;

public class FetchAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SchoolDao schoolDao = new SchoolDao();
		schoolDao.fetchAll();
	}

}
