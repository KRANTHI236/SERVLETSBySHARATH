<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="savestudent" modelAttribute="sl">
ID:<form:input path="id"/><br><br>
NAME:<form:input path="name"/><br><br>
AGE:<form:input path="age"/><br><br>
EMAIL:<form:input path="email"/><br><br>
PASSWORD:<form:input path="password"/><br><br>
<form:button>Register</form:button>
</form:form>
</body>
</html>