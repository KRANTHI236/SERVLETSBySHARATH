package CONTROLLER;

import DAO.PersonDao;

public class DeleteClass {
	public static void main(String[] args) {

		PersonDao pd = new PersonDao();

		pd.deleteRecord();

	}
}
