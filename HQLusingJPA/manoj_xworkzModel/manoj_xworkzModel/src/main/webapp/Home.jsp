<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
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
            <img src="Logo.png" alt="Logo" height="45" class="me-4">

            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link fw-medium text-success-emphasis" href="#">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link fw-medium text-success-emphasis" href="#">About Us</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link fw-medium text-success-emphasis" href="#">Contact Us</a>
                </li>
            </ul>
        </div>

        <!-- Right: Profile + Logout -->
        <div class="d-flex gap-2 align-items-start">

            <!-- Profile Dropdown -->
            <div class="dropdown">
                <button class="btn btn-outline-success dropdown-toggle"
                        type="button"
                        data-bs-toggle="dropdown"
                        aria-expanded="false">
                    Profile
                </button>

                <!-- Profile Popup Card -->
                <div class="dropdown-menu p-0 border-0 shadow"
                     style="min-width: 300px;">
                    <div class="card">
                        <div class="card-header bg-success text-white text-center">
                            <strong>My Profile</strong>
                        </div>
                        <div class="card-body text-start">
                            <p><strong>First Name:</strong> ${user.getFName()}</p>
                            <p><strong>Last Name:</strong> ${user.getLName()}</p>
                            <p><strong>Age:</strong> ${user.getAge()}</p>
                            <p><strong>Gender:</strong> ${user.getGender()}</p>
                            <p><strong>Email:</strong> ${user.getEmail()}</p>
                            <p><strong>Mobile:</strong> ${user.getMobile()}</p>
                        </div>
                    </div>
                </div>
            </div>


            <!-- Right: Batch Details Dropdown -->
            <div class="dropdown">

                <button class="btn btn-success dropdown-toggle"
                        type="button"
                        data-bs-toggle="dropdown"
                        aria-expanded="false">
                    Batch Details
                </button>

                <ul class="dropdown-menu dropdown-menu-end shadow">

                    <li>
                        <form action="addNewBatch" method="get">
                            <button type="submit" class="dropdown-item fw-medium">
                                Add New Batch
                            </button>
                        </form>
                    </li>

                    <li>
                        <form action="viewAllBatches" method="get">
                            <button type="submit" class="dropdown-item fw-medium">
                                View Batch Details
                            </button>
                        </form>
                    </li>


                </ul>
            </div>


            <!-- Logout -->
            <form action="logOut" method="get">
                <button type="submit" class="btn btn-success">
                    Log Out
                </button>
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
