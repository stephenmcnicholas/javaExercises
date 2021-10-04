package scanner;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a line of text");
		String inputText = input.nextLine();
		System.out.println("You entered: " + inputText);
			
		System.out.println("Enter your age");
		int inputAge = input.nextInt();
		System.out.println("You are " + inputAge + " years old");
	
	}

}
