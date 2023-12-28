<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2px" style="border-collapse: collapse;">
<tr>
<th>ID</th>
<th>NAME</th>
<th>AGE</th>
<th>EMAIL</th>
<th>PASSWORD</th>
<th>EDIT</th>
<th>DELETE</th>
</tr>
<c:forEach var="stu" items="${list}">
<tr>
<td>${stu.getId()}</td>
<td>${stu.getName()}</td>
<td>${stu.getAge()}</td>
<td>${stu.getEmail()}</td>
<td>${stu.getPassword()}</td>
<td><a href="editstudent?id=${stu.getId()}">edit</a></td>
<td><a href="deletestudent?id=${stu.getId()}">delete</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>