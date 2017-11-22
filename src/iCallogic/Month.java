package iCallogic;

import java.util.Calendar;

public class Month {
	private int year;
	private int month;
	private int week;
	
	Calendar c = Calendar.getInstance();

	
	
	public int chosenMonth() {
		
		
		return 1;
	}
	
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getMonth() {
		return month;
	}

	public int getWeek() {
		return week;
	}

	public void setWeek(int week) {
		this.week = week;
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
