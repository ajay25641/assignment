<%--
  Created by IntelliJ IDEA.
  User: ajay1.kumar
  Date: 12-04-2023
  Time: 12:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
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

        <title>save flight details</title>
    </head>
</head>
<body>



<div class="container mt-4">
    <form action="/Hotel_java_config_war_exploded/saveHotel" method="post">
        <div class="form-group">
            <label for="Name">Hotel Name</label>
            <input type="text" name="hotelName" class="form-control" id="Name" placeholder="Hotel Name">
        </div>

        <div class="form-group">
            <label for="city">City</label>
            <input type="text" name="city" class="form-control" id="city" placeholder="Hotel City">
        </div>
        <div class="form-group">
            <label for="pinCode">Pin Code</label>
            <input type="text" name="pinCode" class="form-control" id="pinCode" placeholder="Hotel pin code">
        </div>
        <div class="container text-center">
            <button type="submit" class="btn btn-primary">Submit</button>

        </div>
    </form>
    <div class="text-center">
        <a href="/Hotel_java_config_war_exploded/home"><button type="button" class="btn btn-primary">Home</button></a>

    </div>

</div>






<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script
        src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script
        src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>
