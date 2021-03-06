package studentDBApp;

import java.util.Scanner;

public class Student {

	private int numberOfStudents;
	private static int studentCounter = 1000;
	private int balance = 0;
	private int courseFee = 600;
	private int coursesEnrolled = 0;
	private int year;
	private String name;
	private String courses = "";
	private String studentID;
	
	// constructor
	public Student(String nm, int yr) {
		this.name = nm;
		this.year = yr;
		
		//tempCounter = studentCounter.toString();
		//studentID = year.toString() + String.format("%04d", tempCounter);
		setStudentID();
		
		System.out.println("Student: " + name + " in Year " + year + " with Student ID: " + studentID);
		
	}
	// generate unique studentID, starting with grade level
	private void setStudentID() {
		this.studentID = year + "" + studentCounter;
		studentCounter++;
	}
	
	
	// enroll in courses (history, maths, english, chemisty, compSci)
	public void enrol() {
		System.out.println("1. History, 2. Maths, 3. English, 4. Chemisty, 5. Computer Science");
		Scanner in = new Scanner(System.in);
		Boolean enrolling = true;
		
		do{
			System.out.println("Enter a course to enrol, Q to quit");
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses = courses + "\n" + course;
				coursesEnrolled ++;
			}
			else { 
				enrolling = false;
				break;
			}
		}while(enrolling);	
	}

	// paytuition 
	public void payTuitionFees(int deposit) {
		balance = balance + coursesEnrolled * courseFee - deposit;
		System.out.println("Thank you for your payment of ?" + deposit);
		System.out.println("Balance after payment is: ?" + getBalance());
	}
	
	// view balance - get method
	public int getBalance() {
		return balance;
	}
	
	// showInfo, incl name, ID, courses enrolled, balance
	public String toString() {
		return "Name: " + name + 
				"\nYear: " + year +
				"\nStudentID : " + studentID +
				"\nCourses enrolled: " + coursesEnrolled +
				"\nBalance: ?" + balance;				
	}
	
}
