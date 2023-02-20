package codility;

public class SmallestNumberWhoseSumOfDigitsIsN {
	
	public static int sum(int n) {
		int sum = 0;
		while (n>0) {
			sum += n%10;
			n /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int n=734;
		int sum = sum(n);
		
		for (int i = n+1;; i++) {
			if(sum(i) == sum) {
				System.out.println(i);
				break;
			}
			
		}
		

	}

}
