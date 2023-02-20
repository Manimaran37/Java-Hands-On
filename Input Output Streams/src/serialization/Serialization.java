package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Serialization {

	public static void main(String[] args) {
		try {
			String dateString = "29/12/1999";
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateString);
			Employee employee = new Employee("Manimaran", date, "IT", "Project Engineer", 24000);
			
			FileOutputStream fOutputStream = new FileOutputStream("src/serialization/data");
			ObjectOutputStream outputStream = new ObjectOutputStream(fOutputStream);
			outputStream.writeObject(employee);
			outputStream.flush();
			outputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
