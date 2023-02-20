
public class PrintEveryElementIs1Or4 {
	public static boolean only14(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 1 && arr[i] != 4) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,4,1,1,4,1,4};
		System.out.println(only14(array));
	}

}
