package banking;

public class Savings extends Account {
	
	private int safetyDepBoxNumber;
	private int safetyDepBoxPIN;
	
	public Savings(String name, String sSN, String openingDeposit) {
		super(name, sSN, openingDeposit);
		acctNumber = "1" + acctNumber;
		setSafetyDepositBox();
	}
	
	
	private void setSafetyDepositBox() {
		safetyDepBoxNumber = (int) (Math.random() * Math.pow(10, 3));
		safetyDepBoxPIN = (int) (Math.random() * Math.pow(10, 4));
	}
	
	public void setRate() {
		rate = getBaseRate() - 0.25;
	}

	
	public void showInfo() {
		super.showInfo();
		System.out.println("Account Type: SAVINGS");
		System.out.println(" Account Features: " + 
							"\n  Safety Deposit Box Number: " + safetyDepBoxNumber + 
							"\n  Safety Deposit Box PIN: " + safetyDepBoxPIN +
							"\n  Interest Rate is " + rate + "%");
	}
		
	
}
