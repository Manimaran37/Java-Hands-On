package codility;

public class DayOfTheWeekAfterKDaysLater {

	public static void main(String[] args) {

		String[] days = {"M", "Tu", "W", "Th", "Fri", "Sat", "Sun"};
		int k=23;
		String S ="Sat";
		for (int i = 0; i < days.length; i++) {
			if(days[i].equals(S)) {
				System.out.println(days[(i+2)%7]);
				break;	
			}
			
		}
	}

}
