package executingQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Exercise1 {
	static final String DB_URL = "jdbc:mysql://localhost/employee";
	static final String USER = "root";
	static final String PASS = "Maran@37";
	static final String QUERY = "SELECT emp_no, ename FROM emp";

	public static void main(String[] args) {

		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(QUERY);) {
			while (rs.next()) {
				System.out.println("Employee No: " + rs.getInt("emp_no"));
				System.out.println("Employee Name: " + rs.getString("ename"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
