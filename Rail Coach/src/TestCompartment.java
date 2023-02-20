public class TestCompartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment[] compartment = new Compartment[10];
		int min = 1, max = 4;
		for(int i=0; i<10; i++) {
			int randomNumber = (int)Math.floor(Math.random()*(max-min+1)+min);
			switch (randomNumber) {
			case 1:
				compartment[i] = new Luggage();
				break;
				
			case 2:
				compartment[i] = new Ladies();
				break;
				
			case 3:
				compartment[i] = new FirstClass();
				break;
				
			case 4:
				compartment[i] = new General();
				break;

			default:
				break;
			}
		}
		
		for(int j=0; j<10; j++) {
			System.out.println(compartment[j].notice());
		}
		
	}

}
