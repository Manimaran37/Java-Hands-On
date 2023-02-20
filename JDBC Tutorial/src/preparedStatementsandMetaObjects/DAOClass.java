package preparedStatementsandMetaObjects;

public class DAOClass {
	final String DB_URL = "jdbc:mysql://localhost/students";
	final String USER = "root";
	final String PASS = "Maran@37";
	static final String TABLE = "student";

	protected String insert(int rollno, String name, String classString, String date, float fee) {
		return "INSERT INTO " + TABLE + " VALUES (" + rollno + ", " + "\"" + name + "\"" + ", " + "\"" + classString + "\"" + ", " + "\"" + date + "\"" + ", " + fee + ");";
	}
	
	protected String delete(int rollno) {
		return "DELETE FROM " + TABLE + " WHERE roll_no = " + rollno + ";";
	}
	
	protected String modify(int rollno, float fee) {
		return "UPDATE " + TABLE + " SET fee = " + fee + " WHERE roll_no = " + rollno + ";";
	}
	
	protected String display(int rollno) {
		return "SELECT * FROM " + TABLE + " WHERE roll_no = " + rollno + ";";
	}
	
	protected String display() {
		return "SELECT * FROM " + TABLE + ";";
	}
}
