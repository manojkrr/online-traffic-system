<!DOCTYPE html>
<html>
<head>
    <title>Online Traffic System - Search Result</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/style/styles.css">
    <style>
        .container {
            background-image: url("BackgroundImage.png");
        }
    </style>
</head>
<body class="container">
<div style="background: black;padding: 30px;opacity: 1 !important;">
    <h1>Online Traffic System - Search Result</h1>
    <p><a href="/dashboard">Back To Dashboard</a></p>
    <table>
        <tr>
            <th>License Plate</th>
            <th>Make</th>
            <th>Model</th>
            <th>Color</th>
        </tr>
        <tr>
            <td>${vehicle.licensePlate}</td>
            <td>${vehicle.make}</td>
            <td>${vehicle.model}</td>
            <td>${vehicle.color}</td>
        </tr>
    </table>
</div>
</body>
</html>
