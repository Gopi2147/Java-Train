<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.entire{
margin-left: 40%;
margin-top: 15%;
margin-right: 38%;
color: white;
background-color: lightgrey;
}
.total{
background-color: lightgrey;
background-image: url("https://c4.wallpaperflare.com/wallpaper/651/168/56/think-different-apple-apple-logo-wallpaper-thumb.jpg");
position: fixed;
width: 100%;
height: 100%;
top: 0px;
left: 0px;
background-position: center;
background-repeat: no-repeat;
background-size: cover;
	}
</style>
</head>
<body>
<div class="total">
<form action="ticket.do" method="post">
<div class="entire">
<table>
<tr>
<th>Subject: </th>
<td><input type="text" name="subject"></td>
</tr>
<tr>
<th>Description: </th>
<td><input type="text" name="description"></td>
</tr>
<tr>
<td>
<input type="submit" value="submit" class="btn btn-primary" style="height: 36px; width: 100px; padding-left: 10px; border-radius: 20px;">
</td></tr>
</table>
</div>




</form>
</div>
</body>
</html>