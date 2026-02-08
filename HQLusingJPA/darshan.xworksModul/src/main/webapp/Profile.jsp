<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <title>User Profile</title>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css" rel="stylesheet">

    <style>
        body {
            background-color: #f8f9fa;
        }

        .profile-sidebar {
            width: 380px;
            height: calc(100vh - 56px);
            position: fixed;
            top: 56px;
            right: 0;
            background: white;
            border-left: 1px solid #ddd;
            display: flex;
            flex-direction: column;
        }

        .profile-header {
            background: #343a40;
            color: white;
            text-align: center;
            padding: 1rem;
            font-size: 1.4rem;
        }

        .profile-body {
            padding: 1rem;
            overflow-y: auto;
        }

        .profile-body img {
            width: 120px;
            height: 120px;
            border-radius: 50%;
            display: block;
            margin: auto;
            border: 3px solid #0d6efd;
        }

        .main-content {
            margin-right: 400px;
            padding: 2rem;
        }
    </style>
</head>

<body>

<!-- NAVBAR -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container">
        <a class="navbar-brand" href="home.jsp">MyApp</a>
    </div>
</nav>

<!-- MAIN CONTENT -->
<div class="main-content">
    <h3>Welcome to MyApp</h3>
    <p>Your dashboard content goes here.</p>
</div>

<!-- PROFILE SIDEBAR -->
<div class="profile-sidebar">

    <div class="profile-header">User Profile</div>

    <div class="profile-body">


 <div class="text-center">
                        <img src="download?profileImage=${user.userProfilePath}" class="pro-img">
                    </div>

        <h5 class="text-center mt-2 fw-bold">${user.userName}</h5>

        <ul class="list-group list-group-flush mb-3">
            <li class="list-group-item"><i class="bi bi-envelope"></i> ${user.email}</li>
            <li class="list-group-item"><i class="bi bi-telephone"></i> ${user.phoneNumber}</li>
            <li class="list-group-item"><i class="bi bi-calendar3"></i> ${user.age}</li>
            <li class="list-group-item"><i class="bi bi-gender-ambiguous"></i> ${user.gender}</li>
            <li class="list-group-item"><i class="bi bi-geo-alt"></i> ${user.address}</li>
        </ul>

        <!-- ✅ UPLOAD FORM -->

 <a href="getUserDetails?userEmail=${user.email}" class="btn btn-secondary w-100 mt-3">
           Edit
        </a>
        <a href="Home.jsp" class="btn btn-secondary w-100 mt-3">
            ← Back
        </a>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
