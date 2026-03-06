<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.dyashin.employeespringmvc.dto.EmployeeDTO" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee Details</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 40px; }
        .container { max-width: 600px; margin: 0 auto; }
        table { border-collapse: collapse; width: 100%; margin: 20px 0; }
        th, td { border: 1px solid #ddd; padding: 12px; text-align: left; }
        th { background-color: #f2f2f2; font-weight: bold; }
        .error { color: red; background: #ffe6e6; padding: 10px; border-radius: 5px; }
        .actions { margin: 20px 0; }
        .actions a { 
            display: inline-block; 
            padding: 8px 16px; 
            margin: 5px; 
            text-decoration: none; 
            border-radius: 4px; 
            color: white; 
        }
        .btn-edit { background-color: #007bff; }
        .btn-delete { background-color: #dc3545; }
        .btn-list { background-color: #28a745; }
        .btn-home { background-color: #6c757d; }
    </style>
</head>
<body>
    <div class="container">
        <h1>Employee Details</h1>
        
        <%
            EmployeeDTO employee = (EmployeeDTO) request.getAttribute("employee");
            if (employee != null) {
        %>
            <table>
                <tr>
                    <th><strong>ID:</strong></th>
                    <td><%= employee.getId() %></td>
                </tr>
                <tr>
                    <th><strong>Full Name:</strong></th>
                    <td><%= employee.getFirstName() %> 
                        <%= employee.getMiddleName() != null ? employee.getMiddleName() + " " : "" %>
                        <%= employee.getLastName() %></td>
                </tr>
                <tr>
                    <th><strong>Email:</strong></th>
                    <td><%= employee.getEmail() %></td>
                </tr>
                <tr>
                    <th><strong>Phone:</strong></th>
                    <td><%= employee.getPhoneNo() %></td>
                </tr>
                <tr>
                    <th><strong>Age:</strong></th>
                    <td><%= employee.getAge() %></td>
                </tr>
                <tr>
                    <th><strong>Gender:</strong></th>
                    <td><%= employee.getGender() %></td>
                </tr>
                <tr>
                    <th><strong>Salary:</strong></th>
                    <td><%= employee.getSalary() %></td>
                </tr>
                <tr>
                    <th><strong>Date of Birth:</strong></th>
                    <td><%= employee.getDob() != null ? employee.getDob() : "N/A" %></td>
                </tr>
                <tr>
                    <th><strong>Joining Date:</strong></th>
                    <td><%= employee.getJoiningDate() != null ? employee.getJoiningDate() : "N/A" %></td>
                </tr>
                <tr>
                    <th><strong>Department:</strong></th>
                    <td><%= employee.getDepartmentNo() %></td>
                </tr>
                <tr>
                    <th><strong>Experience:</strong></th>
                    <td><%= employee.getExperience() %> years</td>
                </tr>
                <tr>
                    <th><strong>Designation:</strong></th>
                    <td><%= employee.getDesignation() %></td>
                </tr>
            </table>

            <div class="actions">
                <a href="<%= request.getContextPath() %>/employees/edit/<%= employee.getId() %>" 
                   class="btn-edit">Edit Employee</a>
                <a href="<%= request.getContextPath() %>/employees/delete/<%= employee.getId() %>"
                   class="btn-delete" 
                   onclick="return confirm('Are you sure you want to delete this employee?');">
                   Delete Employee</a>
            </div>
            
        <% } else { %>
            <div class="error">
                <h3>Employee Not Found</h3>
                <p>The requested employee does not exist in the database.</p>
            </div>
        <% } %>

        <div class="actions">
            <a href="<%= request.getContextPath() %>/employees" class="btn-list">Back to Employee List</a>
            <a href="<%= request.getContextPath() %>/home" class="btn-home">Back to Home</a>
        </div>
    </div>
</body>
</html>
