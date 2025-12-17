

<!DOCTYPE html>
<html>
<head>
    <title>Hotel Food</title>

    <!-- Bootstrap CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">

            <div class="card shadow">
                <div class="card-header bg-success text-white text-center">
                    <h4>Welcome to Hotel</h4>
                </div>

                <div class="card-body">
                    <h5 class="text-center mb-4">Add Food</h5>

                    <form action="addFood" method="post">

                        <div class="mb-3">
                            <label class="form-label">Hotel Name</label>
                            <input type="text" name="hotelName" class="form-control"
                                   placeholder="Enter Hotel Name">
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Location</label>
                            <input type="text" name="location" class="form-control"
                                   placeholder="Enter Location">
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Food Type</label>
                            <select name="foodType" class="form-select">
                                <option value="">Select</option>
                                <option value="Veg">Veg</option>
                                <option value="Non Veg">Non Veg</option>
                            </select>
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Food Name</label>
                            <input type="text" name="foodName" class="form-control"
                                   placeholder="Enter Food Name">
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Price</label>
                            <input type="number" name="price" class="form-control"
                                   placeholder="Enter Price">
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Quantity</label>
                            <input type="number" name="quantity" class="form-control"
                                   placeholder="Enter Quantity">
                        </div>

                        <div class="d-grid">
                            <button type="submit" class="btn btn-success">
                                Add Food
                            </button>
                        </div>

                    </form>
                </div>
            </div>

        </div>
    </div>
</div>
<script>
function validateForm() {
    let foodType = document.forms[0]["foodType"].value;

    if (foodType === "") {
        alert("Please select Food Type (Veg / Non Veg)");
        return false;
    }
    return true;
}
</script>

</body>
</html>




















<!--
<html>
<body>
<h2>Well Come to Hotel</h2>
<form action="addFood" method="post">
<h2> Add Food </h2>

Hostel Name: <input type="text" name="hotelName" />
Location : <input type="text" name="location" />
Food type : <input type="text" name="foodType" />
Food Name : <input type="text" name="foodName" />
Price  : <input type="number" name="price" />
Quantity : <input type="number" name="quantity" />
<input type="submit" name="Add" />
</body>
</html>

-->
