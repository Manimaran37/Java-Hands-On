package StoredProcedure;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CallableStatementDemo {
	
	static final String DB_URL = "jdbc:mysql://localhost/callablestatement";
	static final String USER = "root";
	static final String PASS = "Maran@37";

	public static void main(String[] args) {
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
			CallableStatement cStatement = conn.prepareCall("{call net_salary(?)}");
			cStatement.setInt(1, 3);
//			cStatement.registerOutParameter(2, java.sql.Types.FLOAT);
			cStatement.execute();
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery("select emp_no, emp_name, net_salary from emp");
			while (resultSet.next()) {
				System.out.println("No: " + resultSet.getInt("emp_no") + "\nName: " + resultSet.getString("emp_name") + "\nNet Salary: " + resultSet.getFloat("net_salary"));
			}
//			boolean hasResult = cStatement.execute();
//			
//			if (hasResult) {
//				ResultSet rSet = cStatement.getResultSet();
//				while (rSet.next()) {
//					System.out.println(rSet.getInt(1));
//				}
//			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
