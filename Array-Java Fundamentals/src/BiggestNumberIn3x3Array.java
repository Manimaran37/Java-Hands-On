
public class BiggestNumberIn3x3Array {
	public static void printArray(int[][] arr) {
		for(int j=0; j<arr.length; j++) {
			for(int k=0; k<arr.length; k++) {
				System.out.print(arr[j][k] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] integerArray = new int[args.length];
		for(int i=0; i<integerArray.length; i++) {
			integerArray[i] = Integer.parseInt(args[i]);
		}
		int[][] array = new int[3][3];
		
		int k = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				array[i][j] = integerArray[k];
				k++;
			}
		}
	
		System.out.println("The given array is ");
		printArray(array);
		int max = array[0][0];
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length; j++) {
				if(array[i][j] > max)
					max = array[i][j];
			}
		}
		
		System.out.println("Biggest number in the given array is " + max);
	}

}
