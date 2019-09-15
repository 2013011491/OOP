package project03_3;

public class DateFirstTry {
	
	public String month;
	public int day;
	public int year;
	 
	public void makeItNewYears() {
		month = "January";
		day = 1;
	}
	
	public String yellIfNewYear() {
		if(month.equals("January")==true && day==1){
			return "Happy New Year!";
		}else{
			return "Not New Year's day.";
		}
		}
}
