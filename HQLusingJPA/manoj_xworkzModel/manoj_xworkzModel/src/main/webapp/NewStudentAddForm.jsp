<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-success-subtle">

<!-- Navbar -->
<nav class="navbar navbar-expand-lg bg-success bg-opacity-25 shadow-sm">
    <div class="container-fluid">

        <!-- Left: Logo + Nav -->
        <div class="d-flex align-items-center">
            <img src="Logo.png" alt="Logo" height="45" class="me-4">

            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link fw-medium text-success-emphasis" href="#">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link fw-medium text-success-emphasis" href="#">About Us</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link fw-medium text-success-emphasis" href="#">Contact Us</a>
                </li>
            </ul>
        </div>

        <!-- Right: Profile + Logout -->
        <div class="d-flex gap-2 align-items-start">

            <!-- Profile Dropdown -->
            <div class="dropdown">
                <button class="btn btn-outline-success dropdown-toggle"
                        type="button"
                        data-bs-toggle="dropdown"
                        aria-expanded="false">
                    Profile
                </button>

                <!-- Profile Popup Card -->
                <div class="dropdown-menu p-0 border-0 shadow"
                     style="min-width: 300px;">
                    <div class="card">
                        <div class="card-header bg-success text-white text-center">
                            <strong>My Profile</strong>
                        </div>
                        <div class="card-body text-start">
                            <p><strong>First Name:</strong> ${user.getFName()}</p>
                            <p><strong>Last Name:</strong> ${user.getLName()}</p>
                            <p><strong>Age:</strong> ${user.getAge()}</p>
                            <p><strong>Gender:</strong> ${user.getGender()}</p>
                            <p><strong>Email:</strong> ${user.getEmail()}</p>
                            <p><strong>Mobile:</strong> ${user.getMobile()}</p>
                        </div>
                    </div>
                </div>
            </div>


            <!-- Right: Batch Details Dropdown -->
            <div class="dropdown">

                <button class="btn btn-success dropdown-toggle"
                        type="button"
                        data-bs-toggle="dropdown"
                        aria-expanded="false">
                    Batch Details
                </button>

                <ul class="dropdown-menu dropdown-menu-end shadow">

                    <li>
                        <form action="addNewBatch" method="get">
                            <button type="submit" class="dropdown-item fw-medium">
                                Add New Batch
                            </button>
                        </form>
                    </li>

                    <li>
                        <form action="viewAllBatches" method="get">
                            <button type="submit" class="dropdown-item fw-medium">
                                View Batch Details
                            </button>
                        </form>
                    </li>


                </ul>
            </div>


            <!-- Logout -->
            <form action="logOut" method="get">
                <button type="submit" class="btn btn-success">
                    Log Out
                </button>
            </form>

        </div>
    </div>
</nav>



<!-- main content  -->
<div class="container my-5">

    <div class="row justify-content-center">
        <div class="col-md-7">

            <div class="card shadow-lg">

                <!-- Header -->
                <div class="card-header bg-success text-white text-center">
                    <h5 class="mb-0">Add New Student</h5>
                </div>

                <!-- Body -->
                <div class="card-body">

                    <form action="saveNewStudent" method="post">

                        <!-- Hidden Batch ID -->
                        <input type="hidden" name="batchId" value="${batch}">

                        <!-- Student Name -->
                        <div class="mb-3">
                            <label class="form-label fw-semibold">Student Name</label>
                            <input type="text" name="name"
                                   class="form-control"
                                   placeholder="Enter student name" required>
                        </div>

                        <!-- Email -->
                        <div class="mb-3">
                            <label class="form-label fw-semibold">Email</label>
                            <input type="email" name="email"
                                   class="form-control"
                                   placeholder="Enter email" required>
                        </div>

                        <!-- Mobile -->
                        <div class="mb-3">
                            <label class="form-label fw-semibold">Mobile</label>
                            <input type="number" name="mobile"
                                   class="form-control"
                                   placeholder="Enter mobile number" required>
                        </div>

                        <!-- Gender -->
                        <div class="mb-3">
                            <label class="form-label fw-semibold">Gender</label>
                            <select name="gender" class="form-select">
                                <option value="">Select</option>
                                <option>Male</option>
                                <option>Female</option>
                                <option>Other</option>
                            </select>
                        </div>

                        <!-- Date of Birth -->
                        <div class="mb-3">
                            <label class="form-label fw-semibold">Date of Birth</label>
                            <input type="date" name="dob" class="form-control">
                        </div>

                        <!-- Course Mode -->
                        <div class="mb-3">
                            <label class="form-label fw-semibold">Course Mode</label>
                            <select name="courseMode" class="form-select">
                                <option>Online</option>
                                <option>Offline</option>
                            </select>
                        </div>

                        <!-- Joining Date -->
                        <div class="mb-3">
                            <label class="form-label fw-semibold">Joining Date</label>
                            <input type="date" name="joiningDate"
                                   class="form-control" required>
                        </div>

                        <!-- Status -->
                        <div class="mb-3">
                            <label class="form-label fw-semibold">Status</label>
                            <select name="active" class="form-select">
                                <option value="true">Active</option>
                                <option value="false">Inactive</option>
                            </select>
                        </div>

                        <!-- Buttons -->
                        <div class="d-flex justify-content-between">
                         <!--   <a href="viewBatch?batchId=${batch}"
                               class="btn btn-secondary">
                                Cancel
                            </a> -->

                            <button type="submit" class="btn btn-success">
                                Save Student
                            </button>
                        </div>

                    </form>

                </div>
            </div>

        </div>
    </div>
</div>

${add}
${batch}

<!-- Footer -->
<footer class="bg-success bg-opacity-25 text-center py-2 ">
    <small class="text-success-emphasis">
        © 2026 Your Company Name. All rights reserved.
    </small>
</footer>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
