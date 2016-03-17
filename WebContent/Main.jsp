<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<%if(request.getSession().getAttribute("loggedUser") == null){ %>
<form action = "LoginServlet" method="get">
	<input type="submit" value="Login" style="height:25px; width:70px; float:right"/>
</form>
<form action = "RegisterServlet" method="get" >
	<input type="submit" value="Register" style="height:25px; width:70px; float:right"/>
</form>
<%} %>
<%if(request.getSession().getAttribute("loggedUser") != null){%>
<form action = "LogoutServlet" method="get">
<label  style="float:right">Welcome, <%User u = (User)(request.getSession().getAttribute("loggedUser")); %><%=u.getUsername() %></label>
<br>
<input type="submit" value="Logout" style="height:25px; width:70px; float:right"/>
<%} %>
</form>
</body>
</html>