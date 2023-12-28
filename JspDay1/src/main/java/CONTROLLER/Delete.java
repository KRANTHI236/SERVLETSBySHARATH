package CONTROLLER;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.EmpDao;
import DTO.EmpDtoo;

@WebServlet("/delete")
public class Delete extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));

		EmpDao empDao = new EmpDao();
		boolean result = empDao.deleteEmp(id);

		if (result) {

			List<EmpDtoo> emp = empDao.getAllEmp();
			req.setAttribute("employee", emp);

			RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
			rd.forward(req, resp);

		}

	}

}
