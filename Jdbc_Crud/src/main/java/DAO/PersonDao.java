package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import DTO.Person;

public class PersonDao {

	static Scanner sc = new Scanner(System.in);

	public void createPersonTable() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud", "root", "root");
			Statement s = c.createStatement();
			s.execute("create table PersonTable (pid int primary key,pname varchar(40),page int,paddress varchar(40))");
			System.out.println("table created successfully");
			c.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	public void insertPerson() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud", "root", "root");

			boolean result = true;

			while (result) {

				PreparedStatement ps = c.prepareStatement("insert into persontable values(?,?,?,?)");

				System.out.println("enter the id");
				int id = sc.nextInt();
				ps.setInt(1, id);

				System.out.println("enter the pname");
				String name = sc.next();
				ps.setString(2, name);

				System.out.println("enter the page");
				int age = sc.nextInt();
				ps.setInt(3, age);

				System.out.println("enter the paddress");
				String address = sc.next();
				ps.setString(4, address);

				System.out.println("do you want to add next row");
				char ch = sc.next().charAt(0);

				switch (ch) {
				case 'Y':
					result = true;

				}
				switch (ch) {
				case 'N':
					result = false;
				}
				ps.execute();
			}
			c.close();

		}

		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	public void updatePerson() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud", "root", "root");
			boolean result = true;

			while (result) {

				PreparedStatement ps = c.prepareStatement("update   persontable set pname=?,page=? where pid=?");

				System.out.println("enter the pname");
				String name = sc.next();
				ps.setString(1, name);

				System.out.println("enter the page");
				int age = sc.nextInt();
				ps.setInt(2, age);

				System.out.println("enter the id");
				int id = sc.nextInt();
				ps.setInt(3, id);

				System.out.println("do you want to update next row");
				char ch = sc.next().charAt(0);

				switch (ch) {
				case 'Y':
					result = true;

				}
				switch (ch) {
				case 'N':
					result = false;
				}
				ps.execute();
			}
			c.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	public void deleteRecord() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud", "root", "root");
			PreparedStatement ps = c.prepareStatement("DELETE FROM  persontable  WHERE pid=?");
			boolean b = true;

			while (b) {

				System.out.println("enter the id");
				int n = sc.nextInt();
				ps.setInt(1, n);

				System.out.println("do u want another row");
				char ch = sc.next().charAt(0);

				switch (ch) {
				case 'Y': {
					b = true;

					break;
				}
				}
				switch (ch) {
				case 'N': {
					b = false;

					break;
				}
				}
			}
			ps.executeUpdate();

			c.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	public void fetchPerson() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud", "root", "root");
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery("select * from persontable ");
			
			c.close();

//			if (rs.next()) {
//				int id = rs.getInt(1);
//
//			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
