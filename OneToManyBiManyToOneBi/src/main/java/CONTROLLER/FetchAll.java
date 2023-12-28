package CONTROLLER;

import DAO.LogicDao;

public class FetchAll {
	public static void main(String[] args) {

		LogicDao lc = new LogicDao();
		lc.fetchByAll();
	}

}
