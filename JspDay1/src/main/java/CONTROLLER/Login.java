package CONTROLLER;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.EmpDao;
import DTO.EmpDtoo;

@WebServlet("/login")
public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		int id = Integer.parseInt(req.getParameter("empId"));
//		String empEmail = req.getParameter("empEmail");
		String empPwd = req.getParameter("empPwd");

		long empPhno = Long.parseLong(req.getParameter("empPhno"));

		EmpDao empDao = new EmpDao();
//		EmpDtoo empDtoo = empDao.loginByUsingMail(empEmail);
		EmpDtoo empDtoo = empDao.loginByUsingPhno(empPhno);

		if (empDtoo != null) {
//			if (empEmail.equals(empDtoo.getEmpEmail()) && empPwd.equals(empDtoo.getEmpPwd())) {

			if (empPhno == empDtoo.getEmpPhno() && empPwd.equals(empDtoo.getEmpPwd())) {

				List<EmpDtoo> emp = empDao.getAllEmp();
				req.setAttribute("employee", emp);

				Cookie cookie = new Cookie("message1", empDtoo.getEmpName());
				resp.addCookie(cookie);

				RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
				rd.forward(req, resp);

//			PrintWriter pw = resp.getWriter();
//			pw.println("Success");
//			resp.sendRedirect("https://youtu.be/RVLNBVK8auM");
			}
		} else {
//			resp.sendRedirect("login.jsp");
			req.setAttribute("message", "invalid Data try Again with proper data");

			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			rd.forward(req, resp);

//			PrintWriter pw = resp.getWriter();
//			pw.println("invalid credintials");
		}
	}

}
