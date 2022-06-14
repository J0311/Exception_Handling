// This is our client class for the EmailAddress, hence the Main method

import java.util.Scanner;

public class EmailChecker {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
// We ask the user to input an email address, myEmail. We then try to instantiate the EmailAddress object 
// address, passing myEmail to the constructor. 	
		
		System.out.println("Enter your email address >");
		String myEmail = scan.next();
		try {
			
			EmailAddress address = new EmailAddress(myEmail);
			System.out.println("Your host is " + address.getHost());
			
// If myEmail does not contain the @ character, our EmailAddress constructor throws an IllegalEmailException, 
// which we catch.	
			
		}
		catch(IllegalEmailException iee) {
			System.out.println(iee.getMessage());
			
// In this catch block, we print the message the EmailAddress constructor sent to the IllegalEmailException 
// constructor. If myEmail contains the @ character, we continue executing inside the try block. 
		}
		
	}

}
