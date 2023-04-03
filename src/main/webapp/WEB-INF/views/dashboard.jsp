<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/style/styles.css">
    <style>
        .container {
            background-image: url("BackgroundImage.png");
        }
    </style>
</head>
<body class="container">
<div style="background: black;padding: 30px;opacity: 1 !important;">
    <h1>Welcome to the Online Traffic System</h1>
    <p>Click <a href="/vehicle">here</a> to search for a vehicle.</p>
    <p><a href="/vehicle/all">hereAll vehicles Registered.</a></p>
    <p><a href="/vehicle/register">Register a Vehicle</a></p>
    <p><a href="/">Logout</a></p>
</div>
</body>
</html>
