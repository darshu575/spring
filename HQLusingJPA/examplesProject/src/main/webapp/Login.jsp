<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <meta charset="UTF-8">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body { background-color: #f1f3f6; }
        .login-type a { text-decoration: none; }
    </style>
</head>

<body>

<nav class="navbar navbar-dark bg-dark">
    <div class="container">
        <span class="navbar-brand">Login Portal</span>
    </div>
</nav>

<div class="container mt-5">
    <div class="row">

        <!-- LEFT: LOGIN TYPES -->
        <div class="col-md-4">
            <div class="card shadow">
                <div class="card-header bg-secondary text-white text-center">
                    <h6>Login As</h6>
                </div>

                <div class="list-group list-group-flush login-type">
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

        <!-- RIGHT: LOGIN FORM -->
        <div class="col-md-4 offset-md-2">

            <div class="card shadow">
                <div class="card-header bg-dark text-white text-center">
                    <h5>
                        Login
                        <%= request.getParameter("type") != null
                            ? request.getParameter("type")
                            : "" %>
                    </h5>
                </div>

                <div class="card-body">
                    <form action="login" method="post">

                        <!-- USER TYPE (HIDDEN) -->
                        <input type="hidden" name="userType"
                               value="<%= request.getParameter("type") %>">

                        <div class="mb-3">
                            <label>Email</label>
                            <input type="email" name="email" class="form-control" required>
                        </div>

                        <div class="mb-3">
                            <label>Password</label>
                            <input type="password" name="password" class="form-control" required>
                        </div>

                        <div class="d-grid">
                            <button class="btn btn-dark">Login</button>
                        </div>

                        <div class="text-danger text-center mt-2">
                            ${error}
                        </div>

                    </form>
                </div>
            </div>

        </div>

    </div>
</div>

</body>
</html>
