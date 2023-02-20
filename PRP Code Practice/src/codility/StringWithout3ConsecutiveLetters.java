package codility;

public class StringWithout3ConsecutiveLetters {

	public static void main(String[] args) {
		String string = "eedaaaad";
		StringBuffer buffer = new StringBuffer();
		buffer.append(string.charAt(0));
		buffer.append(string.charAt(1));
		for (int i = 2; i < string.length(); i++) {
			if(string.charAt(i) != string.charAt(i-1) || string.charAt(i) != string.charAt(i-2)) {
				buffer.append(string.charAt(i));
			}
			
		}
		System.out.println(buffer.toString());

	}

}
