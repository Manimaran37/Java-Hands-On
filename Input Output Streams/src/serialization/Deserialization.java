package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {
		try {
			Employee employee2;
			FileInputStream fInputStream = new FileInputStream("src/serialization/data");
			ObjectInputStream objectInputStream = new ObjectInputStream(fInputStream);
			employee2 = (Employee)objectInputStream.readObject();
			objectInputStream.close();
			System.out.println("The Properties of Object are: \n" + employee2 );
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
