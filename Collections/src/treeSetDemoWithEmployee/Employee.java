package treeSetDemoWithEmployee;

public class Employee implements Comparable<Employee>{

	int empID;
	String name;
	float salary;
	
	
	public Employee() {
		
	}
	
	public Employee(int empID, String name, float salary) {
		this.empID = empID;
		this.name = name;
		this.salary = salary;
	}
	

	public int getEmpID() {
		return empID;
	}

	public String getName() {
		return name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee e) {
		if(this.salary == e.getSalary())	
			return 0;
		else if(this.salary > e.getSalary())
			return 1;
		else
			return -1;
	}
	

	@Override
	public String toString() {
		return "" + this.empID + " " + this.name + " " + this.salary;
	}
	

	
}
