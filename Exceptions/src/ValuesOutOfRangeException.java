
public class ValuesOutOfRangeException extends Exception{

	public ValuesOutOfRangeException() {
		System.out.println("ValuesOutOfRangeException");	
	}

	@Override
	public String toString() {
		return "Values must be in the range from 1 to 100";
	}

	
}
