import java.util.Arrays;

public class ElementOccurence {
	
	public static int occurenceCheck(int[] arr) {
		int maxCount = 0;
		int highestOccuredElement = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if (count >= maxCount) {
				maxCount = count;
				highestOccuredElement = arr[i];
			}
		}
		return highestOccuredElement;
	}

	public static void main(String[] args) {
		int[] array = {10, 20, 10, 30, 40, 100, 99};
		System.out.println("Given Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\nThe element in the array that has occured highest number of times is " + occurenceCheck(array));
	}

}
