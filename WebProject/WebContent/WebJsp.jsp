<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Customer Details:</h1>
	<form method="GET" action="LoginCheck">

	Id: <input type="text" name="userid">
 	<br><br>
 	 	
 	Customer Name: <input type="text" name="user">
 	<br><br>
 	
 	Male:<input type="radio" name="gender" value="male" checked>&nbsp;&nbsp;
 	Female:<input type="radio" name="gender" value="female"><br><br>
 	Age:<input type="text" name="age">
 	<br><br>
 	<textarea name="address" rows="10" cols="30">Address:</textarea>
 	<br><br>
 	Country:&nbsp;
 	<select name="country">
 	<option value="India">India</option>
 	<option value="China">China</option>
 	<option value="USA">USA</option>
 	<option value="UK">UK</option>
 	<option value="Australia">Australia</option>
 	</select>
 	<br><br>
	City:&nbsp;
	<select name="city">
	<option value="Chennai">Chennai</option>
	<option value="Delhi">Delhi</option>
	<option value="Beijing">Beijing</option>
	<option value="Hongkong">Hongkong</option>
	<option value="Newyork">Newyork</option>
	<option value="Los Angeles">Los Angeles</option>
	<option value="London">London</option>
	<option value="Edinburgh">Edinburgh</option>
	<option value="Sydney">Sydney</option>
	<option value="Canberra">Canberra</option>
	</select>
	<br><br>
	PinCode: <input type="text" name="PIN">
	<br><br>
	Phone: <input type="text" name="Phone">
	<br><br>
	Areas of Interest:&nbsp;<br>
	<input type="checkbox" name="Area Of Interest" value="Playing"> Playing<br>
	<input type="checkbox" name="Area Of Interest" value="Reading"> Reading<br>
	<input type="checkbox" name="Area Of Interest" value="Painting"> Painting<br>
	<input type="checkbox" name="Area Of Interest" value="Photography"> Photography<br>
	<input type="checkbox" name="Area Of Interest" value="Travelling"> Travelling<br>
	<br>
	Date of Birth:<input type="text" name="date">
	<br><br><br><br>
	<input type="submit" value='SUBMIT'>
	<input type="reset">
	
	</form>
	
	 	
 	<%String Country = request.getParameter("country"); %>
	<%if(Country == "India")
	{
		out.print("Processing");
	} 
	%>	
 	
	
</body>
</html>