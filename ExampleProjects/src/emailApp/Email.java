package emailApp;

import java.util.Scanner;

public class Email {
	
	private String email;
	private String firstName;
	private String lastName;
	private String dept;
	private String company;
	private String password;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String altEmailAddress;
	private String companySuffix = "danteswealth.com";
	
	// Constructor to receive first and last names, and apply to instance variables
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		// call a private method ask for dept		
		this.dept = setDept();
		
		// call private method that returns random pwd
		this.password = setPassword(defaultPasswordLength);
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + dept + companySuffix;
	}

	private String setDept() {
		System.out.println("Enter the Department: \n1 for Sales \n2 for Development \n3 for Accounting \n0 for None");
		Scanner in = new Scanner(System.in);
		int deptInput = in.nextInt();
		if (deptInput == 1) {return "sales.";}
		else if (deptInput == 2) {return "development.";}
		else if (deptInput == 3) {return "accounting.";}
		else {return "";}
	}
	
	
	// generate random string for password
	private String setPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!?$%^&~?";
		
		char[] password = new char[length];
		for(int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
		
	}
	
	// method to set password
	public void setPassword(String password) {
		this.password = password;
	}

	// method to get password
	public String getPassword() {
		return password;
	}

	
	// method to set mailbox capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// method to set alt email address
	public void setAltEmailAddress(String altEmail) {
		this.altEmailAddress = altEmail;
	}
	// method to get name
	public String getName() {
		return firstName + lastName;
	}
	
	
	// method to get Alt email address
	public String getAltEmail() {
		return altEmailAddress;
	}
	
	// method to get email capacity
	public int getMailnboxCapacity() {
		return mailboxCapacity;
	}
	
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName + 
				"\nCOMPANY EMAIL: " + email + 
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "Mb";
	}
	
}
