<!DOCTYPE html>
<html>
<head>
    <title>Index</title>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body { background-color: #f1f3f6; }
        .card { border-radius: 15px; }
    </style>
</head>

<body>

<nav class="navbar navbar-dark bg-dark">
    <div class="container">
        <span class="navbar-brand">Registration Portal</span>
    </div>

                 <form action="SignIn" method="get">
                  <button type="submit"> Sign In</button>

                  </form>
</nav>

<div class="container my-5">
    <div class="row g-4">

        <!-- 1 Student -->
        <div class="col-md-4">
            <div class="card shadow text-center">
                <div class="card-header bg-primary text-white">Student</div>
                <div class="card-body">
                    <p>Student Registration</p>
                    <a href="register.jsp?type=Student" class="btn btn-primary btn-sm">Register</a>
                </div>
            </div>
        </div>

        <!-- 2 Employee -->
        <div class="col-md-4">
            <div class="card shadow text-center">
                <div class="card-header bg-success text-white">Employee</div>
                <div class="card-body">
                    <p>Employee Registration</p>
                    <a href="register.jsp?type=Employee" class="btn btn-success btn-sm">Register</a>
                </div>
            </div>
        </div>

        <!-- 3 Admin -->
        <div class="col-md-4">
            <div class="card shadow text-center">
                <div class="card-header bg-danger text-white">Admin</div>
                <div class="card-body">
                    <p>Admin Registration</p>
                    <a href="register.jsp?type=Admin" class="btn btn-danger btn-sm">Register</a>
                </div>
            </div>
        </div>

        <!-- 4 Customer -->
        <div class="col-md-4">
            <div class="card shadow text-center">
                <div class="card-header bg-warning">Customer</div>
                <div class="card-body">
                    <p>Customer Registration</p>
                    <a href="register.jsp?type=Customer" class="btn btn-warning btn-sm">Register</a>
                </div>
            </div>
        </div>

        <!-- 5 Vendor -->
        <div class="col-md-4">
            <div class="card shadow text-center">
                <div class="card-header bg-info text-white">Vendor</div>
                <div class="card-body">
                    <p>Vendor Registration</p>
                    <a href="register.jsp?type=Vendor" class="btn btn-info btn-sm">Register</a>
                </div>
            </div>
        </div>

        <!-- 6 Manager -->
        <div class="col-md-4">
            <div class="card shadow text-center">
                <div class="card-header bg-secondary text-white">Manager</div>
                <div class="card-body">
                    <p>Manager Registration</p>
                    <a href="register.jsp?type=Manager" class="btn btn-secondary btn-sm">Register</a>
                </div>
            </div>
        </div>

        <!-- 7 Trainer -->
        <div class="col-md-4">
            <div class="card shadow text-center">
                <div class="card-header bg-dark text-white">Trainer</div>
                <div class="card-body">
                    <p>Trainer Registration</p>
                    <a href="register.jsp?type=Trainer" class="btn btn-dark btn-sm">Register</a>
                </div>
            </div>
        </div>

        <!-- 8 Doctor -->
        <div class="col-md-4">
            <div class="card shadow text-center">
                <div class="card-header bg-success text-white">Doctor</div>
                <div class="card-body">
                    <p>Doctor Registration</p>
                    <a href="register.jsp?type=Doctor" class="btn btn-success btn-sm">Register</a>
                </div>
            </div>
        </div>

        <!-- 9 Engineer -->
        <div class="col-md-4">
            <div class="card shadow text-center">
                <div class="card-header bg-primary text-white">Engineer</div>
                <div class="card-body">
                    <p>Engineer Registration</p>
                    <a href="register.jsp?type=Engineer" class="btn btn-primary btn-sm">Register</a>
                </div>
            </div>
        </div>

        <!-- 10 Guest -->
        <div class="col-md-4">
            <div class="card shadow text-center">
                <div class="card-header bg-light">Guest</div>
                <div class="card-body">
                    <p>Guest Registration</p>
                    <a href="register.jsp?type=Guest" class="btn btn-outline-dark btn-sm">Register</a>
                </div>
            </div>
        </div>

    </div>
</div>

</body>
</html>
