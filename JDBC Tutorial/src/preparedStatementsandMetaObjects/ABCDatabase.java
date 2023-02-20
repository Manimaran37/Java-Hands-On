package preparedStatementsandMetaObjects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Scanner;

public class ABCDatabase {

	static final String DB_URL = "jdbc:mysql://localhost/abcschool";
	static final String USER = "root";
	static final String PASS = "Maran@37";

	public static void main(String[] args) throws Exception {
		Scanner obj = new Scanner(System.in);
		Character wantToInsert = 'y';
		String[] standardArray = { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" };

		do {
			System.out.println("Enter rollno: ");
			int rollno = obj.nextInt();
			if (rollno >= 10000) {
				System.out.println("Valid value is a 4-digit number");
				System.out.println("Enter rollno: ");
				rollno = obj.nextInt();
			}
			obj.nextLine();
			System.out.println("Enter the name: ");
			String name = obj.nextLine().toUpperCase();
			System.out.println("Enter the standard: ");

			String standard = obj.nextLine();
			for (int i = 0; i < standardArray.length; i++) {
				if (!(Arrays.asList(standardArray).contains(standard))) {
					System.out.println("Valid values are Roman Letter representing I to X (I, II, III, ....., IX, X)");
					System.out.println("Enter the standard: ");
					standard = obj.nextLine();
					break;
				}
			}

			System.out.println("Enter the date (yyyy-MM-dd): ");
			String date = obj.next();
			System.out.println("Enter the fees: ");
			float fees = obj.nextFloat();

			try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
				PreparedStatement pStatement = conn
						.prepareStatement("Insert into students values (" + rollno + ", " + "\"" + name + "\"" + ", "
								+ "\"" + standard + "\"" + ", " + "\"" + date + "\"" + ", " + fees + ");");
				int i = pStatement.executeUpdate();
				System.out.println(i + " record inserted successfully\n");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println("Want to Insert more (y/n): ");
			wantToInsert = obj.next().charAt(0);
		} while (wantToInsert != 'n');

		obj.close();
	}

}
