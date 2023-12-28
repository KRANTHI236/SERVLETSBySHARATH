<%@page import="DTO.EmpDtoo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DISPLAY</title>
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
	List<EmpDtoo> emp = (List) request.getAttribute("employee");
	%>
	<table border="2px">

		<tr>

			<th>Id</th>
			<th>Name</th>
			<th>Address</th>
			<th>Phone</th>
			<th>Email</th>
			<th>Pwd</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<%
		for (EmpDtoo empDtoo : emp) {
		%>
		<tr>

			<td><%=empDtoo.getEmpId()%></td>
			<td><%=empDtoo.getEmpName()%></td>
			<td><%=empDtoo.getEmpPhno()%></td>
			<td><%=empDtoo.getEmpAddress()%></td>
			<td><%=empDtoo.getEmpEmail()%></td>
			<td><%=empDtoo.getEmpPwd()%></td>
			<td><a href="update?id=<%=empDtoo.getEmpId()%>"><button>UPDATE</button></a></td>
			<td><a href="delete?id=<%=empDtoo.getEmpId()%>"><button>DELETE</button></a></td>


		</tr>
		<%
		}
		%>


	</table>
</body>
</html>