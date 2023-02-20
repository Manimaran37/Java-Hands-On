package interestCalculator;

public class RDAccount extends Account{
	
	int ageOfAccountHolder;
	int noOfMonths;
	double monthlyAmount;

	public RDAccount(int ageOfAccountHolder, int noOfMonths, double monthlyAmount) {
		this.ageOfAccountHolder = ageOfAccountHolder;
		this.noOfMonths = noOfMonths;
		this.monthlyAmount = monthlyAmount;
	}

	@Override
	double calculateInterest() {
		if(noOfMonths == 6) {
			this.interestRate = (ageOfAccountHolder >= 60)?8.00:7.50;
		}
		else if(noOfMonths == 9) {
			this.interestRate = (ageOfAccountHolder >= 60)?8.25:7.75;
		}
		else if(noOfMonths == 12) {
			this.interestRate = (ageOfAccountHolder >= 60)?8.50:8.00;
		}
		else if(noOfMonths == 15) {
			this.interestRate = (ageOfAccountHolder >= 60)?8.75:8.25;
		}
		else if(noOfMonths == 18) {
			this.interestRate = (ageOfAccountHolder >= 60)?9.00:8.50;
		}
		else if(noOfMonths == 21) {
			this.interestRate = (ageOfAccountHolder >= 60)?9.25:8.75;
		}
		return ((monthlyAmount * this.interestRate)/100);
	}

	
}
