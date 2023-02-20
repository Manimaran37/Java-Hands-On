
public class FindBiggestNumberIn3DArray {
	
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
		
		array[0][0] = integerArray[0];
		array[0][1] = integerArray[1];
		array[0][2] = integerArray[2];
		array[1][0] = integerArray[3];
		array[1][1] = integerArray[4];
		array[1][2] = integerArray[5];
		array[2][0] = integerArray[6];
		array[2][1] = integerArray[7];
		array[2][2] = integerArray[8];
		
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
