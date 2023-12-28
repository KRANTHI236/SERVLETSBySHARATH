package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.EmployeeDao;
import Dto.Employee;

@WebServlet("/EmpLogin")
public class EmpLogin extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//		String empname = req.getParameter("empname");
//		String emploc = req.getParameter("emploc");

//		String empEmail = req.getParameter("empEmail");
		String empPwd = req.getParameter("empPwd");
        long empPhno=Long.parseLong(req.getParameter("empPhno"));
        
//		Employee emp = new Employee();
//		emp.setEmpname(empname);
//		emp.setEmpdeptno(empdeptno);
//		resp.sendRedirect("https://www.flipkart.com/");

		EmployeeDao emp = new EmployeeDao();
//		Employee employee = emp.login(empEmail);
		Employee employee=emp.loginByUsingPhno(empPhno);

		if (empPhno==(employee.getEmpPhno()) && empPwd.equals(employee.getEmpPwd())) {

			resp.sendRedirect("https://www.youtube.com/");

		} else {
//			PrintWriter printWriter = resp.getWriter();
//			printWriter.println("invalid data");

			resp.sendRedirect("EmpSignup.html");
		}
	}

}
