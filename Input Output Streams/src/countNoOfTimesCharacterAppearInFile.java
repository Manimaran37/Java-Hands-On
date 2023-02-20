import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class countNoOfTimesCharacterAppearInFile {

	public static void main(String[] args) throws IOException{
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the file name: ");
		String fileName = bReader.readLine();
		System.out.println("Enter the character to be counted: ");
		Character character = Character.toLowerCase((char)bReader.read());
		FileReader in = new FileReader("src/"+fileName);
		int i = 0, counter = 0;
		while ((i = in.read()) != -1) {
			if(character.equals(Character.toLowerCase((char)i))) {
				counter++;
			}
		}
		System.out.println("File " + "'" + fileName + "' has " + counter + " instances of letter " + "'" + character + "'");
		in.close();
		bReader.close();
	}

}
