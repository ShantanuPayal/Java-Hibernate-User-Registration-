<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hibernate: User Registration</title>
    <style>
        /* Basic styling for header, footer, and links */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }
        header {
            background-color: #333;
            color: white;
            padding: 10px;
            text-align: center;
        }
        footer {
            background-color: #333;
            color: white;
            text-align: center;
            padding: 10px;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
        .container {
            margin: 20px auto;
            max-width: 600px;
            padding: 20px;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        a {
            display: block;
            text-decoration: none;
            padding: 10px;
            margin: 10px 0;
            background-color: #007bff;
            color: white;
            border-radius: 4px;
            text-align: center;
            transition: background-color 0.3s ease;
        }
        a:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <header>
        <h1>Hibernate: Registration of Users</h1>
        <h2>Servlets (doGet and doPost)</h2>
    </header>
    <div class="container">
        <a href="register.jsp">New User? Create Account</a>
        <a href="ViewServ">View all Registered Users</a>
    </div>
    <footer>
        &copy; Shantanu Payal 2023. All rights reserved.
    </footer>
</body>
</html>
