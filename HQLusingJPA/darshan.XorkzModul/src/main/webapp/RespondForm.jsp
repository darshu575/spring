<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <title>Member Event Response</title>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap 5 CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background: linear-gradient(to right, #4e73df, #1cc88a);
            min-height: 100vh;
        }
        .card {
            border-radius: 15px;
        }
    </style>
</head>

<body class="d-flex align-items-center justify-content-center">

<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-7">

            <div class="card shadow-lg">

                <div class="card-header bg-primary text-white text-center">
                    <h4>Team Event Response Form</h4>
                </div>

                <div class="card-body p-4">

                    <form action="saveResponse" method="post">

                        <!-- Hidden Member ID -->
                        <input type="hidden" name="memberId" value="${memberId}" />

                        <!-- Member Name -->
                        <div class="mb-3">
                            <label class="form-label">Member Name</label>
                            <input type="text" class="form-control"
                                   name="memberName"
                                   value="${memberName}"
                                   readonly>
                        </div>

                        <!-- Email -->
                        <div class="mb-3">
                            <label class="form-label">Email</label>
                            <input type="email" class="form-control"
                                   name="email"
                                   value="${email}"
                                   readonly>
                        </div>
                        <!-- Number -->
                                                <div class="mb-3">
                                                    <label class="form-label">Phone Number</label>
                                                    <input type="text" class="form-control"
                                                           name="number"
                                                          >
                                                </div>

                        <!-- Attendance -->
                        <div class="mb-3">
                            <label class="form-label">Will You Attend?</label>
                            <select class="form-select" name="attendanceStatus" required>
                                <option value="">-- Select Option --</option>
                                <option value="YES">Yes, I will attend</option>
                                <option value="NO">No, I cannot attend</option>
                                <option value="MAYBE">Maybe</option>
                            </select>
                        </div>

                        <!-- Available Date -->
                        <div class="mb-3">
                            <label class="form-label">Available Date</label>
                            <input type="date" class="form-control"
                                   name="availableDate">
                        </div>



                        <!-- Comments -->
                        <div class="mb-3">
                            <label class="form-label">Additional Comments</label>
                            <textarea class="form-control"
                                      name="comments"
                                      rows="3"
                                      placeholder="Write your comments here..."></textarea>
                        </div>

                        <div class="d-grid">
                            <button type="submit" class="btn btn-success">
                                Submit Response
                            </button>
                        </div>

                    </form>

                </div>

                <div class="card-footer text-center text-muted">
                    X-Workz Team Management System
                </div>

            </div>

        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>