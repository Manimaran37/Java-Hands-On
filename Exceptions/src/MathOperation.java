
public class MathOperation {

	public static void main(String[] args) {
		int[] array = new int[args.length];
		int sum=0, average = 0;
		try {
			for(int i=0; i<args.length; i++) {
				array[i] = Integer.parseInt(args[i]);
				sum += array[i];
			}
			average = sum/args.length;
		}
		catch (NumberFormatException e) {
			System.out.println(e);
		}
		
		catch (ArithmeticException e) {
			System.out.println(e);			
		}
		
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
