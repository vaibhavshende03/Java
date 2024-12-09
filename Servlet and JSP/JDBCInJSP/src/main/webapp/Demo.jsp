<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%


	Class.forName("org.postgresql.Driver");
	   String url="jdbc:postgresql://localhost:5432/classroom"; 
	   String username="postgres"; 
	   String pass="Admin@123"; 
	   String sql="select * from science_class where enrollment_no=11";

	Connection con=DriverManager.getConnection(url,username,pass);
	Statement stm=con.createStatement();
	ResultSet rs=stm.executeQuery(sql);
	rs.next();
	
	
	 


%>

Roll No.: <%= rs.getString(1) %><br>
Name : <%= rs.getString(2) %><br>
Marks :<%= rs.getString(3) %><br>

</body>
</html>