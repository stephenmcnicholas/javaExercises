package banking;

import java.util.LinkedList;
import java.util.List;

public class BankingApp {

	public static void main(String[] args) {
		
		String file = "C:\\Users\\stephen.mcnicholas\\eclipse-workspace\\ExampleProjects\\resources\\NewBankAccounts.csv";
		
		List<Account> accounts = new LinkedList<Account>();
		
		List<String[]> newCustomers = utils.CSV.read(file);
		for (String[] customer : newCustomers) {
			if(customer[2].equals("Savings")) {
				
				accounts.add(new Savings(customer[0], customer[1],customer[3]));
			}
			else if(customer[2].equals("Checking")){
				accounts.add(new Checking(customer[0], customer[1],customer[3]));
			}
			else {
				System.out.println("Error: Unrecognised account type");
			}
		}
		
		for (Account acc : accounts) {
			acc.showInfo();
		}
	}

}
