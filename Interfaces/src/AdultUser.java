
public class AdultUser implements LibraryUser{
	int age;
	String bookType;
	boolean accountRegistered;
	
	public AdultUser(int age, String bookType) {
		this.age = age;
		this.bookType = bookType;
	}

	@Override
	public void registerAccount() {
		if(this.age>12)
		{
			this.accountRegistered = true;
			System.out.println("You have successfully registered under an Adult Account");
		}
		else {
			this.accountRegistered = false;
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");

		}
		
	}

	@Override
	public void requestBook() {
		if (this.accountRegistered) {
			if(this.bookType == "Fiction")
				System.out.println("Book issued successfully, please return the book within 7 days");
			else
				System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
		else {
			System.out.println("You have not registered yet. Please Register");
		}
		
	}
	
	
}
