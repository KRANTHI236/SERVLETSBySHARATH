package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Form1  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String  name=req.getParameter("name");
		int age=Integer.parseInt(req.getParameter("age"));
		String address= req.getParameter("address");
		String email=req.getParameter("mail");
		Long phno=Long.parseLong(req.getParameter("phno"));
		
		PrintWriter printWriter =res.getWriter();
		printWriter.println("name:"+name);
		printWriter.println("age:"+age);
		printWriter.println("address:"+address);
		printWriter.println("email:"+email);
		printWriter.println("phno:"+phno);
		
		
				
	}
	
	

}
