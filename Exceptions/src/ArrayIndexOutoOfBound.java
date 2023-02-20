import java.util.Scanner;

public class ArrayIndexOutoOfBound {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the array: ");
		int size = obj.nextInt();
		int[] array = new int[size];
		
		System.out.println("Enter the elements in the array");
		for(int i=0; i<array.length; i++) {
			array[i] = obj.nextInt();
		}
		
		System.out.println("Enter the index of the array element you want to access: ");
		int index = obj.nextInt();
		try {
			int elementPresentInIndex = array[index];
			System.out.println("The array element at index " + index + " = " + elementPresentInIndex);
			System.out.println("The array element successfully accessed");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getClass());
		}
	}

}
