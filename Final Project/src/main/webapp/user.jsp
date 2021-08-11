<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>jQuery UI Accordion - Default functionality</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
 <style>
 .whole{
 background-image:url("https://images.unsplash.com/photo-1585184394271-4c0a47dc59c9?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8YXBwbGUlMjBsb2dvfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&w=1000&q=80");
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
 color: white;
 font-size: 50;
 margin-left: 2%;
 padding-left: 2px;
 }
 .profile{
 margin-left: 88%;
 margin-right: 2%;
 align-items: center;
 background-color: lightgrey;
 	color: red;
 }
 .logout{
 margin-top: 1%;
 margin-left: 90%;
 background-color: lightgrey;
 margin-right: 6%;
 }
 .main{
background-color: lightgrey;
 border-color: white;
 font-size: 20;
 margin-left: 45%;
 margin-right: 45%;
 
 }
 .link{
 font-weight: bold;
 display: block;
 height: 40;
 cursor: pointer;
 }
 .link2{
 dispay: block;
 font-weight: bold;
 height: 40;
 font-size: 50;
 }
 </style>
                  
</head>
<body>
<div class="whole"> 
<div class="title">
<h1 >Welcome ${username},</h1></div>
<div class="profile">
<a href="profile.do" class="link" >VIEW PROFILE</a>
</div>
<div class="logout"><a href="logout.do" class="link" style="color: red;">Logout</a></div>
<div align="center" style="margin-top: 4%; height: 100px" class="main">
<a href="raiseticket.jsp" class="link2"><b>Raise Ticket</b></a><br/><br/>
<a href="open.do" class="link2"><b>Open Ticket</b></a><br/><br/>
<a href="history.do" class="link2"><b>Ticket History</b></a>
</div>
</div>
</body>
</html>