package user.registration;

import java.util.regex.*;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to user registration file.");

		PatternMatching firstName = new PatternMatching();
		PatternMatching lastName = new PatternMatching();
		PatternMatching emailId = new PatternMatching();

		firstName.checkPatternFirstName();
		lastName.checkPatternLastName();
		emailId.checkPatternEmailId();

	}

}
