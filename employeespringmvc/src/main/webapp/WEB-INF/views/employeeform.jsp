<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Employee Form</title>
    <style>
    .error-msg { color: red; font-size: 13px; padding-left: 5px; }
    input.invalid, select.invalid { border: 1px solid red; }
    input.valid, select.valid { border: 1px solid green; }
</style>
</head>
<body>
    <%
    	com.dyashin.employeespringmvc.dto.EmployeeDTO employee = (com.dyashin.employeespringmvc.dto.EmployeeDTO) request.getAttribute("employee");
        boolean isEdit = (employee != null && employee.getId() > 0);
        String formAction = isEdit ? request.getContextPath() + "/employees/update" : request.getContextPath() + "/employees/add";
        String submitButton = isEdit ? "Update Employee" : "Save Employee";
    %>
    
    <h1><%= isEdit ? "Edit Employee" : "Add New Employee" %></h1>
    
    <%
        String msg = (String) request.getAttribute("msg");
        String error = (String) request.getAttribute("error");
        if (msg != null && !msg.isEmpty()) {
    %>
        <p style="color: green;"><%= msg %></p>
    <%
        }
        if (error != null && !error.isEmpty()) {
    %>
        <p style="color: red;"><%= error %></p>
    <%
        }
    %>

   <form name="empForm" action="<%= formAction %>" method="post" onsubmit="return validateForm()">

    <% if (isEdit) { %>
        <input type="hidden" name="id" value="<%= employee.getId() %>"/>
    <% } %>

    First Name: <input type="text" name="firstName" onkeyup="liveValidate()" value="<%= employee != null ? employee.getFirstName() : "" %>" required>
    <span id="firstNameErr" class="error-msg"></span><br/>

    Middle Name: <input type="text" name="middleName" value="<%= employee != null ? employee.getMiddleName() : "" %>"><br/>

    Last Name: <input type="text" name="lastName" onkeyup="liveValidate()" value="<%= employee != null ? employee.getLastName() : "" %>" required>
    <span id="lastNameErr" class="error-msg"></span><br/>

    Email: <input type="email" name="email" onkeyup="liveValidate()" value="<%= employee != null ? employee.getEmail() : "" %>" required>
    <span id="emailErr" class="error-msg"></span><br/>

    Phone: <input type="text" name="phoneNo" onkeyup="liveValidate()" value="<%= employee != null ? String.valueOf(employee.getPhoneNo()) : "" %>" required>
    <span id="phoneErr" class="error-msg"></span><br/>

    Age: <input type="number" name="age" oninput="liveValidate()" value="<%= employee != null ? String.valueOf(employee.getAge()) : "" %>" min="18" max="100">
    <span id="ageErr" class="error-msg"></span><br/>

    Gender:
    <select name="gender" onchange="liveValidate()" required>
        <option value="">--Select--</option>
        <option value="Male" <%= employee != null && "Male".equals(employee.getGender()) ? "selected" : "" %>>Male</option>
        <option value="Female" <%= employee != null && "Female".equals(employee.getGender()) ? "selected" : "" %>>Female</option>
        <option value="Other" <%= employee != null && "Other".equals(employee.getGender()) ? "selected" : "" %>>Other</option>
    </select>
    <span id="genderErr" class="error-msg"></span><br/>

    Salary: <input type="number" name="salary" oninput="liveValidate()" value="<%= employee != null ? String.valueOf(employee.getSalary()) : "0.0" %>" step="0.01" min="0">
    <span id="salaryErr" class="error-msg"></span><br/>

    Date of Birth: <input type="date" name="dob" onchange="liveValidate()" value="<%= employee != null ? employee.getDob() : "" %>">
    <span id="dobErr" class="error-msg"></span><br/>

    Joining Date: <input type="date" name="joiningDate" onchange="liveValidate()" value="<%= employee != null ? employee.getJoiningDate() : "" %>">
    <span id="joiningErr" class="error-msg"></span><br/>

    Department No: <input type="number" name="departmentNo" min="1"><br/>

    Experience (years): <input type="number" name="experience" min="0" max="50"><br/>

    Designation: <input type="text" name="designation" onkeyup="liveValidate()" value="<%= employee != null ? employee.getDesignation() : "" %>">
    <span id="designationErr" class="error-msg"></span><br/>

    <input type="submit" value="<%= submitButton %>">
</form>
    
    <br/><br/>
    <a href="<%= request.getContextPath() %>/home">Back to Home</a>
    <a href="<%= request.getContextPath() %>/employees">View All Employees</a>
    
    <script>
function setError(field, message) {
    document.getElementById(field + "Err").innerText = message;
    document.forms["empForm"][field].classList.add("invalid");
    document.forms["empForm"][field].classList.remove("valid");
}

function clearError(field) {
    document.getElementById(field + "Err").innerText = "";
    document.forms["empForm"][field].classList.remove("invalid");
    document.forms["empForm"][field].classList.add("valid");
}

function liveValidate() {

    let f = document.forms["empForm"];

    let nameRegex = /^[A-Za-z]+$/;
    let phoneRegex = /^[0-9]{10}$/;
    let emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    // Field validation
    (!nameRegex.test(f.firstName.value.trim())) ? setError("firstName", "Only alphabets allowed") : clearError("firstName");
    (!nameRegex.test(f.lastName.value.trim())) ? setError("lastName", "Only alphabets allowed") : clearError("lastName");
    (!emailRegex.test(f.email.value.trim())) ? setError("email", "Invalid email format") : clearError("email");
    (!phoneRegex.test(f.phoneNo.value.trim())) ? setError("phone", "Phone must be 10 digits") : clearError("phone");

    if (f.age.value < 18 || f.age.value > 60) setError("age", "Age must be between 18–60");
    else clearError("age");

    if (f.gender.value === "") setError("gender", "Select gender");
    else clearError("gender");

    if (f.salary.value <= 0) setError("salary", "Enter valid salary");
    else clearError("salary");

    if (f.dob.value === "") setError("dob", "Select DOB");
    else clearError("dob");

    if (f.joiningDate.value === "") setError("joining", "Select Joining Date");
    else if (f.dob.value >= f.joiningDate.value) setError("joining", "Joining must be after DOB");
    else clearError("joining");

    if (f.designation.value.trim().length < 2) setError("designation", "Enter valid designation");
    else clearError("designation");
}

function validateForm() {
    liveValidate();

    let errors = document.querySelectorAll(".error-msg:not(:empty)");
    return errors.length === 0;
}
</script>
    
</body>
</html>
