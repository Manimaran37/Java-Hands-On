
public class AgeTest {

	public static void main(String[] args) {
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		
		try {
			if(!(age >= 18 && age <= 60)){
				throw new AgeOutOfBoundException();
			}
			else {
				System.out.println("Name: " + name + "\nAge: " + age);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
