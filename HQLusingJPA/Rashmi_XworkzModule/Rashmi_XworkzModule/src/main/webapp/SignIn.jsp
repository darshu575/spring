<!doctype html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=yes, initial-scale=1.0, maximum-scale=2.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Home</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons/font/bootstrap-icons.css" rel="stylesheet">

    <style>
        body {
       background-image: url('<%= request.getContextPath() %>/resources/images/bgImage.jpg');
       background-repeat: no-repeat;
       background-size: cover;
       background-position: center;
       backdrop-filter: blur(7px);
      }

    .navbar-nav .nav-link:hover {
        color: #fd7e14 !important;
        border-bottom : 2px solid #fd7e14;
    }

    </style>
</head>
<body>

<nav class="navbar navbar-expand-lg bg-dark border-bottom border-body" style="height: 80px;">
    <div class="container-fluid">
        <img src="<%= request.getContextPath() %>/resources/images/logo.png" alt="logo" style="height:60px;width:130px;">
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ps-5 ms-5">
                <li class="nav-item">
                    <a class="nav-link active text-white ps-4 ms-4 fs-5" aria-current="page" href="index">HOME</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active text-white ps-4 ms-4 fs-5" aria-current="page" href="about">ABOUT</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active text-white ps-4 ms-4 fs-5" aria-current="page" href="contact">CONTACT</a>
                </li>

            </ul>

            <ul class="navbar-nav nav-pills ms-auto">
                <li class="nav-item"><a class="nav-link active text-dark  fw-bold m-1  bg-body-tertiary" href="signUp">Sign Up</a></li>
                <li class="nav-item"><a class="nav-link active text-dark  fw-bold m-1  bg-body-tertiary" href="signInPage">Sign In</a></li>

            </ul>
        </div>
    </div>
</nav>

<div class="container-fluid d-flex align-items-center"
     style="height: calc(100vh - 100px);">

<div class="container-fluid vh-100 d-flex justify-content-end align-items-center">
    <div class="card shadow p-3 mb-5 bg-body-tertiary rounded me-4" style="width: 40rem;">
        <div class="card-body">
            <h5 class="card-title text-center fs-2 fw-bold text-uppercase">Sign In</h5><br>
            <form action="signIn" method="post">

                <div class="col-md-12">
                    <label for="email" class="form-label fs-6 fw-semibold">Email <span class="text-danger">*</span></label>
                    <input type="email" class="form-control" id="email" name="userEmail" placeholder="Enter your email id" value="${userEmail}" validateUserEmail();enableSubmit();">
                    <span id="emailError" class="text-danger fw-bold"></span>
                </div>
                <br>
                <div class="col-md-12">
                    <label for="password" class="form-label fs-6 fw-semibold">Password <span class="text-danger">*</span></label>
                    <input type="password" class="form-control" id="password" name="password" placeholder="Enter password" onblur="validatePassword();enableSubmit();">
                    <span id="passwordError" class="text-danger fw-bold"></span>
                </div>
                <br>
                <div class="col-12 d-flex justify-content-center p-3">
                    <button type="submit"  class="btn btn-primary fs-5 fw-semibold text-uppercase" id="signInBtn" <c:if test="${disableLogin}">disabled</c:if>>Sign In</button>
                </div>
                <c:if test="${not empty errorMsg}">
                    <p class="text-center fs-4 fw-bold text-uppercase text-danger">${ errorMsg }</p>
                </c:if>
                <div class="col-12 d-flex justify-content-center p-3">
                    <a href="signInWithOTP"  class="fs-4" <c:if test="${!showForgot}">hidden</c:if>>forgot password?</a>
                </div>

            </form>
        </div>
    </div>
</div>
</div>
<script src="<%= request.getContextPath() %>/resources/SignInScript.js"></script>
</body>
</html>
