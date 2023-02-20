
public class Arithmeticexception {
	
	public static int divide(int num1, int num2) throws ArithmeticException{
		return num1/num2;
	}

	public static void main(String[] args) {
		try {
			int result = divide(4, 0);
			System.out.println("The result is " + result);
		} catch (Exception e) {
			System.out.println("Exception Handled");
			System.out.println(e);
		}

	}

}
