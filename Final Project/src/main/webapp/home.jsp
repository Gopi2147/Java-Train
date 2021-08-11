<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html style="height: 486px; ">
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<style>
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
	.title{
	color: red;
	text-align: center;
	font-size: 100;
	margin-left: 10%;
	margin-right: 10%;
	}
	.table{
	margin-left: 35%;
	margin-right: 35%;
	background-color: lightgrey;
	}
</style>
</head>
<body>
<div class="total">
<div class="title">
<h1>Salesforce Login</h1></div>
<form action="home.do" method="post" align="center">
<div class="table">
<table align="center" style="height: 171px;">
<tr>
<th style="color:black;">UserName* : </th>
<td><input type="text" name="username" placeholder="Enter your username" style="width: 208px; height: 30px"></td>
</tr>
<tr>
<th style="color:black; width: 104px; height: 41px"><b>Password* : </b></th>
<td style="width: 211px; "><input type="password" name="password" placeholder="Enter your password" style="width: 207px; height: 30px"></td>
</tr>
<tr style="width: 271px; "><td style="width: 113px; height: 40; align-items: flex-start;"><input type="submit" value="Login" class="button" style="color: white; background-color: lightblue; height: 36px; width: 100px; padding-left: 5px; font-size: 20px; border-radius: 20px;"></td>
        </tr>        
</table></div>
</form>
</div>
</body>
</html>