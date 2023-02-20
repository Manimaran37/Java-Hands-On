
public class Employee implements Cloneable{
	String name;
	Double cgpa;
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.name = "Manimaran";
		employee.cgpa = 7.94;
		try {
			Employee cloneEmployee = (Employee)employee.clone();
			cloneEmployee.name = "ArulRaj";
			cloneEmployee.cgpa = 7.5;
			System.out.println("Original Object:\nName: " + employee.name + "\nCGPA: " + employee.cgpa);
			System.out.println("Cloned Object:\nName: " + cloneEmployee.name + "\nCGPA: " + cloneEmployee.cgpa);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}

}
