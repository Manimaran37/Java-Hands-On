
public class KidUsers implements LibraryUser{

	int age;
	String bookType;
	boolean accountRegistered;
	
	
	public KidUsers(int age, String bookType) {
		this.age = age;
		this.bookType = bookType;
	}
	
	@Override
	public void registerAccount() {
		if(this.age<12) {
			this.accountRegistered = true;
			System.out.println("You have successfully registered under a Kids Account");
		}
		else {
			this.accountRegistered = false;
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
		
	}
	@Override
	public void requestBook() {
		if (this.accountRegistered) {
			if(this.bookType == "Kids")
				System.out.println("Book issued successfully, please return the book within 10 days");
			else
				System.out.println("Oops, you are allowed to take only kids books");
		}
		else {
			System.out.println("You have not registered yet. Please Register");
		}
	}
	
	
}
