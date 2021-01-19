package StudentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		
		// How many students are added
		System.out.print("Enter the number of students to be added : ");
		Scanner inpu = new Scanner(System.in);
		int input = inpu.nextInt();
		Student[] stud = new Student[input];
		
		
		
		//Create n number of students
		for(int n=0;n<input;n++) {
			stud[n] = new Student();
			stud[n].enroll();
			stud[n].payTuition();
			System.out.println(stud[n].showInfo());
		}

	}

}
