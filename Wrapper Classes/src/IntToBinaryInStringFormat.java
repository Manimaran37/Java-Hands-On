import java.util.Scanner;

public class IntToBinaryInStringFormat {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter an integer number between 1 and 255: ");
		Integer number = obj.nextInt();
		if(number >= 1 && number <= 255) {
			String resultString = String.format("%08d", Integer.parseInt(Integer.toBinaryString(number)));
			System.out.println(resultString);
		}
		else {
			System.out.println("Please enter any between 1 and 255 only");
		}
	}

}
