package project05_2;

import java.util.Scanner;

public class EnumValuesDemo {

	enum Day {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int i;
		Day[] WorkDay = Day.values();
		double hours =0; double sum =0;
		for(i=0;i<5;i++) {
			System.out.println("Enter hourses worked for "+ WorkDay[i]);
			hours = keyboard.nextDouble();
			sum += hours;
		}
		System.out.println("Total hours work = "+sum);
	}
}
