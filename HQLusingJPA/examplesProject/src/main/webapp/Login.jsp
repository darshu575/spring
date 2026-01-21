<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
    String type = request.getParameter("type");
    if (type == null) {
        type = "User";
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title><%= type %> Login</title>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body { background-color: #f1f3f6; }
        .login-box { margin-top: 80px; }
    </style>
</head>

<body>

<!-- NAVBAR -->
<nav class="navbar navbar-dark bg-dark">
    <div class="container">
        <span class="navbar-brand">Login Portal</span>
    </div>
</nav>

<div class="container login-box">
    <div class="row">

        <!-- LEFT SIDE -->
        <div class="col-md-4">
            <div class="card shadow">
                <div class="card-header bg-secondary text-white text-center">
                    <h6>Login As</h6>
                </div>

                <div class="list-group list-group-flush">
                    <a href="login.jsp?type=Student" class="list-group-item">Student</a>
                    <a href="login.jsp?type=Employee" class="list-group-item">Employee</a>
                    <a href="login.jsp?type=Admin" class="list-group-item">Admin</a>
                    <a href="login.jsp?type=Customer" class="list-group-item">Customer</a>
                    <a href="login.jsp?type=Vendor" class="list-group-item">Vendor</a>
                    <a href="login.jsp?type=Manager" class="list-group-item">Manager</a>
                    <a href="login.jsp?type=Trainer" class="list-group-item">Trainer</a>
                    <a href="login.jsp?type=Doctor" class="list-group-item">Doctor</a>
                    <a href="login.jsp?type=Engineer" class="list-group-item">Engineer</a>
                    <a href="login.jsp?type=Guest" class="list-group-item">Guest</a>
                </div>
            </div>
        </div>

        <!-- RIGHT SIDE LOGIN FORM -->
        <div class="col-md-4 offset-md-2">
            <div class="card shadow">
                <div class="card-header bg-dark text-white text-center">
                    <h5><%= type %> Login</h5>
                </div>

                <div class="card-body">
                    <form action="loginAction" method="post">

                        <!-- Hidden Role -->
                        <input type="hidden" name="role" value="<%= type %>">

                        <div class="mb-3">
                            <label>Email</label>
                            <input type="email" class="form-control" name="email" required>
                        </div>

                        <div class="mb-3">
                            <label>Password</label>
                            <input type="password" class="form-control" name="password" required>
                        </div>

                        <div class="d-grid">
                            <button class="btn btn-dark">Login</button>
                        </div>

                    </form>
                </div>
            </div>
        </div>

    </div>
</div>

</body>
</html>
