package preparedStatementsandMetaObjects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ABCDatabaseStudentDetails {

	static final String DB_URL = "jdbc:mysql://localhost/abcschool";
	static final String USER = "root";
	static final String PASS = "Maran@37";

	public static void main(String[] args) {

		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
			Statement statement = conn.createStatement();
			ResultSet rSet;
			if (args.length == 1) {
				rSet = statement
						.executeQuery("select * from students where Rollno = " + Integer.parseInt(args[0]) + ";");
				System.out.println("Details of Student having Rollno = " + Integer.parseInt(args[0]));

				while (rSet.next()) {
					System.out.println("\n====================================");
					System.out.println("\nName: " + rSet.getString("StudentName") + "\nStandard: "
							+ rSet.getString("Standard") + "\nDate Of Birth: " + rSet.getDate("Date_Of_Birth")
							+ "\nFees Paid: " + rSet.getBigDecimal("Fees"));
					System.out.println("====================================\n");
				}
			}

			else {
				rSet = statement.executeQuery("select * from students;");
				System.out.println("ABC School Database:");

				while (rSet.next()) {
					System.out.println("\n====================================");
					System.out.println("Rollno: " + rSet.getInt("Rollno") + "\nName: " + rSet.getString("StudentName")
							+ "\nStandard: " + rSet.getString("Standard") + "\nDate Of Birth: "
							+ rSet.getDate("Date_Of_Birth") + "\nFees Paid: " + rSet.getBigDecimal("Fees"));
					System.out.println("====================================\n");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
