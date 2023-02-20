public class RemoveDuplicateElements {

	public static void main(String[] args) {
		int[] array = {1,1,2,2,4,3,3,5,5,5,6,6};

		System.out.println("Given Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println("\nAfter removing duplicate elements......");
		for (int i = 0; i < array.length - 1; i++) {
				if(array[i] != array[i+1]) {
					System.out.print(array[i] + " ");	
				}
		}
		System.out.print(array[array.length-1]);

	}

}
