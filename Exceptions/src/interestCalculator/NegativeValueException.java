package interestCalculator;

public class NegativeValueException extends Exception{

	public NegativeValueException() {
		System.out.println("NegativeValueException");
	}

	@Override
	public String toString() {
		return "Please enter non-negative values";
	}

	
}
