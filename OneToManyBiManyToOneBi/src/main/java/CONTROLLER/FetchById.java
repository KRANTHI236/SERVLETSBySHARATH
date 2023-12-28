package CONTROLLER;

import DAO.LogicDao;

public class FetchById {
	public static void main(String[] args) {

		LogicDao lc = new LogicDao();
		lc.fetchById(1);
	}

}
