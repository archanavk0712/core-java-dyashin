package com.dyashin.designpattern.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.dyashin.designpattern.dto.EmployeeDTO;

public class EmployeeDAOJDBC {

    private static final String URL = "jdbc:mysql://localhost:3306/designpattern_db";
    private static final String USER = "root";
    private static final String PASSWORD = "admin@123";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public boolean saveEmp(String name, double salary) {
        String query = "INSERT INTO employee (name, salary) VALUES (?, ?)";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, name);
            ps.setDouble(2, salary);
            int rows = ps.executeUpdate();
            System.out.println(rows > 0 ? "Inserted Successfully (JDBC)" : "Insert Failed (JDBC)");
            return rows > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateEmp(int id, String name, double salary) {
        String query = "UPDATE employee SET name=?, salary=? WHERE id=?";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, name);
            ps.setDouble(2, salary);
            ps.setInt(3, id);
            int rows = ps.executeUpdate();
            System.out.println(rows > 0 ? "Updated Successfully (JDBC)" : "Update Failed (JDBC)");
            return rows > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteEmp(int id) {
        String query = "DELETE FROM employee WHERE id=?";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            System.out.println(rows > 0 ? "Deleted Successfully (JDBC)" : "Delete Failed (JDBC)");
            return rows > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void getAllEmployeeData() {
        String query = "SELECT * FROM employee";
        List<EmployeeDTO> list = new ArrayList<>();
        try (Connection con = getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {

            while (rs.next()) {
                list.add(new EmployeeDTO(rs.getInt("id"), rs.getString("name"), rs.getDouble("salary")));
            }

            System.out.println("\n=== JDBC Employee List ===");
            list.forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getParticularId(int id) {
        String query = "SELECT * FROM employee WHERE id=?";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                EmployeeDTO emp = new EmployeeDTO(rs.getInt("id"), rs.getString("name"), rs.getDouble("salary"));
                System.out.println("\nFetched Employee (JDBC): " + emp);
            } else {
                System.out.println("Employee not found (JDBC)");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void saveOrUpdateEmployee(int id, String name, double salary) {
    	EmployeeDTO emp = new EmployeeDTO(id, name, salary);
        String checkSql = "SELECT COUNT(*) FROM employee WHERE id = ?";
        String insertSql = "INSERT INTO employee (name, salary) VALUES (?, ?)";
        String updateSql = "UPDATE employee SET name=?, salary=? WHERE id=?";

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {

            // Check if employee exists by ID
            PreparedStatement checkStmt = con.prepareStatement(checkSql);
            checkStmt.setInt(1, emp.getId());
            ResultSet rs = checkStmt.executeQuery();
            rs.next();
            boolean exists = rs.getInt(1) > 0;

            if (exists) {
                // 🔁 Update existing record
                PreparedStatement ps = con.prepareStatement(updateSql);
                ps.setString(1, emp.getName());
                ps.setDouble(2, emp.getSalary());
                ps.setInt(3, emp.getId());
                ps.executeUpdate();
                System.out.println("Employee updated successfully (JDBC)");
            } else {
                // ✅ Insert new record
                PreparedStatement ps = con.prepareStatement(insertSql);
                ps.setString(1, emp.getName());
                ps.setDouble(2, emp.getSalary());
                ps.executeUpdate();
                System.out.println("New employee saved successfully (JDBC)");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
