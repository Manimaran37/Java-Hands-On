package codility;

public class DirectionArray {

	public static void main(String[] args) {
		String direction = "^v<>";
		String string = "v>>>vv";
		char[] arr = string.toCharArray();
		int maxCount = 0;
		for (int i = 0; i < arr.length; i++) {
		int count = 0;
		for (int j = 0; j < arr.length; j++) {
		if(arr[i] == arr[j]) {
		count++;
		}
		}
		if (count >= maxCount) {
		maxCount = count;
		}
		}
		System.out.println(arr.length - maxCount);

	}

}
