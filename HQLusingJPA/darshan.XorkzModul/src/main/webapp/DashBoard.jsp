<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>My Application</title>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Bootstrap Icons -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css" rel="stylesheet">

    <style>
        .dashboard-buttons .btn {
            min-width: 150px;
            margin: 0.5rem;
        }
    </style>
</head>
<body class="bg-light">

<!-- NAVBAR -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark shadow">
    <div class="container">

        <!-- LOGO -->
        <a class="navbar-brand d-flex align-items-center" href="home.jsp">
            <img src="Logo.png" width="40" class="me-2" alt="Logo">
            MyApp
        </a>

        <!-- Mobile Toggle -->
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>

        <!-- Navbar Content -->
        <div class="collapse navbar-collapse" id="navbarNav">

            <!-- LEFT MENU -->
            <ul class="navbar-nav me-auto">
                <li class="nav-item">
                    <a class="nav-link active" href="home.jsp">Home</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="dashboard">Dashboard</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="about.jsp">About</a>
                </li>
            </ul>

            <!-- RIGHT PROFILE MENU -->
            <ul class="navbar-nav">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle d-flex align-items-center"
                       href="#" role="button" data-bs-toggle="dropdown">
                        <i class="bi bi-person-circle fs-5 me-1"></i>
                        Profile
                    </a>

                    <ul class="dropdown-menu dropdown-menu-end">
                        <li>
                            <a class="dropdown-item" href="Profile.jsp">
                                <i class="bi bi-person me-2"></i> View Profile
                            </a>
                        </li>

                        <li>
                            <a class="dropdown-item" href="ChangePassword.jsp">
                                <i class="bi bi-key me-2"></i> Change Password
                            </a>
                        </li>

                        <li><hr class="dropdown-divider"></li>

                        <li>
                            <a class="dropdown-item text-danger" href="index.jsp">
                                <i class="bi bi-box-arrow-right me-2"></i> Logout
                            </a>
                        </li>
                    </ul>
                </li>
            </ul>

        </div>
    </div>
</nav>

<!-- PAGE CONTENT -->
<div class="container text-center my-5">
    <h2 class="mb-4">Welcome to your dashboard</h2>

    <div class="dashboard-buttons d-flex justify-content-center flex-wrap">
        <a href="addTeam" class="btn btn-primary btn-lg">
            <i class="bi bi-plus-circle me-2"></i> Add Teams
        </a>

        <form action="getViewTeam" method="get" class="d-inline">
            <button type="submit" class="btn btn-success btn-lg">
                <i class="bi bi-eye me-2"></i> View Teams
            </button>
        </form>
    </div>
</div>








<!-- FOOTER -->
<footer class="bg-dark text-light py-3 mt-auto">
    <div class="container text-center">
        <small>
            © 2026 MyApp |
            <a href="#" class="text-decoration-none text-secondary">Privacy Policy</a> |
            <a href="#" class="text-decoration-none text-secondary">Contact</a>
        </small>
    </div>
</footer>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
