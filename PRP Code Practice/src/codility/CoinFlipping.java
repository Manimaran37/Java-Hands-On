package codility;

public class CoinFlipping {

	public static void main(String[] args) {
		int[] arr = new int[] {0, 0, 0, 0, 1, 1};
		int count1 = 0, count0 = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 1)
				count1++;
			else
				count0++;
		}
		
//		System.out.println(count0 + " " + count1);
		if(count1 == 0 || count0 == 0)
			System.out.println(arr.length/2);
		else {
			
			if(count0 < arr.length/2)
				System.out.println(Math.abs(count0-arr.length/2));
			else if (count1 < arr.length/2) {
				System.out.println(Math.abs(count0-arr.length/2));
			}
		}
		
	}

}
