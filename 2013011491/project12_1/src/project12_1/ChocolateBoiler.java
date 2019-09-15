package project12_1;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	
	
	public ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
	private static ChocolateBoiler unique;
	
	public static ChocolateBoiler getInstance() {
		if(unique==null) {
			synchronized(ChocolateBoiler.class) {
				if(unique==null)
					unique = new ChocolateBoiler();
			}
		}
		return unique;
	}
	// Change the above code
	
	/* Add the code */
	
	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiled = false;
			System.out.println("Filling with mixture");
		}
		else
			System.out.println("Already filled");
	}
	
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			empty = true;
			System.out.println("Draining the mixture");
		}
		else
			System.out.println("Already drained");
	}
	
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			boiled = true;
			System.out.println("Boiling the mixture");
		}
		else
			System.out.println("Already boiled");
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}
}
