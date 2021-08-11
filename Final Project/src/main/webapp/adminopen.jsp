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
<form action="/adopen" method="post">
<c:forEach items="${adminopen}" var="open">
 <% String i= (String) "hello"; %> 
 <% request.setAttribute("ticketid", "hello"); %>
<li><b>Ticket ID: </b>${open.ticketid} <b>Subject: </b>${open.subject}
<%-- <% Integer i= (Integer) (${open.ticketid});%> --%>

</li><br/>
</c:forEach>
</form>
</body>
</html>