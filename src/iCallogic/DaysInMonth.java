package iCallogic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DaysInMonth {
	Calendar c = Calendar.getInstance();
	Month m = new Month();
	public int Days() {
		
		try {
			String date = "" + CurrentMonth() + "/" + CurrentYear();
			SimpleDateFormat dateFormat = new SimpleDateFormat("MM/yyyy");
			Date convertedDate;
			convertedDate = dateFormat.parse(date);
			c.setTime(convertedDate);
			c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		return c.getActualMaximum(Calendar.DAY_OF_MONTH);
	}
	
	private int CurrentMonth() {
		return c.get(c.MONTH) + 1;
	}
	
	private int CurrentYear() {
		return c.get(c.YEAR);
	}
	
	public int DaysInWeeksForMonth() {
		String[] daysInWeek = {"Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday", "Sunday"};

		  int count = 1;
		  for(String s: daysInWeek) {
			  count++;
			  System.out.println(s +"==" + firstDayOfMonth());
			  if(s.equals(firstDayOfMonth()))
				  break;
			  
		  }
		  count = daysInWeek.length - count;

		  return count;
		}
	
	public int weeksInMonth() {
		c.set(Calendar.DAY_OF_MONTH, c.getActualMinimum(Calendar.DAY_OF_MONTH));
		int firstDay = c.get(c.DAY_OF_MONTH);
		c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		int lastDay = c.get(c.DAY_OF_MONTH);
		
		return 1;
	}
	
	
	public boolean bFirstWeekOfMonth() {
		c.set(c.YEAR, m.getYear());
		c.set(c.MONTH, m.getMonth());
		c.set(c.DAY_OF_MONTH, c.getActualMinimum(c.DAY_OF_MONTH));
		c.getActualMinimum(c.DAY_OF_MONTH);
		if (c.get(c.WEEK_OF_MONTH) == m.getWeek()) {
			return true;
		}else return false;
	}
	
	public boolean bLastWeekOfMonth() {
		c.getActualMaximum(Calendar.DAY_OF_MONTH);
		if (c.get(c.WEEK_OF_MONTH) == m.getWeek()) {
			return true;
		}else return false;
	}
	
	public String firstDayOfMonth() {
		c.set(c.YEAR, m.getYear());
		c.set(c.MONTH, m.getMonth());
		c.set(c.DAY_OF_MONTH, c.getActualMinimum(c.DAY_OF_MONTH));
		Date d = c.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat("dd");
		System.out.println(sdf.format(d));
		return sdf.format(d);
	}
	
	public void setDate() {
		m.setMonth(11);
		m.setYear(17);
		m.setWeek(1);
	}
}
