package treeSetDemoWithEmployee;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo{
	Set<Employee> set = new TreeSet<>();
	
	private boolean addEmployee(Employee employee) {
		set.add(employee);
		return true;
	}
	
	private void displayAllEmployees() {
		Iterator<Employee> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());			
		}
	}

	public static void main(String[] args) {
		TreeSetDemo treeSetDemo = new TreeSetDemo();
		treeSetDemo.addEmployee(new Employee(104, "bara", 235.4f));
		treeSetDemo.addEmployee(new Employee(102, "maran", 245.5f));
		treeSetDemo.addEmployee(new Employee(101, "siva", 245.6f));
		treeSetDemo.addEmployee(new Employee(103, "maha", 245.7f));

		treeSetDemo.displayAllEmployees();
	}

	
}

	
