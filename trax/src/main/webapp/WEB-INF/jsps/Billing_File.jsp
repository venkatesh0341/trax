<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><table>
  <tr>
  <th>FirstName</th>
  <th>LastName</th>
  <th>Email</th>
  <th>Mobile</th>
  <th>product</th>
  <th>Amount</th>
  </tr>
  <c:forEach items="${Billing}" var="billing">
  <tr>
  <td>${billing.firstName}</td>
  <td>${billing.lastName}</td>
  <td>${billing.email}</td>
  <td>${billing.mobile}</td>
  <td>${billing.product}</td>
  <td>${billing.Amount}</td>
  </tr>
  </c:forEach>
 </table>

</body>
</html>