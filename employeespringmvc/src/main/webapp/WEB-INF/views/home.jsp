<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee MVC</title>
</head>
<body>
    <h1>Employee Management</h1>

    <ul>
        <li>
            <a href="<%= request.getContextPath() %>/employees">
                View All Employees
            </a>
        </li>
        <li>
            <a href="<%= request.getContextPath() %>/employees/add">
                Add New Employee
            </a>
        </li>
        <li>
            <a href="<%= request.getContextPath() %>/employees/search">
                Search Employee by id
            </a>
        </li>
    </ul>

    <hr/>

    <p>Welcome to the Employee MVC application.</p>
</body>
</html>
