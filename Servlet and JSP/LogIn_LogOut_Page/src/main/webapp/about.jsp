<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>
<%
if(session.getAttribute("username")==null){
	response.sendRedirect("login.jsp");
}
%>
about
	Hey,Welcome to  learning JSP & Servlet.
	</h1>
</body>
</html>