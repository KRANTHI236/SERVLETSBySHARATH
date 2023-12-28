package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dto.Person;
import Dto.PersonLogin;

public class Servlet_Class_For_Login extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("PersonUsername");
		String password = req.getParameter("PersonPassword");

		PersonLogin pl = new PersonLogin();
		pl.setPersonUsername(name);
		pl.setPersonPassword(password);
		
		resp.sendRedirect("https://www.youtube.com/");

	}

}
