<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Home Page</title>
<style>
.main{
background-color: lightgrey;
 border-color: white;
 font-size: 20;
 margin-left: 45%;
 margin-right: 45%;
 height:75px;
 }
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
 .logout{
 margin-top: 1%;
 margin-left: 90%;
 background-color: lightgrey;
 margin-right: 6%;
 }
 .profile{
 margin-left: 88%;
 margin-right: 2%;
 align-items: center;
 background-color: lightgrey;
 	color: red;
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
<h1>Welcome ${username}, </h1></div>
<div align="right" class="profile">
<a href="profile.do" class="link">VIEW PROFILE</a></div>
<div class="logout"><a href="logout.do" class="link" style="color: red;">Logout</a></div>

<div align="center" class="main">
<a href="adopen.do" class="link2"><b>Open Tickets</b></a><br/><br/>
<a href="adhistory.do" class="link2"><b>Ticket History</b></a>

</div>
</div>
</body>
</html>