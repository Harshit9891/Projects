package emailapp;

import java.util.Scanner;

public class EmailApp {
	
	private String firstName;
	private String lastName;
	private String department;
	private String alternateEmail;
	private int mailBoxCapacity = 800;
	private String password;
	private String email;
	private String companyName = "company.com";
	
	//Constructor to receive firstName and lastName
	
	public EmailApp(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		System.out.println("Email Created: " + this.firstName + " " + this.lastName);
		
		//get department code
		this.department=setDepartment();
		System.out.println("Department selected: " + this.department);
		
		//Call the method to get random password
		this.password=randomPass(10);
		System.out.println("Random Password is : " + this.password);
		
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companyName;
		System.out.println("Your Email is : " + email);
	}
	
	//Get Department
	private String setDepartment() {
		System.out.print("DEPARTEMENT CODE:\n1. For Sale\n2. For Development\n3. For Accounting\n4. For None\nEnter the Number: ");
		Scanner inp = new Scanner(System.in);
		int depChoice = inp.nextInt();
		if(depChoice == 1) {
			return "Sale";
		}
		else if(depChoice == 2) {
			return "Development";
		}
		else if(depChoice == 3) {
			return "Accounting";
		}
		else {return "None";}
		
	}
	
	//Generate Random Password
	
	private String randomPass(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
		char[] password = new char[length];
		for(int i=0; i<length; i++) {
			int rand = (int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
		
	
				
	}
	
	//Set mailbox capacity
    
	public void setMailboxCap(int capacity) {
		this.mailBoxCapacity=capacity;
	}
		
	//change the password
		
	public void changePass(String Password) {
		this.password=Password;
	}
	
	//set alternate email
	public void setAlternateEmail(String email) {
		this.email=email;
	}
	
	//Get Methods
	
	public int getMailboxCap() {return mailBoxCapacity;}
	public String getPass() {return password;}
	public String getAlternateEmail() {return email;}
	
	//Show Information as asked
	
	public String showInfo() {
		return "Dispaly Name : " + firstName + " " + lastName +
				"\nCompany Email : " + email + 
				"\nMailbox Capacity : " + mailBoxCapacity;
	}

}
