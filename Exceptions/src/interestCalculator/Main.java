package interestCalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double interest = 0;
		int flag;
		Scanner obj = new Scanner(System.in);
		while (true) {
			flag = 0;
			System.out.println("MAIN MENU");
			System.out.println("==========");
			System.out.println("1. Interest Calculator - SB");
			System.out.println("2. Interest Calculator - FD");
			System.out.println("3. Interest Calculator - RD");
			System.out.println("4. Exit");
			int choice = 0;
			System.out.println("Enter your option (1..4): ");
			try {
				choice = obj.nextInt();
				obj.nextLine();
				if(choice < 0)
					throw new NegativeValueException();
			} catch (NegativeValueException e) {
				System.out.println(e);
				System.exit(0);
			}
			switch (choice) {
			case 1:
				System.out.println("Enter the type NRI or Normal: ");
				String type = obj.nextLine();
				if(!(type.equals("Normal") || type.equals("NRI"))) {
					System.out.println("Please enter either Normal or NRI to proceed");
					System.exit(0);
				}
					
				System.out.println("Enter the average amount in your account: ");
				double amount = 0;
				try {
					amount = obj.nextDouble();
					obj.nextLine();
					if(amount < 0)
						throw new NegativeValueException();
				} catch (NegativeValueException e) {
					System.out.println(e);
					System.exit(0);
				}
				SBAccount sbAccount = new SBAccount(type, amount);
				interest = sbAccount.calculateInterest();
				break;
				
			case 2:
				System.out.println("Enter the FD amount: ");
				amount = 0;
				try {
					amount = obj.nextDouble();
					obj.nextLine();
					if(amount < 0)
						throw new NegativeValueException();
				} catch (NegativeValueException e) {
					System.out.println(e);
					System.exit(0);
				}
				
				System.out.println("Enter the number of days: ");
				int days = 0;
				try {
					days = obj.nextInt();
					obj.nextLine();
					if(days < 0)
						throw new NegativeValueException();
				} catch (NegativeValueException e) {
					System.out.println(e);
					System.exit(0);
				}
				
				System.out.println("Enter your age: ");
				int age = 0;
				try {
					age = obj.nextInt();
					obj.nextLine();
					if(age < 0)
						throw new NegativeValueException();
				} catch (NegativeValueException e) {
					System.out.println(e);
					System.exit(0);
				}
				
				FDAccount fdAccount = new FDAccount(amount, days, age);
				interest = fdAccount.calculateInterest();
				break;
				
			case 3:
				System.out.println("Enter the RD amount: ");
				amount = 0;
				try {
					amount = obj.nextDouble();
					obj.nextLine();
					if(amount < 0)
						throw new NegativeValueException();
				} catch (NegativeValueException e) {
					System.out.println(e);
					System.exit(0);
				}
				
				System.out.println("Enter the number of months (6/9/12/15/18/21): ");
				int month = 0;
				try {
					month = obj.nextInt();
					obj.nextLine();
					if(month < 0)
						throw new NegativeValueException();
				} catch (NegativeValueException e) {
					System.out.println(e);
					System.exit(0);
				}
				
				System.out.println("Enter your age: ");
				age = 0;
				try {
					age = obj.nextInt();
					obj.nextLine();
					if(age < 0)
						throw new NegativeValueException();
				} catch (NegativeValueException e) {
					System.out.println(e);
					System.exit(0);
				}
				
				RDAccount rdAccount = new RDAccount(age, month, amount);
				interest = rdAccount.calculateInterest();
				break;
				
			case 4:
				System.exit(0);
				break;
				
				
			default:
				System.out.println("Invalid Choice\n");
				flag = 1;
				break;
			}
			
			if(flag == 0) {
				System.out.println("Interest gained: " + interest + "\n");
			}
		}

	}

}
