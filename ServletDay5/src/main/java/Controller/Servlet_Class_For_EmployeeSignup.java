package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.EmployeeDao;
import Dto.Employee;

@WebServlet("/Signup")
public class Servlet_Class_For_EmployeeSignup extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int empid = Integer.parseInt(req.getParameter("empid"));
		String empname = req.getParameter("empname");
		String empjob = req.getParameter("empjob");
		String empEmail = req.getParameter("empEmail");
		String empPwd = req.getParameter("empPwd");
		long empPhno = Long.parseLong(req.getParameter("empPhno"));
		Employee emp = new Employee();

//		emp.setEmpid(empid);

		emp.setEmpname(empname);
		emp.setEmpjob(empjob);
		emp.setEmpEmail(empEmail);
		emp.setEmpPwd(empPwd);
		emp.setEmpPhno(empPhno);

		EmployeeDao.saveEmp(emp);

//		PrintWriter printWriter=resp.getWriter();
//		printWriter.println("signup successfully");
//		RequestDispatcher rd = req.getRequestDispatcher("Login.html");
//		rd.forward(req, resp);

		resp.sendRedirect("Login.html");

//		resp.sendRedirect("https://youtu.be/ySPKnRY56Cc");
	}

}
