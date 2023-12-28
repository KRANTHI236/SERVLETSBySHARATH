package CONTROLLER;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.EmpDao;
import DTO.EmpDtoo;

@WebServlet("/edit")
public class Edit extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("empId"));

		String empName = req.getParameter("empName");
		String empAddress = req.getParameter("empAddress");
		String empEmail = req.getParameter("empEmail");
		long empPhno = Long.parseLong(req.getParameter("empPhno"));
		String empPwd = req.getParameter("empPwd");

		EmpDtoo empDtoo = new EmpDtoo();

		empDtoo.setEmpId(id);

		empDtoo.setEmpName(empName);
		empDtoo.setEmpEmail(empEmail);
		empDtoo.setEmpPwd(empPwd);
		empDtoo.setEmpPhno(empPhno);
		empDtoo.setEmpAddress(empAddress);

		EmpDao empDao = new EmpDao();
		EmpDtoo dtoo = empDao.updateById(empDtoo);

		if (dtoo != null) {
			List<EmpDtoo> emp = empDao.getAllEmp();
			req.setAttribute("employee", emp);

			RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
			rd.forward(req, resp);
		}

	}

}
