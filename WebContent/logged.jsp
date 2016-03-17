<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
	background-image: url("background.jpg");
	background-repeat: no-repeat;
    background-position: center;
}
.button {
    background-color: #4CAF50; /* Green */
    border: none;
    color: white;
    padding: 5px 10px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    -webkit-transition-duration: 1s; /* Safari */
    transition-duration: 1s;
    cursor: pointer;
}

.button4 {
    background-color: white;
    color: black;
    border: 2px solid #555555;
}

.button4:hover {
	background-color: #555555;
	color: white;
}


ul {
    list-style-type: none;
    margin: 50, center;
    padding: 0;
    width: 200px;
    background-color: #f1f1f1;
    align: center;
    }


li a {
    display: block;
    color: #000;
    padding: 8px 0 8px 16px;
    text-decoration: none;
}

li a:hover {
    background-color: #555;
    color: white;
}
}
</style>
</head>
<body>

<a href="index.jsp"> <button  class="button button4" style="float:right">&nbsp Logout &nbsp</button> </a>


<br><br><br><br><br><br><br><br><br><br>
<ul style="float:center">
  <li><a href="index.jsp">Home</a></li>
  <li><a href="#news">My Profile</a></li>
  <li><a href="#contact">All pictures</a></li>
  <li><a href="#about">My Pictures</a></li>
  <li><a href="#about">New Stuff</a></li>
  <li><a href="#about">Categories</a></li>
</ul>


</body>
</html>
