package controller;

import java.util.ArrayList;
import java.util.List;

import dao.SchoolDao;
import dto.School;
import dto.Students;

public class updateBoth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		School school=new School();
		school.setSchoolName("narayana");
		school.setSchoolAddress("Hyderadad");
		school.setSchoolFees(100000);



		Students students1=new Students();
		students1.setStudentName("vengal");
		students1.setStudentAge(22);
		students1.setStudentDOB("2000");


		Students students2=new Students();
		students2.setStudentName("kiran");
		students2.setStudentAge(21);
		students2.setStudentDOB("2002");

		Students students3=new Students();
		students3.setStudentName("nitin");
		students3.setStudentAge(20);
		students3.setStudentDOB("2003");

		List<Students> list=new ArrayList<>();
		list.add(students1);
		list.add(students2);
		list.add(students3);
		 
		school.setStudents(list);
		SchoolDao schoolDao=new SchoolDao();
		schoolDao.updateBoth(3, school);

	}

}
