package codility;

public class ASCIIArt {
	
	public static void printArt(int n) {
		if(n>0 && n<=100) {
			
			int j=0;
			for (int i = 0; i < n-1; i++) {
				System.out.println("L");
			}
			while (j<n) {
				System.out.print("L");
				j++;
			}
		}
	}

	public static void main(String[] args) {
		
		printArt(4);
	}

}
