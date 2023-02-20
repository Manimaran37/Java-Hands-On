
public class InvalidCountryException extends Exception{

	@Override
	public String toString() {
		return "User outside India cannot be registered";
	}
	
	
}
