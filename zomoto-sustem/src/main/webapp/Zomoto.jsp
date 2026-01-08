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
                        Add Restaurant
                    </h2>

                    <form action="addRestorent" method="post">

                        <div class="mb-3">
                            <label class="form-label">Restaurant Name</label>
                            <input type="text" name="restourentName"class="form-control" />
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Owner Name</label>
                            <input type="text" name="ownerName" class="form-control" />
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Owner Age</label>
                            <input type="number" name="age" class="form-control" />
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Gmail</label>
                            <input type="text" name="gmail" class="form-control" />
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Phone Number</label>
                            <input type="number" name="number" class="form-control" />
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Country</label>
                            <input type="text" name="country" class="form-control" />
                        </div>

                        <div class="mb-3">
                            <label class="form-label">State</label>
                            <input type="text" name="state" class="form-control" />
                        </div>

                        <div class="mb-3">
                            <label class="form-label">City</label>
                            <input type="text" name="city" class="form-control" />
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Branch</label>
                            <input type="text" name="branch" class="form-control" />
                        </div>

                        <div class="mb-3">
                            <label class="form-label">GST Number</label>
                            <input type="text" name="gst" class="form-control" />
                        </div>

                        <div class="d-grid">
                            <input type="submit" value="Add Restaurant"
                                   class="btn btn-danger btn-lg" />
                        </div>

                    </form>

                </div>
            </div>

        </div>
    </div>
</div>

</body>
</html>











<!-- <html>
<body>
<h2>Add Restorent</h2>
<form action="addRestorent" method="post">

Restorent Name: <input type="text" name="restourentName" />
Owner Name : <input type="text" name="ownerName" />
Owner Age: <input type="number" name="age" />
Gmail  : <input type="text" name="gmail" />
PhoneNumber: <input type="number" name="number" />
Country : <input type="text" name="country" />
State : <input type="text" name="state" />
City : <input type="text" name="city" />
Branch : <input type="text" name="branch" />
GST Number :  <input type="text" name="gst" />
<input type="submit" value="Add" />
</body>
</html>
-->