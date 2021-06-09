package corejava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Date d= new Date();
		System.out.println(d);
		
		SimpleDateFormat sfd = new SimpleDateFormat("d/M/yyyy");
		System.out.println(sfd.format(d));
		System.out.println(d.toString());
		
		
	}

}
