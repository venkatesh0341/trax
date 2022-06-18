<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>contact | info</title>
</head>
<body>
<h2>contact | Info</h2>
First name:${contact.firstName}<br/>
Last Name:${contact.lastName}<br/>
Lead Source:${contact.leadSource}<br/>
email:${contact.email}<br/>
mobile:${contact.mobile}<br/>
</body>
<form action="composeEmail" method="post">
<input type="hidden" name="email" value="${contact.email}"/>
<input type="submit" value="send email"/>
</form>

</html>