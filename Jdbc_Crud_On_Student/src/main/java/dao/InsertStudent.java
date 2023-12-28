package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dto.Student;

public class InsertStudent {
	
	public void insert(Student student) 
	{
  try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud_on_student", "root","root");
	PreparedStatement ps=c.prepareStatement("insert into Student values(?,?,?,?)");
	ps.setInt(1, student.getStudentId());
	ps.setString(2,student.getStudentName() );
	ps.setString(3, student.getStudentAddress());
	ps.setInt(4, student.getStudentAge());
	ps.execute();
	c.close();
	System.out.println("insert succesful");
} catch (ClassNotFoundException | SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  
	}

}
