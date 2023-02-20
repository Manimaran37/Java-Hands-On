package employeeManagementSystem;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		boolean flag = true;
		while (flag) {
			System.out.println("Main Menu: \n1. Add an Employee\n2. Display All\n3. Exit");
			Scanner obj = new Scanner(System.in);
			int choice = obj.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter Employee ID: ");
				int empID = obj.nextInt();
				obj.nextLine();
				System.out.println("Enter Employee Name: ");
				String name = obj.nextLine();
				System.out.println("Enter Employee Age: ");
				int age = obj.nextInt();
				obj.nextLine();
				System.out.println("Enter Employee Salary: ");
				double salary = obj.nextDouble();
				obj.nextLine();
				
				Employee employee = new Employee();
				employee.addEmployee(empID, name, age, salary);
				break;
				
			case 2:
				Employee employee2 = new Employee();
				System.out.println("========Report========");
				employee2.display();
				System.out.println("=====End of Report=====");
				
			case 3:
				System.out.println("Exiting the system");
				obj.close();
				System.exit(0);

			default:
				obj.close();
				System.out.println("Please enter valid choice (1..3)");
				break;
			}
		}

	}

}
