
public class UserRegistration {

	public void registerUser(String username, String userCountry) throws InvalidCountryException{
		if(userCountry != "India") {
			throw new InvalidCountryException();
		}
		else {
			System.out.println("User registration done successfully");
		}
	}
	
	public static void main(String[] args) {
		UserRegistration user = new UserRegistration();
		try {
			user.registerUser("Mini", "India");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
