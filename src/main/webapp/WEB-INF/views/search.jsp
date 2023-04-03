<!DOCTYPE html>
<html>
<head>
    <title>Online Traffic System - Search</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/style/styles.css">
    <style>
        .container {
            background-image: url("BackgroundImage.png");
        }
    </style>
</head>
<body class="container">
<div style="background: black;padding: 30px;opacity: 1 !important;">
    <h1>Online Traffic System - Search</h1>
    <p><a href="/dashboard">Back To Dashboard</a></p>
    <form action="/vehicle/search" method="post">
        <label for="licensePlate">License Plate:</label>
        <input type="text" id="licensePlate" name="licensePlate" required>
        <br><br>
        <input type="submit" value="Search">
    </form>
    <br>
    <span style="color: red">${error}</span>
</div>
</body>
</html>
