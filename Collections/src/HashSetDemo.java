import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetDemo {
	HashSet<String> set;
	
	
	public HashSetDemo() {
		this.set = new HashSet<>();
	}

	private boolean addCountry(String country) {
		if(this.set.add(country))
			return true;
	
		return false;
	}

	private String findCountry(String country) {
		if(this.set.contains(country))
			return country + " found in the set";
		
		return "Country not found";
	}


	private static void printAllUsingIterator(HashSet<String> set) {
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public static void main(String[] args) {
		HashSetDemo demo = new HashSetDemo();
		Scanner obj = new Scanner(System.in);
	
		while (true) {
			System.out.println("Enter the string you want to add to the set: ");
			demo.addCountry(obj.nextLine());
			System.out.println("Do you want to add more: (yes/no)");
			String answer = obj.nextLine();
			if(answer.equals("no")) {
				break;
			}
		}
		System.out.println("\nElements in the set: ");
		printAllUsingIterator(demo.set);
		System.out.println("\nEnter the country to be found in the set: ");
		System.out.println(demo.findCountry(obj.nextLine()));
		
		obj.close();
		
	}

}
