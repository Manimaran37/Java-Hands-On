
public class NegativeValuesException extends Exception{

	public NegativeValuesException() {
		System.out.println("NegativeValuesException");
	}

	@Override
	public String toString() {
		return "Please enter only positive integers";
	}

	
	
}
