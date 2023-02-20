import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListOfNumerics {
	
	private static void printAll(ArrayList<Number> list) {
		Iterator<Number> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
	}

	public static void main(String[] args) {
		ArrayList<Number> numbers = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any integer number: ");
		numbers.add(scanner.nextInt());
		scanner.nextLine();
		System.out.println("Enter any float number: ");
		numbers.add(scanner.nextFloat());
		scanner.nextLine();
		System.out.println("Enter any double number: ");
		numbers.add(scanner.nextDouble());
		scanner.nextLine();
		System.out.println("Enter any byte number: ");
		numbers.add(scanner.nextByte());
		scanner.nextLine();
		System.out.println("Enter any short number: ");
		numbers.add(scanner.nextShort());
		scanner.nextLine();
	
		printAll(numbers);
		scanner.close();

	}

}
