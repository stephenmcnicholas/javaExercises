package banking;

import java.util.Random;

public abstract class Account implements IBaseRate{

	private String firstName;
	private String surname;
	private String sSN;
	private double balance;
	private double openingDeposit;
	protected String acctNumber;
	protected double rate;
	private static int counter = 10000;
	
	public Account(String name, String sSN, String openingDeposit) {
		this.surname = name;
		this.sSN = sSN;
		this.openingDeposit = Double.parseDouble(openingDeposit);
		acctNumber = setAccountNumber();
		balance = Double.parseDouble(openingDeposit);
		setRate();
	}
	
	private String setAccountNumber() {
		String lastTwoSSN = sSN.substring(sSN.length()-2);
		String randomThreeDigits = Integer.toString((int) (Math.random() * Math.pow(10,3)));
		String uniqueID = Integer.toString(counter);
		counter++;		
		return lastTwoSSN + uniqueID + randomThreeDigits;
	}
	
	public abstract void setRate();
	
	public void transfer(String payee, int value) {
		if (value > balance){
			System.out.println("You have insufficient funds");
		}
		else {
			balance = balance - value;
			System.out.println("Transferring " + value + " to " + payee);
			printBalance();
		}
	}
	
	public void deposit(int value) {
		balance = balance + value;
		System.out.println("Depositing " + value);
		printBalance();
	}
	
	public void withdrawal(int value) {
		if (value > balance){
			System.out.println("You have insufficient funds");
		}
		else {
			balance = balance - value;
			System.out.println("withdrawing " + value);
			printBalance();
		}
	}
	
	private void printBalance() {
		System.out.println("Your balance is now ?" + balance);
	}
	
	public void compound() {
		double accruedInterest = balance * (rate/100);
		System.out.println("accrued interest = " + accruedInterest);
		balance = balance + accruedInterest;
		printBalance();
	}
	
	public void showInfo() {
		System.out.println("NAME: " + surname + 
							"\nAcct Num: " + acctNumber +
							"\nBalance: ?" + balance);
	}
	
	
}
