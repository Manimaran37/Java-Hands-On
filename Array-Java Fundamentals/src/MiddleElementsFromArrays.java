
public class MiddleElementsFromArrays {

	private static int[] middleWay(int[][] arr) {
		int middleElements[] = new int[2];
		middleElements[0] = arr[0][arr[0].length/2];
		middleElements[1] = arr[1][arr[1].length/2];
		return middleElements;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {{1,10,4}, {4,20,6}};
		for(int i: middleWay(array)) {
			System.out.println(i);
		}
	}

}
