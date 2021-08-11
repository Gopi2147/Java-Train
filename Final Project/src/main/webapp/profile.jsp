<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>
     <%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <link href="https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css" rel="stylesheet"> 
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<title>Profile Page</title>
 <script>
 $(function(){
	 $("#accordion").accordion({
		 collapsibe:true,
		 active: false
	 });
 }); 
 </script>
 <style>
 .bodyspace{
margin:0;
padding:0;
background-image:url("https://cutewallpaper.org/21/apple-logo-wallpaper-hd-1080p/Free-download-Apple-Logo-HD-Wallpapers-For-Desktop-Computers-.jpg");
background-position: center;
background-repeat: no-repeat;
background-size: cover;
position: fixed;
width: 100%;
height: 100%;
top: 0px;
left: 0px;
}
 </style>
</head>
<body>
<div class="bodyspace">
<form action="/profile" method="post">
<div id="accordion">
<h2>View Your Profile</h2>
<ul>
<c:forEach items="${profile}" var="x">
<li><b>UserName : </b>${x.username} </li><br/>
<li><b>Address: </b>${x.address} </li><br/>
<li><b>Mobile: </b>${x.mobile} </li><br/>
<li><b>Email: </b>${x.email} </li><br/>
</c:forEach>
</ul>
</div>
</form>
</div>
</body>
</html>