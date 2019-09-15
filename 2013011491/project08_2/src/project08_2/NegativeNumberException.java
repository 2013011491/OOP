package project08_2;

public class NegativeNumberException extends Exception{
	
	public NegativeNumberException() {
		super("This number cannot be accepted!!");
	}
	
	public NegativeNumberException(String message) {
		super(message);
	}	
}
