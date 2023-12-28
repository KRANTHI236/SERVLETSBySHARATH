package Controller;

import java.io.IOException;

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

		String empEmail = req.getParameter("empEmail");
		String empPwd = req.getParameter("empPwd");

//		Employee emp = new Employee();

		EmployeeDao dao = new EmployeeDao();
		Employee emp = dao.login(empEmail);

//		emp.setEmpname(empname);
//		emp.setEmpdeptno(empdeptno);
//		resp.sendRedirect("https://www.flipkart.com/");
//		EmployeeDao.saveEmp(emp);

		if (empEmail.equals(emp.getEmpEmail()) && empPwd.equals(emp.getEmpPwd())) {
			resp.sendRedirect("https://www.flipkart.com/");

		} else {
			resp.sendRedirect("EmpSignup.html");
		}
	}

}
