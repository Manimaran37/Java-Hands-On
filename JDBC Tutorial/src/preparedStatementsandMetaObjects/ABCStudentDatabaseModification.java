package preparedStatementsandMetaObjects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ABCStudentDatabaseModification {

	static final String DB_URL = "jdbc:mysql://localhost/abcschool";
	static final String USER = "root";
	static final String PASS = "Maran@37";
	
	public static void main(String[] args) {
		int rollno = Integer.parseInt(args[0]);
		float fee = Float.parseFloat(args[1]);
		
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
			PreparedStatement pStatement = conn.prepareStatement("update students set Fees = " + fee + " where Rollno = " + rollno + ";" );
			int i = pStatement.executeUpdate();
			System.out.println(i + " record updated successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
