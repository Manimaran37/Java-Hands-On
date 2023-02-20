
public class AgeOutOfBoundException extends Exception{

	
	
	public AgeOutOfBoundException() {
		System.out.println("AgeOutOfBoundException");
	}

	@Override
	public String toString() {
		return "Age must be >= 18 && <= 60";
	}

	
}
