import java.util.Scanner;

public class Patient {
	
	 	private String patientName;
	    private double height;
	    private double weight;

	    public Patient() {
			
		}
	    
		public Patient(String patientName, double height, double weight) {
	        this.patientName = patientName;
	        this.height = height;
	        this.weight = weight;
	    }


	    public String getPatientName() {
	        return this.patientName;
	    }

	    public void setPatientName(String patientName) {
	        this.patientName = patientName;
	    }

	    public double getHeight() {
	        return this.height;
	    }

	    public void setHeight(double height) {
	        this.height = height;
	    }

	    public double getWeight() {
	        return this.weight;
	    }

	    public void setWeight(double weight) {
	        this.weight = weight;
	    }
	    

	    public double computeBMI(){
	        return 703 * (weight / (height * height));
	    }

	    public static void main(String[] args) {
//	        Patient patient = new Patient("ABC", 70, 123);
	        Patient patient2 = new Patient();
	        Scanner obj = new Scanner(System.in);
	        System.out.println("Enter the height (in inches): ");
	        double height = obj.nextDouble();
	        patient2.setHeight(height);
	        System.out.println("Enter the weight (in pounds): ");
	        double weight = obj.nextDouble();
	        patient2.setWeight(weight);
	        double bmi = patient2.computeBMI();
	        
	        System.out.println("The BMI value of "+ patient2.getPatientName() + " is " + bmi);
//	        obj.close();
	    }    

}
