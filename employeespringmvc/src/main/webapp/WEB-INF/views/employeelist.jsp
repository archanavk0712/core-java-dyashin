<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="com.dyashin.employeespringmvc.dto.EmployeeDTO" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employees</title>
</head>
<body>
    <h1>Employee List</h1>

    <%
        List<EmployeeDTO> employees = (List<EmployeeDTO>) request.getAttribute("employees");
    %>

    <table border="1" cellpadding="5" cellspacing="0" style="width:100%">
        <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Middle Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Phone</th>
            <th>Age</th>
            <th>Gender</th>
            <th>Salary</th>
            <th>DOB</th>
            <th>Joining Date</th>
            <th>Dept No</th>
            <th>Experience</th>
            <th>Designation</th>
            <th>Actions</th>
        </tr>

        <%
            if (employees != null && !employees.isEmpty()) {
                for (EmployeeDTO e : employees) {
        %>
                    <tr>
                        <td><%= e.getId() %></td>
                        <td><%= e.getFirstName() != null ? e.getFirstName() : "" %></td>
                        <td><%= e.getMiddleName() != null ? e.getMiddleName() : "" %></td>
                        <td><%= e.getLastName() != null ? e.getLastName() : "" %></td>
                        <td><%= e.getEmail() != null ? e.getEmail() : "" %></td>
                        <td><%= e.getPhoneNo() != null ? e.getPhoneNo() : ""%></td>
                        <td><%= e.getAge() %></td>
                        <td><%= e.getGender() != null ? e.getGender() : "" %></td>
                        <td><%= e.getSalary() %></td>
                        <td><%= e.getDob() != null ? e.getDob() : "" %></td>
                        <td><%= e.getJoiningDate() != null ? e.getJoiningDate() : "" %></td>
                        <td><%= e.getDepartmentNo() %></td>
                        <td><%= e.getExperience() %></td>
                        <td><%= e.getDesignation() != null ? e.getDesignation() : "" %></td>
                        <td>
                            <a href="<%= request.getContextPath() %>/employees/<%= e.getId() %>">View</a> |
                            <a href="<%= request.getContextPath() %>/employees/edit/<%= e.getId() %>">Edit</a> |
                            <a href="<%= request.getContextPath() %>/employees/delete/<%= e.getId() %>"
                               onclick="return confirm('Delete employee <%= e.getFirstName() %> <%= e.getLastName() %>?');">Delete</a>
                        </td>
                    </tr>
        <%
                }
            } else {
        %>
            <tr>
                <td colspan="15" style="text-align:center; padding:20px;">No employees found.</td>
            </tr>
        <%
            }
        %>
    </table>

    <br/>
    <a href="<%= request.getContextPath() %>/employees/add">Add New Employee</a> |
    <a href="<%= request.getContextPath() %>/employees/search">Search Employee</a>
    <br/><br/>
    <a href="<%= request.getContextPath() %>/home">Back to Home</a>
</body>
</html>
