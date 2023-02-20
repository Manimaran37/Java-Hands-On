import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowOwnException {
	
	public int[] getArray(int size) throws InputMismatchException, NegativeValuesException, ValuesOutOfRangeException{
		Scanner obj= new Scanner(System.in);
		int[] array = new int[size];
		
		for(int i=0; i<size; i++) {
			array[i] = obj.nextInt();
			if(array[i] < 0) {
				throw new NegativeValuesException();
			}
			if(!(array[i] >= 0 && array[i] <= 100)) {
				throw new ValuesOutOfRangeException();
			}
		}
		return array;
	}
	
	public void calculateAverage(int[] marks){
		int sum = 0;
		
		for(int i=0; i<marks.length; i++) {
			sum += marks[i];
		}
		System.out.println("The average of marks = " + (sum/marks.length));
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of student1: ");
		String studentName1 = scanner.nextLine();
		System.out.println("Enter the name of student2: ");
		String studentName2 = scanner.nextLine();
		ThrowOwnException student1 = new ThrowOwnException() ;
		ThrowOwnException student2 = new ThrowOwnException() ;
		System.out.println("Enter the number of marks: ");
		int size = scanner.nextInt();
		System.out.println("Enter marks for student1: " );
		try {
			int[] student1Marks = student1.getArray(size);
			student1.calculateAverage(student1Marks);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Enter marks for student2: ");
		try {
			int[] student2Marks = student2.getArray(size);
			student2.calculateAverage(student2Marks);
		} catch (Exception e) {
			System.out.println(e);
		}
				
	}

}
