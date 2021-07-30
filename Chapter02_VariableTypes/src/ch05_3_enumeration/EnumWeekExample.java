package ch05_3_enumeration;

import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week= cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
			case 1:
				today = Week.Sunday;
				break;
			case 2:
				today = Week.Monday;
			case 3:
				today = Week.Tuesday;
				break;
			case 4:
				today = Week.Wendesday;
			case 5:
				today = Week.Thursday;
				break;
			case 6:
				today = Week.Friday;
			case 7:
				today = Week.Saturday;
			}
		
		System.out.println("오늘 요일: " + today);
		
		if(today ==Week.Sunday) {
			System.out.println("We watch sunday football on NBC.");
		} else {
			System.out.println("Today is the day we focus on coding.");
		}
		
	}
	
	
	
}
