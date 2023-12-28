package CONTROLLER;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CustomerDao;
import DTO.CustomerDto;

@WebServlet("/signin")
public class Signin extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String customerEmail = req.getParameter("cemail");
		String pwd = req.getParameter("cpassword");

		CustomerDao customerDao = new CustomerDao();
		CustomerDto cd = customerDao.loginByEmail(customerEmail);

		if (cd != null) {
			if (customerDao.equals(cd.getCustomerEmail()) && pwd.equals(cd.getCustomerPassword())) {

				resp.sendRedirect("https://www.flipkart.com/");
			}
		} else {
			PrintWriter pw = resp.getWriter();
			pw.print("invalid data");
		}

	}

}
