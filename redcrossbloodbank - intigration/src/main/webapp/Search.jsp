<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home</title>

    <!-- Bootstrap 5 CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<!-- NAVBAR -->
<nav class="navbar navbar-expand-lg navbar-dark bg-danger">
    <div class="container">
        <a class="navbar-brand fw-bold" href="#">My Application</a>

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link active" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Search.jsp">Search</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="login.jsp">Login</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<!-- SEARCH FORM -->
<div class="container mt-4">
    <div class="card shadow">
        <div class="card-header bg-danger text-white">
            <h5 class="mb-0">Search Donor by Email</h5>
        </div>
        <div class="card-body">
            <form action="searchbyGmail" method="get">
                <div class="mb-3">
                    <label class="form-label">Email Address *</label>
                    <input type="email" class="form-control" name="donorGmail" required>
                </div>
                <div class="d-grid">
                    <button type="submit" class="btn btn-danger">Search</button>
                </div>
            </form>

            <!-- ERROR MESSAGE -->
            <c:if test="${not empty error}">
                <div class="alert alert-danger mt-3">
                    ${error}
                </div>
            </c:if>
        </div>
    </div>
</div>

<!-- RESULT TABLE -->
<c:if test="${not empty dto}">
    <div class="container mt-4">
        <div class="card shadow">
            <div class="card-header bg-success text-white">
                <h5 class="mb-0">Donor Details</h5>
            </div>
            <div class="card-body">
                <table class="table table-bordered table-striped">
                    <tbody>
                        <tr>
                            <th>Donor Account ID</th>
                            <td>${dto.donorAccountID}</td>
                        </tr>
                        <tr>
                            <th>First Name</th>
                            <td>${dto.donorFirstName}</td>
                        </tr>
                        <tr>
                            <th>Last Name</th>
                            <td>${dto.donorLastName}</td>
                        </tr>
                        <tr>
                            <th>User Name</th>
                            <td>${dto.userName}</td>
                        </tr>
                        <tr>
                            <th>Date of Birth</th>
                            <td>${dto.donorDob}</td>
                        </tr>
                        <tr>
                            <th>Zip Code</th>
                            <td>${dto.donorZipCode}</td>
                        </tr>
                        <tr>
                            <th>Phone Number</th>
                            <td>${dto.donorPhoneNumber}</td>
                        </tr>
                        <tr>
                            <th>Email</th>
                            <td>${dto.donorGmail}</td>
                        </tr>
                        <tr>
                            <th>Password</th>
                            <td>${dto.password}</td>
                        </tr>
                        <tr>
                            <th>Confirm Password</th>
                            <td>${dto.confirmPassword}</td>
                        </tr>
                        <h4><a href="getDonors/${dto.donorGmail}">Edit</a></h4>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</c:if>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
