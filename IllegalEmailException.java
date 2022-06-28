// Creating our own user - defined Exception 


public class IllegalEmailException extends Exception {
	
	public IllegalEmailException(String message) {
		
		super(message);
	}
}
