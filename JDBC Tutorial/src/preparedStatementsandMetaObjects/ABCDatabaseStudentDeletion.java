package preparedStatementsandMetaObjects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ABCDatabaseStudentDeletion {
	static final String DB_URL = "jdbc:mysql://localhost/abcschool";
	static final String USER = "root";
	static final String PASS = "Maran@37";

	public static void main(String[] args) {
		int rollno = Integer.parseInt(args[0]);
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {

			Statement nameQuery = conn.createStatement();
			ResultSet rSet = nameQuery.executeQuery("select * from students where Rollno = " + rollno + ";");
			while (rSet.next()) {
				PreparedStatement pStatement1 = conn.prepareStatement("insert into studentlog values (" + rollno + ", "
						+ "\"" + rSet.getString("StudentName") + "\"" + ", " + "\"" + rSet.getString("Standard") + "\""
						+ ", " + "\"" + LocalDate.now().format(DateTimeFormatter.ISO_DATE) + "\"" + ");");
				int i = pStatement1.executeUpdate();
				System.out.println("Deleted details of Student having Rollno  \"" + rollno + "\""+ " +  added to studentlog table. " + i + " record added successfully from stu");
			}

			PreparedStatement pStatement = conn.prepareStatement("delete from students where Rollno = " + rollno + ";");
			int j = pStatement.executeUpdate();
			System.out.println(j + " record deleted successfully from students table");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
