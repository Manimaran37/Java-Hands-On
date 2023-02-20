import java.util.Properties;

public class GetPropertiesdemo {

	public static void main(String[] args) {
		Properties xProperties = System.getProperties();
		xProperties.list(System.out);

	}

}
