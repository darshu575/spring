<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@  page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-success-subtle">

<!-- Navbar -->
<nav class="navbar navbar-expand-lg bg-success bg-opacity-25 shadow-sm">
    <div class="container-fluid">

        <!-- Left: Logo + Nav -->
        <div class="d-flex align-items-center">
            <!-- Replace with your logo link -->
            <img src="Logo.png" alt="Logo" height="45" class="me-4">

            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link fw-medium text-success-emphasis" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link fw-medium text-success-emphasis" href="#">About Us</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link fw-medium text-success-emphasis" href="#">Contact Us</a>
                </li>
            </ul>
        </div>

        <!-- Right: Buttons -->
        <div>

         <form action="signUp" method="get" class="d-inline">
             <button type="submit" class="btn btn-success">Sign Up</button>
         </form>

     <form action="signIn" method="get" class="d-inline">
             <button type="submit" class="btn btn-outline-success me-2">Sign In</button>
         </form>

        </div>

    </div>
</nav>

<!-- Main Content -->
<div class="container text-center mt-5">
    <h1 class="text-success fw-bold">Welcome to Our Website</h1>
    <p class="text-muted mt-2">
        Professional, clean and user-friendly platform
    </p>
</div>

<!-- Footer -->
<footer class="bg-success bg-opacity-25 text-center py-2 fixed-bottom">
    <small class="text-success-emphasis">
        © 2026 Your Company Name. All rights reserved.
    </small>
</footer>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
