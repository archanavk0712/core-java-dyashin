
package com.dyashin.myjdbcapp.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class OtherThanSelectDELETE {

	public static void main(String[] args) throws ClassNotFoundException {

		Connection conn = null;
		int rs = 0;
		Statement stmt = null;

		// 1.Load the Driver
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			//2. Get the db connection via driver
			String dburl = "jdbc:mysql://localhost:3306/dyashin_sql?user=root&password=admin@123";
			System.out.println("dburl>>" + dburl);
			conn = DriverManager.getConnection(dburl);

			//3. issue the sql queries via conn
			String query = "delete from emp2 where name='arc'";
			stmt = conn.createStatement();
			rs = stmt.executeUpdate(query);

			// process the result returned by sql
			
			System.out.println(rs);
		
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}

