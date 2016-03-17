<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
	background-image: url("background.jpg");
	background-repeat: repeat;
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


.button5 {
    background-color: white;
    color: black;
    border: 2px solid #555555;
}

.button5:hover {
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
li a:hover:not(.active) {
    background-color: #555;
    color: white;
}

	.row {
				margin-bottom: 1%;
			}

	.img-container {
		border: 1px solid black;
		display: inline-block;
		width: 20%;
		-webkit-box-sizing: border-box;
		-moz-box-sizing: border-box;
		box-sizing: border-box;
	}

	.img-container img {
		width: 100%;
		height: 100%;
	}

	#content {
		display: inline-block;
		width: 80%;
	}
	#navigation {
		border: 1px solid;
	    float: left;
	    display: inline-block;
	    width: 15%;
	    margin-right: 4%;
	    padding: 15px;
	    -webkit-box-sizing: border-box;
		-moz-box-sizing: border-box;
	    box-sizing: border-box;
	    background-color: white;
}
		#navigation ul{
			list-style: none;
   			margin: 0;
   			padding: 0;
   			font-weight: bold;
		}
		h1 {
			text-align: center;
		}
}
</style>
</head>
<body>


<form action = "LoginServlet" method="get">
	<button class="button button4" style="float:right" >&nbsp Login &nbsp</button>
</form>
<form action = "RegisterServlet" method="get" >
	<button class="button button5" style="float:right">Register</button>
</form>


<br><br><br><br><br><br><br><br><br><br>
<ul style="float:center">
  <li><a href="index.jsp">Home</a></li>
  <li><a href="#contact">All pictures</a></li>
  <li><a href="#about">New Stuff</a></li>
  <li><a href="#about">Categories</a></li>
</ul>
<div id="main">
    		<center><h1>Pictures</h1></center>
	       <center><div id="content" align="center">
	        	<div class="row">
	        		<div class="img-container"><img src="http://placehold.it/800x800" alt=""></div>
	        		<div class="img-container"><img src="http://placehold.it/800x800" alt=""></div>
	        		<div class="img-container"><img src="http://placehold.it/800x800" alt=""></div>
	        	</div>
	        	<div class="row">
	        		<div class="img-container"><img src="http://placehold.it/800x800" alt=""></div>
	        		<div class="img-container"><img src="http://placehold.it/800x800" alt=""></div>
	        		<div class="img-container"><img src="http://placehold.it/800x800" alt=""></div>
	        	</div>
	        	<div class="row">
	        		<div class="img-container"><img src="http://placehold.it/800x800" alt=""></div>
	        		<div class="img-container"><img src="http://placehold.it/800x800" alt=""></div>
	        		<div class="img-container"><img src="http://placehold.it/800x800" alt=""></div>
	        	</div></center>


</body>
</html>
