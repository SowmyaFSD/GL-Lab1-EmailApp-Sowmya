package com.gl.sowmya.emailapp.service;

import java.util.Random;

import com.gl.sowmya.emailapp.model.Employee;

public class CredentialServiceImpl implements CredentialService {

	@Override
	public String passwordGenerator() {
		// TODO Auto-generated method stub
		String capChars="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallChars ="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String symbols= "!@#%^&*_+-?/<>";
		String values= capChars+smallChars+numbers+symbols;
		
		Random random= new Random();
		char[] password= new char[8];
		for (int i=0; i< 8; i++) {
			int randomNumber= random.nextInt(values.length());
			password[i]=values.charAt(randomNumber);
		}
		return new String(password);
	}
		

	@Override
	public String emailGenerator(Employee employee, String department) {
		// TODO Auto-generated method stub
		return(employee.getFirstName()+employee.getLastName()).toLowerCase()+ "@" + department+ "abc.com";
	}
	
	@Override
	public void displayCredentials(Employee employee, String department) {
		System.out.println(
				"Dear"+ employee.getFirstName()+ " "+employee.getLastName()+"your generated credentials are as follows:"
				);
		System.out.println("Email:--"+ emailGenerator(employee, department));
        System.out.println("Password:--"+ passwordGenerator());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
