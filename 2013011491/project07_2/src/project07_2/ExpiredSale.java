package project07_2;

public class ExpiredSale extends Sale {
	
	private double expired;
	
	public ExpiredSale() {
		super();
		setExpired(0);
	}
	
	public ExpiredSale(String theName, double thePrice, double theExpired) {
		super(theName, thePrice);
		setExpired(theExpired);
	}
	
	public void setExpired(double theExpired) {
		expired = theExpired;
	}
	
	public String toString() { return (getName() + " Price = $" + getPrice() + " Expired = " + expired + " left\n" + " Deliver Fee = $" + deliverFee()); }
	
	public double deliverFee() {
		if(expired>=10) return 3.0;
		else if(3<=expired && expired<10) return 2.0;
		else if(1.0<expired && expired<3.0) return 0.0;
		else return 100;
	}
	
}
