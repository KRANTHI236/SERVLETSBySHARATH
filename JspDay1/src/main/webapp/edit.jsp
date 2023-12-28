<%@page import="java.util.List"%>
<%@page import="DTO.EmpDtoo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EDITPAGE</title>
</head>
<body>
<%-- 	<%
	EmpDtoo empDtoo1 = (EmpDtoo) request.getAttribute("message1");
	if (empDtoo1 != null) {
	%>
	<h3>changed by</h3>
	<h3><%=empDtoo1%></h3>

	<%
	}
	%>  --%>
	<%
	EmpDtoo empDtoo = (EmpDtoo) request.getAttribute("employee");
	%>

	<form action="edit" method="post">

		empId: <input type="hidden" name="empId"
			value="<%=empDtoo.getEmpId()%>" readonly="readonly"> <br>
		<br> empName: <input type="text" name="empName"
			value="<%=empDtoo.getEmpName()%>"><br> <br>
		empAddress: <input type="text" name="empAddress"
			value="<%=empDtoo.getEmpAddress()%>"><br> <br>
		empEmail: <input type="email" name="empEmail"
			value="<%=empDtoo.getEmpEmail()%>"><br> <br>
		empPhno: <input type="number" name="empPhno"
			value="<%=empDtoo.getEmpPhno()%>"><br> <br> empPwd:
		<input type="password" name="empPwd" value="<%=empDtoo.getEmpPwd()%>"><br>
		<br>
		<button>UPDATE</button>





	</form>
</body>
</html>