
public class ReverseElementsOf2DArray {

	public static void main(String[] args) {
		String[][] argStrings = new String[2][2];
		argStrings[0][0] = args[0];
		argStrings[0][1] = args[1];
		argStrings[1][0] = args[2];
		argStrings[1][1] = args[3];
		
		System.out.println("The given array is ");
		for(int i=0; i<argStrings.length; i++) {
			for(int j=0; j<argStrings.length; j++) {
				System.out.print(argStrings[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("The reverse of the array is ");
		
		for(int i=argStrings.length-1; i>=0; i--) {
			for(int j=argStrings.length-1; j>=0; j--) {
				System.out.print(argStrings[i][j] + " ");
			}
			System.out.println();
		}

}
}
