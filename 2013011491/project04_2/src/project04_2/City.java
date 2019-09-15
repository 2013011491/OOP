package project04_2;

public class City {
	
	private String name;
	private double lat;
	private double lon;
	
	public City() {}
	
	public City(String name, double lat,double lon) {
		this.name=name;
		this.lat=lat;
		this.lon=lon;
	}
	
	public City(String name) {
		this.name=name;
		lat=360*Math.random();
		lon=360*Math.random();
	}
	
	public boolean equals(City b) {
		if(this.name.equals(b.name)&&this.lat==b.lat&&this.lon==b.lon)
			return true;
		else
			return false;
	}
	
	public String toString() {
		return this.name+", "+this.lat+", "+this.lon+"\n";
	}
	
	public static double cityDistance(City a, City b) {
		return Math.sqrt(Math.pow((a.lat-b.lat),2)+Math.pow((a.lon-b.lon),2));
	}
}
