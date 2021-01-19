package StudentDatabaseApp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private String courses = null;
	private static int id = 1000;
	private static int courseFee = 600;
	private int gradeYear;
	private String studentID;
	private int tuitionBalance=0;
	
	//Constructor Prompt : Student's Name, Grade Year and ID
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student's First name: ");
		this.firstName=in.nextLine();
		
		System.out.print("Enter student's Last name: ");
		this.lastName=in.nextLine();
		
		System.out.print("1 - Fresher\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter the Student Class level : ");
		this.gradeYear=in.nextInt();
		
		setStudentID();
		
	}
	
	//Generate ID
	public void setStudentID() {
		id++;
		this.studentID= gradeYear + "" + id;
	}
	
	//Enroll in Courses
	public void enroll() {
		do {
			System.out.print("Enter the course you want to enroll in (Q for quit) : ");
			Scanner input = new Scanner(System.in);
			String course = input.nextLine();
				if(!course.equals("Q")) {
					courses= courses+ "\n" + course;
					tuitionBalance=tuitionBalance+courseFee;
				}
				else {
					break;
				}
		
		
		} while(1!=0);
		
				
	}
	
	//View Balance
	public void viewBalance() {
		System.out.println("Your balance is $: " + tuitionBalance);
		
	}
	
	//Pay Tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment $: ");
		Scanner inp = new Scanner(System.in);
		int payment = inp.nextInt();
		tuitionBalance = tuitionBalance - payment;
		viewBalance();
	}
	
	//Show Info
	public String showInfo() {
		return "Name : " + firstName + " " + lastName + 
				"\nCourses Enrolled : " + courses +
				"\nGrade Selected: " + gradeYear +
				"\nStudent ID: " + studentID +
				"\nBalance : $" + tuitionBalance;
	}
}
