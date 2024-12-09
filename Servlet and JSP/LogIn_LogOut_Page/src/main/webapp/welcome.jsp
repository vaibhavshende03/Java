<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");

if(session.getAttribute("username")==null){
	response.sendRedirect("login.jsp");
}
%>
welcome ....
${username} 
<br><br><br>
<a href="video.jsp">Click Here to get the videos</a>
<form action="Logout" method="post"><br><br>
<input type="submit" value="Logout">
</form>
</body>
</html>