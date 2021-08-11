<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/history" method="post">
<h3>History Page</h3>
<div>
<c:forEach items="${history}" var="x">
S.no: ${x.sno}<br/>
Ticket Message: ${x.message}<br/>
</c:forEach>
</div>
</form>
</body>
</html>