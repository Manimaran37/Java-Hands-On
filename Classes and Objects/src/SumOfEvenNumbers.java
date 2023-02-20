
public class SumOfEvenNumbers {

	public static void main(String[] args) {
		int sum=0;
		for(int i=0; i<2000; i++ ) {
			if(i%2==0) {
				sum+=i;			
			}
		}
		System.out.println("The sum of first 1000 even numbers = " + sum);

	}

}
