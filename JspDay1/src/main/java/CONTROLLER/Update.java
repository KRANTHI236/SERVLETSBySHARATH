package CONTROLLER;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.EmpDao;
import DTO.EmpDtoo;

@WebServlet("/update")
public class Update extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));

		EmpDao empDao = new EmpDao();
		EmpDtoo empDtoo = empDao.getEmpById(id);

		if (empDtoo != null) {

			req.setAttribute("employee", empDtoo);

			
			RequestDispatcher rd = req.getRequestDispatcher("edit.jsp");
			rd.forward(req, resp);

		} else {
			req.setAttribute("message", "login first to update table values");
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			rd.forward(req, resp);
		}
	}

}
