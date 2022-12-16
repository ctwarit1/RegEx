package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


//checking for last name if it is valid or not
public class UserRegistration {
	public static boolean checkValidLastName(String lName) {
		String lNameRegEx = "[A-z][a-z]{3,}";
		Pattern p = Pattern.compile(lNameRegEx);
		if(lName==null) {
			return false;
		}
		Matcher m = p.matcher(lName);
		return m.matches();
	}
	
	public static void main(String[] args) {
		System.out.println("****Welcome to User Registration****");
		
		String lName="Chokniwal";
		boolean islNameValid= checkValidLastName(lName);
		if(islNameValid) {
			System.out.println(lName + " is valid");
		}
		else
			System.out.println(lName + " is not valid");
		
		
		
	}

}
