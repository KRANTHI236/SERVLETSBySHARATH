package CONTROLLER;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.EmpDao;
import DTO.EmpDtoo;

@WebServlet("/signup")
public class SignUp extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		int id = Integer.parseInt(req.getParameter("empId"));
		String empName = req.getParameter("empName");
		String empAddress = req.getParameter("empAddress");
		String empEmail = req.getParameter("empEmail");
		long empPhno = Long.parseLong(req.getParameter("empPhno"));
		String empPwd = req.getParameter("empPwd");

		EmpDtoo empDtoo = new EmpDtoo();
//		empDtoo.setEmpId(id);
		empDtoo.setEmpName(empName);
		empDtoo.setEmpEmail(empEmail);
		empDtoo.setEmpPwd(empPwd);
		empDtoo.setEmpPhno(empPhno);
		empDtoo.setEmpAddress(empAddress);

		EmpDao empDao = new EmpDao();
		EmpDtoo dbemp = empDao.saveBoth(empDtoo);

		if (dbemp != null) {

			req.setAttribute("message", "Successfully SignedUp Proceed For Login" + " " + empDtoo.getEmpName());
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			rd.forward(req, resp);
		}

	}

}
