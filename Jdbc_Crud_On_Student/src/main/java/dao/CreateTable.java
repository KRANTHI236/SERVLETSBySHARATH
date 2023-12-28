package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateTable {
	
	public void creatingTable() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud_on_student","root","root");
			
			PreparedStatement ps=c.prepareStatement("CREATE TABLE Student(studentId int primary key,studentName varchar(45),studentAddress varchar(45),studentAge int)");
			
			ps.execute();
			
			c.close();
			
			System.out.println("table create successfully");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
