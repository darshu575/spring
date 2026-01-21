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

<div class="container-fluid vh-100 d-flex justify-content-end align-items-center">
    <div class="card shadow p-3 mb-5 bg-body-tertiary rounded me-4" style="width: 40rem;">
        <div class="card-body">
            <c:if test="${not empty errorMsg}">
                <p class="text-center fs-4 fw-bold text-uppercase text-danger">${ errorMsg }</p>
            </c:if>
            <h5 class="card-title text-center fs-2 fw-bold text-uppercase">Sign Up</h5><br>
            <form class="row g-3" action="registerUser" method="post">
                <div class="col-md-6">
                    <label for="name" class="form-label fs-6 fw-semibold">Name <span class="text-danger">*</span></label>
                    <input type="text" class="form-control" id="name" name="userName" placeholder="Enter your name" onchange="validateUserName();enableSubmit();">
                    <span id="nameError" class="text-danger fw-bold">${userNameError}</span>
                </div>

                <div class="col-md-6">
                    <label for="email" class="form-label fs-6 fw-semibold">Email <span class="text-danger">*</span></label>
                    <input type="email" class="form-control" id="email" name="userEmail" placeholder="Enter your email id" onchange="validateUserEmail();enableSubmit();">
                    <span id="emailError" class="text-danger fw-bold">${userEmailError}</span>
                </div>
                <div class="col-6">
                    <label for="phoneNumber" class="form-label fs-6 fw-semibold">Phone Number <span class="text-danger">*</span></label>
                    <input type="text" class="form-control" id="phoneNumber"  name="phoneNumber" placeholder="+91 8952162632" onchange="validatePhoneNumber();enableSubmit();">
                    <span id="phoneNumberError" class="text-danger fw-bold">${phoneNumberError}</span>
                </div>
                <div class="col-md-6">
                    <label for="age" class="form-label fs-6 fw-semibold">Age <span class="text-danger">*</span></label>
                    <input type="number" class="form-control" id="age" name="age" placeholder="Enter your age" onchange="validateAge();enableSubmit();">
                    <span id="ageError" class="text-danger fw-bold">${ageError}</span>
                </div>

                <div class="col-md-4">
                    <label for="gender" class="form-label fs-6 fw-semibold">Gender <span class="text-danger">*</span></label>
                    <select id="gender" class="form-select" name="gender"  onchange="validateGender();enableSubmit();">
                        <option value=" ">Select Gender</option>
                        <option value="Male">Male</option>
                        <option value="Female">Female</option>
                        <option value="Other">Other</option>
                    </select>
                    <span id="genderError" class="text-danger fw-bold">${genderError}</span>
                </div>

                <div class="col-md-8">
                    <label for="address" class="form-label fs-6 fw-semibold">Address <span class="text-danger">*</span></label>
                    <input type="text" class="form-control" id="address" name="address" placeholder="Enter your address" onchange="validateAddress();enableSubmit();">
                    <span id="addressError" class="text-danger fw-bold">${addressError}</span>
                </div>

                <div class="col-md-6">
                    <label for="password" class="form-label fs-6 fw-semibold">Password <span class="text-danger">*</span></label>
                    <input type="password" class="form-control" id="password" name="password" placeholder="Enter password" onchange="validatePassword();enableSubmit();">
                    <span id="passwordError" class="text-danger fw-bold">${passwordError}</span>
                </div>
                <div class="col-md-6">
                    <label for="confirmPassword" class="form-label fs-6 fw-semibold">Confirm Password <span class="text-danger">*</span></label>
                    <input type="password" class="form-control" id="confirmPassword" name="confirmPassword" placeholder="Re-enter the Password" onchange="validateConfirmPassword();enableSubmit();">
                    <span id="confirmPasswordError" class="text-danger fw-bold">${confirmPasswordError}</span>
                </div>

                <div class="col-12 d-flex justify-content-center p-3">
                    <button type="submit" class="btn btn-primary fs-5 fw-semibold text-uppercase" id="signUpBtn" >Sign Up</button>
                </div>
            </form>
        </div>
    </div>
</div>

<!--<script src="<%= request.getContextPath() %>/resources/script.js"></script>-->
</body>
</html>
