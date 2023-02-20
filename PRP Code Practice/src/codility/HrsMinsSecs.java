package codility;

public class HrsMinsSecs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 83643;
		
		int hr = s/3600;
		int min = (s - (3600*hr))/60;
		int sec = (s - (3600*hr)-min*60);  	
		
		System.out.println(hr + " " + min + " " + sec);

	}

}
