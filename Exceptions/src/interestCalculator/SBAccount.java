package interestCalculator;

public class SBAccount extends Account{
	String type;
	
	public SBAccount(String type, double amount) {
		this.amount = amount;
		this.type = type;
	}

	@Override
	double calculateInterest() {
		if(this.type.equals("Normal"))
			this.interestRate = 4;
		else if(this.type.equals("NRI"))
			this.interestRate = 6;
		
		return (amount * this.interestRate)/100;
	}
	
	
}
