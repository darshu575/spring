<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

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
        .team-card {
            border: none;
            border-radius: 15px;
            background: linear-gradient(145deg, #f0f3ff, #d9e0ff);
            box-shadow: 8px 8px 20px #c5cbe5, -8px -8px 20px #ffffff;
            transition: all 0.3s ease;
            overflow: hidden;
        }

        .team-card:hover {
            transform: translateY(-10px) scale(1.02);
            box-shadow: 12px 12px 25px #b0b7d8, -12px -12px 25px #ffffff;
        }

        .team-card .card-header {
            background: linear-gradient(90deg, #6a11cb, #2575fc);
            color: #fff;
            font-weight: 700;
            font-size: 1.2rem;
            text-align: center;
            padding: 15px;
            border-radius: 15px 15px 0 0;
        }

        .team-card .card-body {
            padding: 15px;
        }

        .team-card p {
            margin-bottom: 10px;
            color: #333;
            font-size: 0.95rem;
        }

        .team-card i {
            color: #2575fc;
            margin-right: 6px;
        }

        .team-card button {
            background: #2575fc;
            color: white;
            border-radius: 8px;
            border: none;
            padding: 6px 12px;
            transition: all 0.3s ease;
            margin-top: 8px;
        }

        .team-card button:hover {
            background: #6a11cb;
            transform: scale(1.05);
        }
    </style>


</head>

<body class="bg-light">

<!-- NAVBAR -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark shadow">
    <div class="container">

        <!-- LOGO -->
        <a class="navbar-brand d-flex align-items-center" href="home.jsp">
            <img src="Logo.png" width="40" class="me-2">
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
<div class="container my-5">
    <div class="row">

      <c:forEach items="${members}" var="member">
          <div class="card mb-3 shadow-sm" style="max-width: 400px;">
              <div class="row g-0">
                  <div class="col-md-4 text-center p-2">
                      <c:choose>
                          <c:when test="${not empty member.profileImagePath}">
                              <img src="${member.profileImagePath}" class="rounded-circle"
                                   style="width:100px; height:100px; object-fit:cover;">
                          </c:when>
                          <c:otherwise>
                              <img src="/member-images/${fn:substringAfterLast(member.profileImagePath,'/')}"
                                                       class="card-img-top" alt="Profile Image"

                                   style="width:100px; height:100px; object-fit:cover;">
                          </c:otherwise>
                      </c:choose>
                  </div>
                  <div class="col-md-8">
                      <div class="card-body">
                           <p><i class="bi bi-person"></i> <strong>Age:</strong> ${member.age}</p>
                                                <p><i class="bi bi-gender-ambiguous"></i> <strong>Gender:</strong> ${member.gender}</p>
                                                <p><i class="bi bi-envelope"></i> <strong>Email:</strong> ${member.email}</p>
                                                <p><i class="bi bi-telephone"></i> <strong>Contact:</strong> ${member.phoneNumber}</p>
                      </div>
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
