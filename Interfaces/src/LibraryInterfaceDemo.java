
public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		KidUsers k = new KidUsers(10, "Kids");
		AdultUser a = new AdultUser(14, "Fiction");
		k.registerAccount();
		k.requestBook();
		a.registerAccount();
		a.requestBook();

	}

}
