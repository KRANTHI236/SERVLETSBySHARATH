package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import Dao.Signup;
import Dto.Person;

public class Servlet_Class_For_Signup extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("Pid"));
		String name = req.getParameter("PersonName");
		String address = req.getParameter("PersonAddress");
		long phone = Long.parseLong(req.getParameter("PersonPhno"));
		String email = req.getParameter("PersonEmail");
		String password = req.getParameter("PersonPassword");

//		PrintWriter printWriter = res.getWriter();
//		printWriter.println("personId"+id+" "+"personName"+name+" "+"personAddress"+address+" "+"personEmail"+email+" "+
//		"personphone"+phone+" "+"personPassword"+password);

		Person person = new Person();
//		person.setPid(id);
		person.setPersonName(name);
		person.setPersonAddress(address);
		person.setPersonEmail(email);
		person.setPersonPhno(phone);
		person.setPersonPassword(password);

		Signup.insertRecords(person);

		RequestDispatcher rd = req.getRequestDispatcher("Login.html");
		rd.forward(req, res);

//		PrintWriter printWriter = res.getWriter();
//		printWriter.println("personId: " + id + "\n " + "personName: " + name + "\n " + "personAddress: " + address
//				+ "\n " + "personEmail: " + email + " \n" + "personphone: " + phone + " \n" + "personPassword: "
//				+ password + "\n" + "data inserted successfully");

	}

}
