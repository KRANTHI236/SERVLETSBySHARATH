package CONTROLLER;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.StudentDao;
import DTO.StudentDto;

public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("stuId"));
		String mail = req.getParameter("stuEmail");
		String pwd = req.getParameter("stuPassword");

		ServletContext context = getServletContext();
		String school = context.getInitParameter("SCHOOL");

		StudentDao dao = new StudentDao();
		StudentDto dto = dao.fetchStudent(id);

		if (id == dto.getStuId() && school.equals(dto.getStuSchool()) && mail.equals(dto.getStuEmail())
				&& pwd.equals(dto.getStuPassword())) {

			resp.sendRedirect("https://www.youtube.com/");
//			resp.sendRedirect("Success.html");

		} else {
			resp.sendRedirect("Login.html");
		}

	}

}
