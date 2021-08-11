<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/sucess" method="post">
<h3>Ticket Raised Successfully :)</h3>
<ul>
<c:forEach items="${ticketinfo}" var="ticket">
<li><b>Ticket ID: </b>${ticket.ticketid}</li><br/>
<li><b>Ticket Assigned to: </b>${ticket.receiver}</li>
</c:forEach></ul>
</form>
</body>
</html>