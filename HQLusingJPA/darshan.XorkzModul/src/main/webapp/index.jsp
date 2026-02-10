<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>My Application</title>

    <!-- Meta Info -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- ✅ Bootstrap 5 CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>


<body class="bg-light">

<!-- NAVBAR -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark shadow" style="position: fixed; top: 0; width: 100%; z-index: 1000">
    <div class="container">

        <!-- LOGO -->

            <!-- Replace with your logo link -->
            <img src="Logo.png" alt="Logo" width="50" class="me-2">

        </a>

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">

            <!-- LEFT NAV LINKS -->
            <ul class="navbar-nav me-auto">
                <li class="nav-item">
                    <a class="nav-link active" href="#">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">About Us</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Contact Us</a>
                </li>
            </ul>

            <!-- RIGHT BUTTONS -->
            <div class="d-flex gap-2">


            <form action="signIn" method="get">

                  <button type="submit"> Sign In</button>
            </form>
                <form action="signUp" method="get">
                                <button type="submit"> Sign Up</button>
                </form>

            </div>

        </div>
    </div>
</nav>

<!-- HERO SECTION -->
<div class="container text-center my-5">
    <h1 class="fw-bold mb-3">Welcome to X-Workz</h1>
    <p class="text-muted">
        A modern and secure platform to manage your application efficiently.
    </p>
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

<!-- ✅ Bootstrap 5 JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
