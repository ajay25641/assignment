<%--
  Created by IntelliJ IDEA.
  User: ajay1.kumar
  Date: 11-04-2023
  Time: 12:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport"
        content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <!-- Bootstrap CSS -->
  <link rel="stylesheet"
        href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
        crossorigin="anonymous">

  <title>search flight</title>
</head>
<body>

<div class="container mt-4">
  <form action="/AjayAssessment_war_exploded/searchFlight" method="post">
    <div class="form-group">
      <input type="text" name="source" class="form-control" id="sourceStation" placeholder="Source Station">
    </div>

    <div class="form-group">
     <input type="text" name="destination" class="form-control" id="destinationStation" placeholder="Destination Station">
    </div>
    <div class="container text-center">
      <button type="submit" class="btn btn-primary">Submit</button>

    </div>
  </form>


</div>

<div class="text-center">
  <a href="/AjayAssessment_war_exploded/home"><button type="button" class="btn btn-primary">Home</button></a>

</div>


</body>
</html>
