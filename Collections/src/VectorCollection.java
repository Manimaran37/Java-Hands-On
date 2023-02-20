import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Vector;

public class VectorCollection {
	
	private static void printAllUsingIterator(Vector<Integer> vector) {
		Iterator<Integer> iterator = vector.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
	}
	
	private static void printAllUsingListIterator(Vector<Integer> vector) {
		ListIterator<Integer> iterator = vector.listIterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
	}
	
	private static void printAllUsingEnumeration(Vector<Integer> vector) {
		Enumeration<Integer> en = vector.elements();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}
	

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("Enter the integer you want to add to the Vector: ");
			vector.add(scanner.nextInt());
			scanner.nextLine();
			System.out.println("Do you want to add more: (yes/no)");
			String answer = scanner.nextLine();
			if(answer.equals("no")) {
				break;
			}
		}
		
		System.out.println("Printing Vector Elements using Enumeration.... ");
		printAllUsingEnumeration(vector);
		System.out.println("\nPrinting Vector Elements using Iterator....");
		printAllUsingIterator(vector);
		System.out.println("\nPrinting Vector Elements using ListIterator....");
		printAllUsingListIterator(vector);

	}

}
