<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Teams</title>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css" rel="stylesheet">

    <style>
        body{background:#f4f6fb;}

        .pro-card{
            border:none;
            border-radius:18px;
            box-shadow:0 10px 30px rgba(0,0,0,.08);
            transition:.35s ease;
            overflow:hidden;
            background:#fff;
        }

        .pro-card:hover{
            transform:translateY(-10px);
            box-shadow:0 18px 45px rgba(0,0,0,.15);
        }

        .pro-header{
            height:90px;
            background:linear-gradient(135deg,#4e73df,#224abe);
        }

        .pro-img{
            width:115px;
            height:115px;
            border-radius:50%;
            object-fit:cover;
            border:4px solid #fff;
            box-shadow:0 6px 20px rgba(0,0,0,.25);
            margin-top:-55px;
            background:#fff;
        }

        .pro-body h5{
            font-weight:600;
            margin-top:12px;
        }

        .pro-info{
            font-size:.9rem;
            color:#6c757d;
        }

        .pro-footer{
            border-top:1px solid #f0f0f0;
            padding:12px 18px 18px;
            display:flex;
            justify-content:space-between;
        }
    </style>
</head>

<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark shadow">
    <div class="container">
        <a class="navbar-brand d-flex align-items-center" href="home.jsp">
            <img src="Logo.png" width="40" class="me-2"> MyApp
        </a>

        <button class="navbar-toggler" data-bs-toggle="collapse" data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav me-auto">
                <li class="nav-item"><a class="nav-link" href="home.jsp">Home</a></li>
                <li class="nav-item"><a class="nav-link active" href="dashboard">Dashboard</a></li>
                <li class="nav-item"><a class="nav-link" href="about.jsp">About</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container my-5">
    <h2 class="text-center mb-4 fw-semibold">Company Teams</h2>

    <div class="row">

        <c:forEach items="${dto}" var="team">

            <div class="col-lg-4 col-md-6 mb-4">

                <div class="card pro-card h-100">

                    <div class="pro-header"></div>

                    <div class="text-center">
                        <img src="download?profileImage=${team.teamProfileImagePath}" class="pro-img">
                    </div>

                    <div class="card-body text-center pro-body">
                        <h5>Name:${team.teamName}</h5>
                        <div class="pro-info mb-2">Team Head: ${team.teamHead}</div>

                        <div class="pro-info">
                            <i class="bi bi-telephone"></i> ${team.phone}<br>
                            <i class="bi bi-envelope"></i> ${team.email}
                        </div>
                    </div>

                    <div class="pro-footer">
                        <a href="addMember?teamId=${team.teamId}" class="btn btn-sm btn-outline-primary">
                            Add Member
                        </a>
                        <a href="getViewMember?teamId=${team.teamId}" class="btn btn-sm btn-primary">
                            View Members
                        </a>
                    </div>

                </div>

            </div>

        </c:forEach>

    </div>
</div>

<footer class="bg-dark text-light py-3 fixed-bottom text-center">
    © 2026 MyApp
</footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
