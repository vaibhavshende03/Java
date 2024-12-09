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
response.setHeader("Cache-Control","no-cache,no-store,must-revalidate"); //for latest version  Http 1.1

response.setHeader("Pragma","no-cache");// for older-vesrion Http 1.0
		
response.setHeader("Expire","0");//for proxy browsers

if(session.getAttribute("username")==null){
	response.sendRedirect("login.jsp");
}
%>
<h1>video page
</h1><br>
<form action="Logout" method="post"><br><br>
<input type="submit" value="Logout">
</form><br><br>
<!--  
<video  width="500px" height="500px" contols>
 <source src="https://youtu.be/eKO9BGdQ7Wk" type="video/mp4">
  Your browser does not support the video tag.
</video>
-->

<iframe width="500" height="500" src="https://www.youtube.com/embed/eKO9BGdQ7Wk" title="Relaxing Piano Music &amp; Rain Sounds for Deep Sleep, Stress Relief and Anxiety, Meditation, Calming" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
<iframe width="500" height="500" src="https://www.youtube.com/embed/AKeUssuu3Is" title="10 Hours Fantastic Views of Nature 4K with Relaxation Music" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>



</body>
</html>