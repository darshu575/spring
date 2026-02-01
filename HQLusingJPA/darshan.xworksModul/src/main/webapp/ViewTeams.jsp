<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Teams</title>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Bootstrap Icons -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css" rel="stylesheet">

    <style>
        /* Team card styling */
        .team-card {
            border: none;
            border-radius: 12px;
            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.08);
            transition: all 0.3s ease;
            background-color: #ffffff;
            display: flex;
            flex-direction: column;
            justify-content: space-between;
        }

        .team-card:hover {
            transform: translateY(-6px);
            box-shadow: 0 12px 30px rgba(0, 0, 0, 0.15);
        }

        .team-card .card-header {
            background: linear-gradient(135deg, #4e73df, #224abe);
            font-weight: 600;
            font-size: 1.1rem;
            border-radius: 12px 12px 0 0;
            text-align: center;
            padding: 12px;
            color: white;
        }

        .team-card p {
            margin-bottom: 10px;
            color: #555;
            font-size: 0.95rem;
        }

        .team-card i {
            color: #4e73df;
            margin-right: 6px;
        }

        .team-card .card-footer {
            display: flex;
            justify-content: space-between;
            padding: 10px 12px;
        }

        .team-card .btn {
            min-width: 110px;
        }
    </style>
</head>

<body class="bg-light">

<!-- NAVBAR -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark shadow">
    <div class="container">
        <a class="navbar-brand d-flex align-items-center" href="home.jsp">
            <img src="Logo.png" width="40" class="me-2" alt="Logo"> MyApp
        </a>

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav me-auto">
                <li class="nav-item"><a class="nav-link" href="home.jsp">Home</a></li>
                <li class="nav-item"><a class="nav-link active" href="dashboard">Dashboard</a></li>
                <li class="nav-item"><a class="nav-link" href="about.jsp">About</a></li>
            </ul>

            <ul class="navbar-nav">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle d-flex align-items-center"
                       href="#" role="button" data-bs-toggle="dropdown">
                        <i class="bi bi-person-circle fs-5 me-1"></i> Profile
                    </a>
                    <ul class="dropdown-menu dropdown-menu-end">
                        <li><a class="dropdown-item" href="Profile.jsp"><i class="bi bi-person me-2"></i> View Profile</a></li>
                        <li><a class="dropdown-item" href="ChangePassword.jsp"><i class="bi bi-key me-2"></i> Change Password</a></li>
                        <li><hr class="dropdown-divider"></li>
                        <li><a class="dropdown-item text-danger" href="index.jsp"><i class="bi bi-box-arrow-right me-2"></i> Logout</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>

<!-- PAGE CONTENT -->
<div class="container my-5">
    <h2 class="text-center mb-4">Teams</h2>
    <div class="row">

        <c:forEach items="${dto}" var="team">
            <div class="col-lg-4 col-md-6 mb-4">
                <div class="card team-card h-100">

                    <!-- Card Header -->
                    <div class="card-header">
                        ${team.teamName}
                    </div>

                    <!-- Card Body -->
                    <div class="card-body">
                        <p><i class="bi bi-person-badge"></i> <strong>Team Head:</strong> ${team.teamHead}</p>
                        <p><i class="bi bi-telephone"></i> <strong>Contact:</strong> ${team.phone}</p>
                        <p><i class="bi bi-envelope"></i> <strong>Email:</strong> ${team.email}</p>
                    </div>

                    <!-- Card Footer Buttons -->
                    <div class="card-footer">
                        <a href="addMember?teamId=${team.teamId}" class="btn btn-sm btn-primary">
                            <i class="bi bi-plus-circle me-1"></i> Add Member
                        </a>

                        <a href="getViewMember?teamId=${team.teamId}" class="btn btn-sm btn-success">
                            <i class="bi bi-eye me-1"></i> View Members
                        </a>
                    </div>

                </div>
            </div>
        </c:forEach>

    </div>
</div>

<!-- FOOTER -->
<footer class="bg-dark text-light py-3 fixed-bottom">
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
