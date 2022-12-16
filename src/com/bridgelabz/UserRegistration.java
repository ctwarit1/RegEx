package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//checking for last name if it is valid or not
public class UserRegistration {
	
	/*
//	method for checking last name
	public static boolean checkValidFirstName(String fName) {
		String fNameRegEx = "[A-z][a-z]{3,}";
		Pattern p = Pattern.compile(fNameRegEx);
		if(fName==null) {
			return false;
		}
		Matcher m = p.matcher(fName);
		return m.matches();
	}
	
//	method for checking last name
	public static boolean checkValidLastName(String lName) {
		String lNameRegEx = "[A-z][a-z]{3,}";
		Pattern p = Pattern.compile(lNameRegEx);
		if(lName==null) {
			return false;
		}
		Matcher m = p.matcher(lName);
		return m.matches();
	}
	*/
	
//	main method
	public static void main(String[] args) {
		System.out.println("****Welcome to User Registration****");
		System.out.println();
		/*
//		for first name
		String fName="Twarit";
		boolean isfNameValid= checkValidFirstName(fName);
		System.out.println("Checking if fist name is valid or not ");
		if(isfNameValid) {
			System.out.println(fName + " is valid");
		}
		else {
			System.out.println(fName + " is not valid");
		}
		System.out.println();
		
		
//		for last name
		String lName="Chokniwal";
		boolean islNameValid= checkValidLastName(lName);
		System.out.println("Checking if last name is valid or not ");
		if(islNameValid) {
			System.out.println(lName + " is valid");
		}
		else {
			System.out.println(lName + " is not valid");
		}
		*/
		
		Scanner enter=new Scanner(System.in);
		
//		checking if entered email is valid or not
		System.out.println("Enter email id: ");
		boolean b = Pattern.matches("[A-Za-z0-9]+[@][a-zA-Z]{3,15}[.][a-zA-Z]{2,3}", enter.next());
		System.out.println(b);

//		checking if entered mobile number is valid or not
		System.out.println("Enter mobile number followed by country code: ");
		boolean b1=Pattern.matches("[1-9]{2}\s[0-9]{10}", enter.nextLine());
		System.out.println(b1);
		
	}

}
