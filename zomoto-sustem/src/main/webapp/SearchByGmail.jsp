<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <title>Zomato</title>

    <!-- Bootstrap 5 CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>

<body class="bg-light">

<div class="container vh-100 d-flex justify-content-center align-items-center">
    <div class="card shadow-lg p-4" style="width: 420px;">

        <h4 class="text-center text-danger mb-3">Search Restaurant</h4>

        <form action="searchByNumber" method="get">
            <div class="mb-3">
                <label class="form-label fw-semibold">Gmail</label>
                <input type="text" name="gmail"
                       class="form-control"
                       placeholder="Enter Gmail ">
            </div>

            <div class="d-grid mb-3">
                <input type="submit"
                       value="Search"
                       class="btn btn-danger btn-lg">
            </div>
        </form>

        <!-- Result Section -->
        <c:if test="${not empty restoName}">
            <hr>

            <h5 class="text-success text-center mb-3">Restaurant Details</h5>

            <table class="table table-bordered table-sm">
                <tr>
                    <th>Restaurant Name</th>
                    <td>${gmail.restourentName}</td>
                </tr>
                <tr>
                    <th>Owner Name</th>
                    <td>${gmail.ownerName}</td>
                </tr>
                <tr>
                    <th>Age</th>
                    <td>${gmail.age}</td>
                </tr>
                <tr>
                    <th>Gmail</th>
                    <td>${gmail.gmail}</td>
                </tr>
                <tr>
                    <th>Number</th>
                    <td>${gmail.number}</td>
                </tr>
                <tr>
                    <th>Country</th>
                    <td>${gmail.country}</td>
                </tr>
                <tr>
                    <th>State</th>
                    <td>${gmail.state}</td>
                </tr>
                <tr>
                    <th>City</th>
                    <td>${gmail.city}</td>
                </tr>
                <tr>
                    <th>Branch</th>
                    <td>${gmail.branch}</td>
                </tr>
                <tr>
                    <th>GST Number</th>
                    <td>${gmail.gst}</td>
                </tr>
            </table>
        </c:if>

    </div>
</div>

</body>
</html>





