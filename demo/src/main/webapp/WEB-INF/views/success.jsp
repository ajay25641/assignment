<%--
  Created by IntelliJ IDEA.
  User: ajay1.kumar
  Date: 10-04-2023
  Time: 13:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Title</title>
</head>

<body>

<c:forEach var="item" items="${userlist}">
    <h1>email is:${item.email}</h1>
    <h1>user name is:${item.userName}</h1>
    <h1>password is:${item.password}</h1>

</c:forEach>


</body>
</html>
