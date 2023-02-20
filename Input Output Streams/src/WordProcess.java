import java.io.File;
import java.util.Scanner;
import java.util.TreeMap;

public class WordProcess {
	private TreeMap<String,Integer> map = null;
	private String filename;

	public WordProcess(String filename) {
		this.filename = "src/"+filename;
		map = new TreeMap<>();
	}

	public TreeMap<String, Integer> wordCount() throws Exception{
		if(map.isEmpty()) {
			parseWord();
		}
		return map;
	}
	
	private void parseWord() throws Exception{
		Scanner textFile = new Scanner(new File(filename));
		while (textFile.hasNext()) {
			String word = textFile.next();
			int count = 1;
			if(map.containsKey(word)) {
				count = map.get(word) + 1;
			}
			map.put(word, count);
		}
		textFile.close();
	}
}
