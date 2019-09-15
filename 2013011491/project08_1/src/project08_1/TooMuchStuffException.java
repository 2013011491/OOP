package project08_1;

public class TooMuchStuffException extends Exception {

	private int inputNumber;
	
	public TooMuchStuffException(String message) {
		super(message);
	}
	
	public TooMuchStuffException() {
		super("Too much stuff!");
	}
	
	public TooMuchStuffException(int a) {
		super();
		inputNumber = a;
		getNumber();
	}
	
	public int getNumber() {
		return inputNumber;
	}
}
