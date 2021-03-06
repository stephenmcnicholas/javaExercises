package banking;

public class Checking extends Account{
	
	private int debitCardNumber;
	private int debitCardPIN;
	
	
	
	public Checking(String name, String sSN, String openingDeposit) {
		super(name, sSN, openingDeposit);
		acctNumber = "2" + acctNumber;
		setDebitCard();
	}
	
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
	
	}
	
	public void setRate() {
		rate = getBaseRate() * 0.15;
	}

	
	public void showInfo() {
		super.showInfo();
		System.out.println("Account Type: CHECKING" + 
							"\n Account Features: " + 
							"\n  Debit card number: " + debitCardNumber +
							"\n  Debit card PIN: " + debitCardPIN +
							"\n  Interest Rate is " + rate + "%");
	}

	
	
	 
}
