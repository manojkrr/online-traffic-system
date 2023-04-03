<!DOCTYPE html>
<html>
<head>
    <title>Online Traffic System - Register Vehicle</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/style/styles.css">
    <style>
        .container {
            background-image: url("BackgroundImage.png");
        }
    </style>
</head>
<body class="container">
<div style="background: black;padding: 30px;opacity: 1 !important;">
    <h1>Online Traffic System - Register Vehicle</h1>
    <p><a href="/dashboard">Back To Dashboard</a></p>
    <form action="/vehicle/register" method="post">
        <label for="licensePlate">License Plate:</label>
        <input type="text" id="licensePlate" name="licensePlate" required>
        <br><br>
        <label for="make">Make:</label>
        <input type="text" id="make" name="make" required>
        <br><br>
        <label for="model">Model:</label>
        <input type="text" id="model" name="model" required>
        <br><br>
        <label for="color">Color:</label>
        <input type="text" id="color" name="color" required>
        <br><br>
        <input type="submit" value="Register">
    </form>
    <br>
    <span style="color: green">${success}</span>
</div>
</body>
</html>
