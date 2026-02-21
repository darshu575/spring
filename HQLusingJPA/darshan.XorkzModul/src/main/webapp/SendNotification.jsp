<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Member Emails</title>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap 5 CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            padding-top: 80px;
        }
        .card {
            border-radius: 15px;
        }
        .table thead {
            background-color: #343a40;
            color: white;
        }
    </style>
</head>

<body class="bg-light">

<!-- NAVBAR -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark shadow fixed-top">
    <div class="container">

        <a class="navbar-brand d-flex align-items-center" href="#">
            <img src="Logo.png" alt="Logo" width="45" class="me-2">
            <span class="fw-bold">My Application</span>
        </a>

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">

            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link active" href="#">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">About</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Contact</a>
                </li>
            </ul>

        </div>
    </div>
</nav>

<!-- MAIN CONTENT -->
<div class="container">

    <div class="card shadow p-4">
        <h2 class="text-center mb-4 text-primary">📧 Member Email Details</h2>

        <div class="table-responsive">
            <table class="table table-bordered table-hover align-middle text-center">
                <thead>
                    <tr>
                     <th>Member ID</th>
                        <th>Member Name</th>


                        <th>Email</th>
                        <th>Team ID</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${memberEmails}" var="member">
                        <tr>
                            <td class="fw-semibold">${member.memberName}</td>

                            <td>${member.memberId}</td>
                            <td>${member.email}</td>
                            <td>${member.teamId}</td>
                        </tr>

                    </c:forEach>


                    <c:if test="${empty memberEmails}">
                        <tr>
                            <td colspan="5" class="text-danger fw-bold">
                                No Members Found
                            </td>
                        </tr>
                    </c:if>
                </tbody>
            </table>

                <form action="sendAllEmails" method="post">
                    <button type="submit" class="btn btn-danger mb-3">
                        📧 Send Email To All Members
                    </button>
                </form>
        </div>
    </div>

</div>

<!-- FOOTER -->
<footer class="bg-dark text-light py-3 mt-5">
    <div class="container text-center">
        <small>
            © 2026 My Application |
            <a href="#" class="text-decoration-none text-secondary">Privacy Policy</a> |
            <a href="#" class="text-decoration-none text-secondary">Contact</a>
        </small>
    </div>
</footer>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>