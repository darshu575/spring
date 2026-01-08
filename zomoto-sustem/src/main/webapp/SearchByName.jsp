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

        <form action="search" method="get">
            <div class="mb-3">
                <label class="form-label fw-semibold">Restaurant Name</label>
                <input type="text" name="restourent"
                       class="form-control"
                       placeholder="Enter restaurant name">
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
                    <td>${restoName.restourentName}</td>
                </tr>
                <tr>
                    <th>Owner Name</th>
                    <td>${restoName.ownerName}</td>
                </tr>
                <tr>
                    <th>Age</th>
                    <td>${restoName.age}</td>
                </tr>
                <tr>
                    <th>Gmail</th>
                    <td>${restoName.gmail}</td>
                </tr>
                <tr>
                    <th>Number</th>
                    <td>${restoName.number}</td>
                </tr>
                <tr>
                    <th>Country</th>
                    <td>${restoName.country}</td>
                </tr>
                <tr>
                    <th>State</th>
                    <td>${restoName.state}</td>
                </tr>
                <tr>
                    <th>City</th>
                    <td>${restoName.city}</td>
                </tr>
                <tr>
                    <th>Branch</th>
                    <td>${restoName.branch}</td>
                </tr>
                <tr>
                    <th>GST Number</th>
                    <td>${restoName.gst}</td>
                </tr>
                <h4><a href ="getRestourent/${restoName.restourentName}">Edit</a></h4>
            </table>
        </c:if>

    </div>
</div>

</body>
</html>





