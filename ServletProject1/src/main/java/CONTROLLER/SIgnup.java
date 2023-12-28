package CONTROLLER;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CustomerDao;
import DTO.CustomerDto;

@WebServlet("/signup")
public class SIgnup extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("cname");
		int age = Integer.parseInt(req.getParameter("cgae"));
		String add = req.getParameter("caddress");
		String email = req.getParameter("cemail");
		String cpwd = req.getParameter("cpassword");

		CustomerDto customerDto = new CustomerDto();
		customerDto.setCustomerName(name);
		customerDto.setCustomerAge(age);
		customerDto.setCustomerAddress(add);
		customerDto.setCustomerEmail(email);
		customerDto.setCustomerPassword(cpwd);

		CustomerDao customerDao = new CustomerDao();
		customerDao.insertCustomer(customerDto);

		RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
		rd.forward(req, resp);
	}

}
