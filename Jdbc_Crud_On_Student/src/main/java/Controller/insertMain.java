package Controller;

import dao.CreateTable;
import dao.InsertStudent;
import dto.Student;

public class insertMain {
	public static void main(String[] args) {
		
	Student student=new Student();
	student.setStudentName("kiran");
	student.setStudentAge(21);
	student.setStudentAddress("hyd");
	student.setStudentId(1);
		
InsertStudent insertStudent=new InsertStudent();

insertStudent.insert(student);

	}	
}
