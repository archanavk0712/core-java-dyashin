<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Search Employee</title>
</head>
<body>
    <h1>Search Employee by ID</h1>

    <form action="<%= request.getContextPath() %>/employees/search" method="get">
        ID: <input type="number" name="id" min="1" required>
        <input type="submit" value="Search">
    </form>

    <br/>
    <a href="<%= request.getContextPath() %>/employees">View All Employees</a> 
    <a href="<%= request.getContextPath() %>/home">Back to Home</a>
</body>
</html>
