package codility;

public class ComparisonOperatorStrings {
	
	public static void solution(int[] arr) {
		
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>0)
				result += ">";
			else if(arr[i]<0)
				result += "<";
			else
				result += "=";	
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(new int[] {1,2,0,-3});
	}

}
