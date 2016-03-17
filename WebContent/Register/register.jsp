<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
<link rel="stylesheet" type="text/css" href="view.css" media="all">
<script type="text/javascript" src="view.js"></script>
</head>
<body id="main_body" >
	
	<img id="top" src="top.png" alt="">
	<div id="form_container">
	
		<h1><a>Register</a></h1>
		<form id="form_1112189" class="appnitro"  method="post" action="../RegisterServlet">
					<div class="form_description">
			<h2>Register</h2>
			<%if(session.getAttribute("errorMsg") != null) {%>
		<lebel style=color:red> <%= session.getAttribute("errorMsg")%></lebel>
		<%} %>
		</div>						
			<ul >
			
					<li id="li_1" >
		
		<label class="description" for="element_1">Name </label>
		<span>
			<input id="element_1_1" name= "firstName" class="element text" maxlength="255" size="8" value=""/>
			<label style=color:white>First</label>
		</span>
		<span>
			<input id="element_1_2" name= "lastName" class="element text" maxlength="255" size="14" value=""/>
			<label style=color:white>Last</label>
		</span> 
		</li>		<li id="li_2" >
		<label class="description" for="element_2">Email </label>
		<div>
			<input id="element_2" name="email" class="element text medium" type="text" maxlength="255" value=""/> 
		</div> 
		</li>		<li id="li_4" >
		<label class="description" for="element_4">Username </label>
		<div>
			<input id="element_4" name="username" class="element text medium" type="text" maxlength="255" value=""/> 
		</div> 
		</li>		<li id="li_3" >
		<label class="description" for="element_3">Password </label>
		<span>
			<input onblur = "checkLength(this)" id="element_3_1" name= "password" class="element text" maxlength="20" size="8" value=""/>
			<label style=color:white>Enter Password</label>
		</span>
		<span>
			<input id="element_3_2" name= "rePassword" class="element text" maxlength="255" size="14" value=""/>
			<label style=color:white>Repeat Password</label>
		</span> 
		</li>
			
					<li class="buttons">
			    <input type="hidden" name="form_id" value="1112189" />
			    
				<input id="saveForm" class="button_text" type="submit" name="submit" value="Register" />
		</li>
			</ul>
		</form>
	</div>
	<img id="bottom" src="bottom.png" alt="">
	</body>
</html>