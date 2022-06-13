// EmailAddress class to use our user-defined Exception


public class EmailAddress {
	
	public static final char AT_SIGN = '@';
	private String email;
	
	public EmailAddress(String email) throws IllegalEmailException {
		
// We test if the constructor’s parameter, email, contains the character AT_SIGN 
// (a constant equal to the @ character). If it does, we proceed normally and initialize 
// the instance variable email. If it does not, we throw an IllegalEmailException with 
// the appropriate message.
		
		if (email.indexOf(AT_SIGN) != -1) {
			this.email = email;
		}
		else {
			throw new IllegalEmailException
			("Email address does not contatin " + AT_SIGN);
		}
		}
	
// The getHost() method returns the substring comprising the characters of email after AT_SIGN. 
// Thus, for an email address of myEmailAddress@yahoo.com, the getHost method will return yahoo.com.
		
		public String getHost() {
			int index = email.indexOf(AT_SIGN);
			return email.substring(index + 1, email.length());
			
		
	}

}
