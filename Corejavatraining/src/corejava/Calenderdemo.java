package corejava;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calenderdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Calendar cal= Calendar.getInstance();
		SimpleDateFormat sfd = new SimpleDateFormat("d/M/yyyy");
		System.out.println(cal.getWeekYear());
		System.out.println(cal.getTime());
		System.out.println(cal.getCalendarType());
		System.out.println(cal.get(Calendar.DATE));
		
	}

}
