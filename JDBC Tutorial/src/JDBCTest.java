import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {

	static final String DB_URL = "jdbc:mysql://localhost/ddl";
	static final String USER = "root";
	static final String PASS = "Maran@37";
	static final String QUERY = "SELECT Dept_ID, Dept_Name FROM departments";

	public static void main(String[] args) {
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(QUERY);) {
			// Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				System.out.println("Dept Id: " + rs.getInt("Dept_ID"));
				System.out.println("Dept Name: " + rs.getString("Dept_Name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
