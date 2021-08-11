<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.enter{
margin:0;
padding:0;
background-image:url("https://i.pinimg.com/originals/81/98/32/819832bbe15b7fb1d4d16c4002e120e7.jpg");
background-position: center;
background-repeat: no-repeat;
background-size: cover;
color: white;
position: fixed;
width: 100%;
height: 100%;
top: 0px;
left: 0px;
}</style>
</head>
<body>
<form action="/open" method="post">
<div class="enter">
<h3>Open tickets</h3>
<%-- <h3>${open}</h3></div> --%>
<ul>
<c:forEach items="${open}" var="ot">
<li><b>Ticket ID: </b>${ot.ticketid}</li>
</c:forEach>
</ul>
</div>
</form>
</body>
</html>