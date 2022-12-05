package com.gl.sowmya.emailapp.service;
import java.util.Scanner;

import com.gl.sowmya.emailapp.model.Employee;

public class DriverClass {

	public static void main(String[] args) {
		CredentialService service = new CredentialServiceImpl();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your First name");
		String firstName = scanner.next();
		System.out.println("Enter your Last name");
		String lastName = scanner.next();
		Employee employee=new Employee(firstName,lastName);
		String dept=null;
		service.passwordGenerator();
		System.out.println("Please select your department from following list");
		System.out.println("1.Press 1 for Technical");
		System.out.println("2.Press 2 for Admin");
		System.out.println("3.Press 3 for Human Resources");
		System.out.println("4.Press 4 for Legal");
		System.out.println("------------------------------");
		System.out.println("Enter Your Choice");
		int choice=scanner.nextInt();
		switch(choice) {
		case 1:
			dept = "tech";
			break;
		case 2:
			dept = "admin";
			break;
		case 3:
			dept = "HR";
			break;
		case 4:
			dept = "legal";
			break;
		default:
			System.out.println("Enter the correct choice...");
			break;
			}
	service.emailGenerator(employee, dept);
	service.displayCredentials(employee, dept);
		}
}
		
		
		
	
		
		
		
		
