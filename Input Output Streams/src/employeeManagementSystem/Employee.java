package employeeManagementSystem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Employee {

	int empID;
	String empName;
	int empAge;
	double empSalary;
	String path = "src/employeeManagementSystem/empData";
	
	public void addEmployee(int empId, String empName, int empAge, double empSalary) throws IOException{
		this.empID = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
		
		BufferedWriter bWriter = new BufferedWriter(new FileWriter(path, true));
		String input = empID + " " + empName + " " + empAge + " " + empSalary + "\n";
		try {
			bWriter.write(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
		bWriter.close();
	}
	
	public void display() throws IOException {
		try {
			Scanner scanner = new Scanner(new File(path));
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
