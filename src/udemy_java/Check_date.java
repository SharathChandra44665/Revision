package udemy_java;

import java.util.Calendar;

public class Check_date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar my_calendar=Calendar.getInstance();
		System.out.println(my_calendar.getTime());
		System.out.println(my_calendar.getTime().toString().replace(" ", "").replace(":", ""));
	}

}
