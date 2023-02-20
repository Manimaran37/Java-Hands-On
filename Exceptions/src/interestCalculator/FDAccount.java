package interestCalculator;

public class FDAccount extends Account{

	int noOfDays, ageOfAccountHolder;
	
	public FDAccount(double amount, int noOfDays, int ageOfAccountHolder) {
		this.amount = amount;
		this.noOfDays = noOfDays;
		this.ageOfAccountHolder = ageOfAccountHolder;
	}


	@Override
	double calculateInterest() {
		if(amount < 10000000) {
			if(this.noOfDays >= 7 && this.noOfDays <= 14) {
				this.interestRate = (this.ageOfAccountHolder >= 60)?5.00:4.50;
			}
			else if(this.noOfDays >= 15 && this.noOfDays <= 29) {
				this.interestRate = (this.ageOfAccountHolder >= 60)?5.25:4.75;
			}
			else if(this.noOfDays >= 30 && this.noOfDays <= 45) {
				this.interestRate = (this.ageOfAccountHolder >= 60)?6.00:5.50;
			}
			else if(this.noOfDays >= 46 && this.noOfDays <= 60) {
				this.interestRate = (this.ageOfAccountHolder >= 60)?7.50:7.00;
			}
			else if(this.noOfDays >= 61 && this.noOfDays <= 184) {
				this.interestRate = (this.ageOfAccountHolder >= 60)?8.00:7.50;
			}
			else if(this.noOfDays >= 185 && this.noOfDays <= 366) {
				this.interestRate = (this.ageOfAccountHolder >= 60)?8.50:8.00;
			}
			return (amount*this.interestRate)/100;
		}
		else {
			if(this.noOfDays >= 7 && this.noOfDays <= 14) {
				this.interestRate = 6.50;
			}
			else if(this.noOfDays >= 15 && this.noOfDays <= 29) {
				this.interestRate = 6.75;
			}
			else if(this.noOfDays >= 30 && this.noOfDays <= 45) {
				this.interestRate = 6.75;
			}
			else if(this.noOfDays >= 46 && this.noOfDays <= 60) {
				this.interestRate = 8.00;
			}
			else if(this.noOfDays >= 61 && this.noOfDays <= 184) {
				this.interestRate = 8.50;
			}
			else if(this.noOfDays >= 185 && this.noOfDays <= 366) {
				this.interestRate = 10.00;
			}
			return (amount*this.interestRate)/100;
		}
		
	}

	
}
