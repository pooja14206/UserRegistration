package user.registration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternMatching {
	/**
	 * This method is used validating userinput firstname.
	 * 
	 * @param firstNamePattern hold the correct pattern to match with the userinput.
	 */

	public void checkPatternFirstName() {
		String firstNamePattern = "^[A-Z]{1}[a-z]{2,}$";
		Scanner userInput = new Scanner(System.in);
		System.out.println("enter the First Name: ");
		String checkPattern = userInput.next();

		if (Pattern.matches(firstNamePattern, checkPattern))
			System.out.println("Pattern match. Correct Input.");
		else
			System.out.println("patern match fail!\nFirst name starts with Cap and has minimum 3 characters");
	}

	/**
	 * This method is used validating userinput lastname.
	 * 
	 * @param lasttNamePattern hold the correct pattern to match with the userinput.
	 */

	public void checkPatternLastName() {
		String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$";
		Scanner userInput = new Scanner(System.in);
		System.out.println("enter the Last Name: ");
		String checkPattern = userInput.next();

		if (Pattern.matches(lastNamePattern, checkPattern))
			System.out.println("Pattern match.");
		else
			System.out.println("patern match fail! \nLast name starts with Cap and has minimum 3 characters");
	}

	/**
	 * This method is used validating userinput email.
	 * 
	 * @param emailIdPattern hold the correct pattern to match with the userinput.
	 */

	public void checkPatternEmailId() {
		String emailIdPattern = "^[a-zA-Z0-9]{1,}[.a-zA-Z0-9]*@[a-zA-Z0-9]{1,}((.){1}+)([a-z]{1,3}+)(.[a-z]{2})*$";
		Scanner userInput = new Scanner(System.in);
		System.out.println("enter the Email address: ");
		String checkPattern = userInput.next();

		if (Pattern.matches(emailIdPattern, checkPattern))
			System.out.println("Pattern match.");
		else
			System.out.println("patern match fail!Email has 3 mandatory parts abc,bl & co and 2 optional (xyz & in) with precise @ and.positions");
	}

	/**
	 * This method is used validating userinput phoneNo.
	 * 
	 * @param phoneNumberPattern hold the correct pattern to match with the userinput.
	 */

	public void checkPatternPhoneNumber() {
		String phoneNumberPattern = "[0-9]{2}[\\s][0-9]{10}$";
		Scanner userInput = new Scanner(System.in);
		System.out.println("enter the PhoneNo: ");
		String checkPattern = userInput.nextLine();

		if (Pattern.matches(phoneNumberPattern, checkPattern))
			System.out.println("Pattern match.");
		else
			System.out.println("patern match fail!\nCountry code follow by space and 10 digit number");
	}

	/**
	 * This method is used validating userinput password.
	 * Rule-1 Minimum 8 character
	 * Rule-2 At least one Upper case
	 * Rule-3  At least one Numeric value 
	 * Rule-4 at least one Special character
	 * @param passwordPattern hold the correct pattern to match with the userinput.
	 */

	public void checkPatternPassword() {
		String passwordPattern = "^(?=.*\\d)([a-z])*(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$";
		Scanner userInput = new Scanner(System.in);
		System.out.println("enter the Password: ");
		String checkPattern = userInput.next();

		if (Pattern.matches(passwordPattern, checkPattern))
			System.out.println("Pattern match.");
		else
			System.out.println("patern match fail! \nplease follow the pattern for right password");
	}

}
