package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static boolean checkValidFirstName(String fName) {
		String fNameRegEx = "[A-z][a-z]{3,}";
		Pattern p = Pattern.compile(fNameRegEx);
		if(fName==null) {
			return false;
		}
		Matcher m = p.matcher(fName);
		return m.matches();
	}
	
	public static void main(String[] args) {
		System.out.println("****Welcome to User Registration****");
		
		String fName="Twarit";
		boolean isfNameValid= checkValidFirstName(fName);
		if(isfNameValid) {
			System.out.println(fName + " is valid");
		}
		else
			System.out.println(fName + " is not valid");
		
		
		
	}

}
