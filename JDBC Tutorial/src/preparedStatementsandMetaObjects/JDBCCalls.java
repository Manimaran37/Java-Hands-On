package preparedStatementsandMetaObjects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class JDBCCalls {

	public static void main(String[] args) throws SQLException {
		DAOClass obj = new DAOClass();
		int choice = Integer.parseInt(args[0]);
		Connection connection = null;
		PreparedStatement pStatement = null;
		Statement statement = null;
		ResultSet rSet  = null;
		
		try {
			connection = DriverManager.getConnection(obj.DB_URL, obj.USER, obj.PASS);
			statement = connection.createStatement();
			
			switch (choice) {
				case 1:
					String insertQuery = obj.insert(Integer.parseInt(args[1]), args[2], args[3], args[4], Float.parseFloat(args[5]));
					pStatement = connection.prepareStatement(insertQuery);
					int i = pStatement.executeUpdate();
					System.out.println(i + " record inserted Successfully");
					break;
					
				case 2:
					String deleteQuery = obj.delete(Integer.parseInt(args[1]));
					pStatement = connection.prepareStatement(deleteQuery);
					int j = pStatement.executeUpdate();
					System.out.println(j + " record deleted Successfully");
					break;
					
				case 3:
					String modifyQuery = obj.modify(Integer.parseInt(args[1]), Float.parseFloat(args[2]));
					pStatement = connection.prepareStatement(modifyQuery);
					int k = pStatement.executeUpdate();
					System.out.println(k + " record modified Successfully");
					break;
					
				case 4:
					String displayQuery = null;
					if(args.length > 1) {
						displayQuery = obj.display(Integer.parseInt(args[1]));
						rSet = statement.executeQuery(displayQuery);
						System.out.println("Student Details for Roll No: " + args[1] + "\n");

						while (rSet.next()) {
							System.out.println("Name: " + rSet.getString("student_name"));
							System.out.println("Class: " + rSet.getString("class"));
							System.out.println("Joined Date: " + rSet.getString("joining_date"));
							System.out.println("Fee: " + rSet.getFloat("fee"));
						}
					}
					else {
						displayQuery = obj.display();
						rSet = statement.executeQuery(displayQuery);
						System.out.println("Student Database: ");
						
						while (rSet.next()) {
							System.out.println("\n==================================");
							System.out.println("Roll No: " + rSet.getInt("roll_no"));
							System.out.println("Name: " + rSet.getString("student_name"));
							System.out.println("Class: " + rSet.getString("class"));
							System.out.println("Joined Date: " + rSet.getString("joining_date"));
							System.out.println("Fee: " + rSet.getFloat("fee"));
							System.out.println("==================================\n");

						}
					}
					break;
					
				default:
					System.out.println("Invalid Choice");
					break;
				}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			statement.close();
			pStatement.close();
			connection.close();
		}

	}

}
