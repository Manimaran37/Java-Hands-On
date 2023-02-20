import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListOfStrings {
	
	private static void printAll(ArrayList<String> list) {
		System.out.println("\nStrings in the ArrayList are...");
		Iterator<String> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
	}

	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("Enter the string you want to add to the ArrayList: ");
			strings.add(scanner.nextLine());
			System.out.println("Do you want to add more: (yes/no)");
			String answer = scanner.nextLine();
			if(answer.equals("no")) {
				break;
			}
		}
		
		printAll(strings);
		scanner.close();
	}

}
