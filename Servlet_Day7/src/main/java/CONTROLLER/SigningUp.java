package CONTROLLER;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.StudentDao;
import DTO.StudentDto;

public class SigningUp extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("stuName");
		String motherName = req.getParameter("stuFatherName");
		String fatherName = req.getParameter("stuMotherName");
		String email = req.getParameter("stuEmail");
		String pwd = req.getParameter("stuPassword");

		ServletContext sc = getServletContext();
		String school = sc.getInitParameter("SCHOOL");

		ServletConfig servletConfig = getServletConfig();
		double fees = Double.parseDouble(servletConfig.getInitParameter("fee"));
		
		StudentDto dto = new StudentDto();
		dto.setStuName(name);
		dto.setStuFatherName(fatherName);
		dto.setStuMotherName(motherName);
		dto.setStuEmail(email);
		dto.setStuPassword(pwd);
		dto.setStuSchool(school);
		dto.setStudentFee(fees);

		StudentDao studentDao = new StudentDao();
		studentDao.saveStudent(dto);

		resp.sendRedirect("Success.html");

	}

}
