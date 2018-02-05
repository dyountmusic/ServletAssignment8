<%-- 
    ITIS-4166 Network Based Application Design
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>  
<html lang="en"><head>  
<meta charset="utf-8">  
	<title> NBAD Exercise Registration Form </title> 
        <link rel="stylesheet" type="text/css" href="main.css">
</head>  
<body >
	<header>Registration Form</header>  
	<main>
		<form action="/dyount2Ex8/membership?action=signup" name="registration" method="post">  
			<label for="name" class="labels">Name:</label>  
			<input type="text" name="name"/>  <br />
			<label for="username" class="labels">Username:</label>  
			<input type="text" name="username"  /> <br />
			<label for="passid" class="labels">Password:</label>  
			<input type="password" name="passid"/>  <br />
			<label for="address" class="labels">Address:</label>  
			<input type="text" name="address"  />  <br />
			<label for="country" class="labels">Country:</label>  
			<select name="country">  
				<option selected="" value="Default">(Please select a country)</option>  
				<option value="Australia">Australia</option>  
				<option value="Canada">Canada</option>  
				<option value="USA">USA</option>  
			</select>  <br />
			<label for="zip" class="labels">ZIP Code:</label>  
			<input type="text" name="zip" />  <br />
			<label for="email" class="labels">Email:</label>  
			<input type="text" name="email"  />  <br />
			<label id="gender" class="labels">Sex:</label>  
			<input type="radio" name="sex" value="Male" /><span>Male</span>  
			<input type="radio" name="sex" value="Female" /><span>Female</span> <br /> 
			<label class="labels">Language:</label>  
			<input type="checkbox" name="langs" value="English" checked /><span>English</span>  
			<input type="checkbox" name="langs" value="French" /><span>French</span>
			<input type="checkbox" name="langs" value="Germany" /><span>Germany</span> 		<br />
			<label for="about" class="labels">About:</label>  
			<textarea name="about" id="desc"></textarea>  <br />
			<input type="submit" name="submit" value="Submit" />  

		</form>  
	<main>
</body>  
</html>