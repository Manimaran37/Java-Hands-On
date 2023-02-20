import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class CopyOneFileToAnother {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the input file name: ");
		String inputFileName = bufferedReader.readLine();
		System.out.println("Enter the output filename: ");
		String outputFileName = bufferedReader.readLine();
		
		FileReader fileReader = new FileReader("src/"+inputFileName);
		FileWriter fileWriter = new FileWriter("src/"+outputFileName);
		int i;
		while ((i = fileReader.read()) != -1) {
			fileWriter.write(i);
		}
		fileReader.close();
		fileWriter.close();
		bufferedReader.close();
	}

}
