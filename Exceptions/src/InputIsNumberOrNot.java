import java.util.Scanner;

public class InputIsNumberOrNot {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		String inputString = obj.nextLine();
		try {
			int number = Integer.parseInt(inputString);
			System.out.println("The square value is " + number*number);
			System.out.println("The work has been done successfully");
		} catch (NumberFormatException e) {
			System.out.println("Entered input is not a valid input for an integer");
		}
		
	}

}
