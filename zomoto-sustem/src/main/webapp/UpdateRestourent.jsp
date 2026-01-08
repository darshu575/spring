<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>




<!DOCTYPE html>
<html>
<head>
    <title>Add Restaurant</title>

    <!-- Bootstrap 5 CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">

            <div class="card shadow-lg">
                <div class="card-body">

                    <h2 class="text-center text-danger mb-4">
                        Upadte Restourent
                    </h2>

                    <form action="<%= request.getContextPath() %>/updateRestourent" method="post">

                        <div class="mb-3">
                            <label class="form-label">Restaurant Name</label>
                            <input type="text" name="restourentName" value="${rname.getRestourentName()}" class="form-control" />
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Owner Name</label>
                            <input type="text" name="ownerName" value=${rname.getOwnerName()} class="form-control" />
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Owner Age</label>
                            <input type="number" name="age"  value=${rname.getAge()} class="form-control" />
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Gmail</label>
                            <input type="text" name="gmail" value=${rname.getGmail()} class="form-control" />
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Phone Number</label>
                            <input type="number" name="number" value=${rname.getNumber()} class="form-control" />
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Country</label>
                            <input type="text" name="country" value=${rname.getCountry()} class="form-control" />
                        </div>

                        <div class="mb-3">
                            <label class="form-label">State</label>
                            <input type="text" name="state" value=${rname.getState()} class="form-control" />
                        </div>

                        <div class="mb-3">
                            <label class="form-label">City</label>
                            <input type="text" name="city" value=${rname.getCity()} class="form-control" />
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Branch</label>
                            <input type="text" name="branch" value=${rname.getBranch()} class="form-control" />
                        </div>

                        <div class="mb-3">
                            <label class="form-label">GST Number</label>
                            <input type="text" name="gst" value=${rname.getGst()} class="form-control" />
                        </div>

                        <div class="d-grid">
                            <input type="submit" value="Update"
                                   class="btn btn-danger btn-lg" >
                        </div>

                    </form>

                </div>
            </div>

        </div>
    </div>
</div>
</body>
</html>






