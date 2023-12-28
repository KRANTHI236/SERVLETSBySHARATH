<%@page import="javax.swing.plaf.metal.MetalBorders.Flush3DBorder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOGIN</title>
</head>
<body>
	
	<%
	String message = (String) request.getAttribute("message");

	if (message != null) {
	%>
	<h3><%=message%></h3>
	<%
	}
	%>
	<form action="login" method="post">
		<!-- 		empId: <input type="number" name="empId" placeholder="enter the empId">
		<br> <br>  -->
		<!--	empEmail: <input type="email" name="empEmail"
			placeholder="enter the empEmail"><br> <br> -->
		empPhno: <input type="number" name="empPhno"
			placeholder="enter the empPhno"><br> <br> empPwd: <input
			type="password" name="empPwd" placeholder="enter the empPwd"><br>
		<br>

		<button>Login</button>


	</form>





</body>
</html>