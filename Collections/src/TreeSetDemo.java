import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetDemo {
	
	private static void printAll(TreeSet<String> set) {
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		Scanner obj = new Scanner(System.in);
		
		while (true) {
			System.out.println("Enter the string you want to add to the set: ");
			set.add(obj.nextLine());
			System.out.println("Do you want to add more: (yes/no)");
			String answer = obj.nextLine();
			if(answer.equals("no")) {
				break;
			}
		}
		
		System.out.println("Original Set: ");
		printAll(set);
		System.out.println("\nSet of reversed elements");
		printAll((TreeSet<String>)set.descendingSet());
		
		System.out.println("Enter the string you want to check: ");
		String checkString = obj.nextLine();
		if(set.contains(checkString))
			System.out.println(checkString + " exists in the set");
		else
			System.out.println(checkString + " not exists in the set");
	}

}
