<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %><!DOCTYPE html>
<html>
<head>
<title>Admin Login | DelegateContact</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
body{
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
    background:linear-gradient(135deg,#4da6ff,#00d4ff);
}




.login-card{
    width:400px;
    padding:40px;
    border-radius:25px;
    background:rgba(255,255,255,0.9);
    backdrop-filter:blur(10px);
    box-shadow:0 20px 50px rgba(0,0,0,0.2);
}

.login-card h3{
    text-align:center;
    margin-bottom:30px;
}
.navbar{
    background:linear-gradient(90deg,#4da6ff,#3399ff);
    padding:6px 0;          /* reduced from 15px */
    min-height:60px;        /* fixed clean height */
}

.navbar-brand{
    font-weight:700;
    color:black !important;
    font-size:18px;         /* smaller text */
    display:flex;
    align-items:center;
}

.navbar-brand img{
    height:32px;            /* smaller logo */
    margin-right:8px;
}

.nav-link{
    color:black !important;
    margin-left:18px;
    font-weight:500;
    font-size:15px;         /* reduced size */
}

.nav-link:hover{
    color:#003366 !important;
}

.navbar .btn{
    padding:5px 18px;       /* smaller button */
    font-size:14px;
}


</style>
</head>
<body>
<!-- NAVBAR -->
<nav class="navbar navbar-expand-lg fixed-top">
<div class="container">

<a class="navbar-brand" href="#">
<img src="Logo.png">
DelegateContact
</a>

</div>

</div>
</nav>
<div class="login-card">
    <h3>Admin Login</h3>

    <form action="adminLogin" method="post">
        <div class="mb-3">
            <label>Email</label>
            <input type="email" name="email" class="form-control" required>
        </div>

        <div class="mb-3">
            <label>Password</label>
            <input type="password" name="password" class="form-control" required>
        </div>

        <button class="btn btn-dark w-100">Login</button>
    </form>
    <c:if test="${not empty error}">
        <div class="alert alert-danger">
            ${error}
        </div>
    </c:if>

    <div class="text-center mt-3">
        <a href="index.jsp">← Back to Home</a>
    </div>
</div>
</body>
</html>