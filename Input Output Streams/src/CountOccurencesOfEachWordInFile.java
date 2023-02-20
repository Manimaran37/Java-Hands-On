import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Map;
import java.util.TreeMap;

public class CountOccurencesOfEachWordInFile {
	
	public static void main(String[] args) throws Exception{
		WordProcess wp = new WordProcess(args[0]);
		String outputFile = args[1];
		BufferedWriter bWriter = new BufferedWriter(new FileWriter("src/" + outputFile));
		TreeMap<String, Integer> map = wp.wordCount();
		for(Map.Entry<String, Integer> entry: map.entrySet()) {
			bWriter.write(entry.getKey() + " : " + entry.getValue() + "\n");
			System.out.println(entry);
		}
		bWriter.close();
	}
	
}
