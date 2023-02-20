package executingQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Exercise2 {

	static final String DB_URL = "jdbc:mysql://localhost/employee";
	static final String USER = "root";
	static final String PASS = "Maran@37";
	static final String QUERY = "SELECT ename, job, sal, comm FROM emp WHERE sal > 1000 and sal < 2000";
	public static void main(String[] args) {

		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(QUERY);) {
			while (rs.next()) {
				System.out.println("Employee Name: " + rs.getString("ename"));
				System.out.println("Job : " + rs.getString("ename"));
				System.out.println("Salary: " + rs.getFloat("sal"));
				System.out.println("Commission: " + rs.getFloat("comm"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
