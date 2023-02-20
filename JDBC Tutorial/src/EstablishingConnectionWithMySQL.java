import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EstablishingConnectionWithMySQL {
	static final String DB_URL = "jdbc:mysql://localhost/ddl";
	static final String USER = "root";
	static final String PASS = "Maran@37";

	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connection Established Successfully");
		} catch (Exception e) {
			System.out.println("Connection could not be established");
			e.printStackTrace();
		}
		finally {
			if (connection != null) {
				connection.close();
			}
		}
	}

}
