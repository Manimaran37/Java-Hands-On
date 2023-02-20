import java.util.Scanner;

public class UseOfFinallyBlock {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the 2 numbers: ");
		int num1 = obj.nextInt();
		int num2 = obj.nextInt();
		try {
			int quotient = num1/num2;
			System.out.println("Quotient of " + num1 + "/" + num2 + " = " + quotient);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Inside finally block");
		}
	}

}
