package studentDBApp;

import java.util.Scanner;

public class StudentDBApp {

	public static void main(String[] args) {
		// ask for number of students
		System.out.println("How many students do you want to register? ");
		
		Scanner in = new Scanner(System.in);
		int numberOfStudents = in.nextInt();
		Student[] students = new Student[numberOfStudents];
		
		for(int i = 0; i <numberOfStudents; i++) {
			System.out.println("Enter name: ");
			String name = in.next();
			System.out.println("Enter year: ");
			int year = in.nextInt();
			students[i] = new Student(name, year);
			students[i].enrol();
			System.out.println("How much would you like to deposit? ?");
			int payment = in.nextInt();
			students[i].payTuitionFees(payment);			
		}
		
		for (Student student : students) {
			System.out.println("##########################");
			System.out.println(student.toString());
		}
			
		
		
	}

}
