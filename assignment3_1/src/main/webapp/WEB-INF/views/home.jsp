<!DOCTYPE html>
<html>
 
 
 
 <%-- this is used enable jsp expression langaguae --%>
<%@page isELIgnored="false" %>

<%-- this is used for jstl. jstl is used for forEach traversal --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>


<h1>this is home page</h1>
<h1>called by home controller</h1>

<%-- 
<%

String name=(String)request.getAttribute("name");

%>
 --%>
<h1>name is ${name}</h1>

<c:forEach var="item" items="${list}">

<h1> ${item} </h1>


</c:forEach>

</body>
</html>