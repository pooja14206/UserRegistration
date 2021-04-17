package user.registration;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to user registration file.");
		/**
		* creating objects for PatternMatching class
		*/

		PatternMatching firstName = new PatternMatching();
		PatternMatching lastName = new PatternMatching();
		PatternMatching emailId = new PatternMatching();
		PatternMatching phoneNumber = new PatternMatching();
		PatternMatching password = new PatternMatching();
		
		/**
		* calling the function of PatternMatching class using the onjects.
		*/
		firstName.checkPatternFirstName();
		lastName.checkPatternLastName();
		emailId.checkPatternEmailId();
		phoneNumber.checkPatternPhoneNumber();
		password.checkPatternPassword();

	}

}
