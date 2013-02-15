package day05.time;
import java.util.*;
public class JavaTimeSystem {

	/**
	 * @ Java time system
	 *  GMT long;Date ;Calendar
	 * 
	 * 	Calendar cal= new GregorianCalendar();
		y=cal.get(Calendar.YEAR);
		m=cal.get(Calendar.MONTH)+1;// it starts from 0 
	 */
	public static void main(String[] args) {
		long now= System.currentTimeMillis();
		long year=now/1000/60/60/24/365+1970;
		System.out.println(year);
		
		long month=now/1000/60/60/24/365/10;
		System.out.println(month);
		
		Date date= new Date(now);
		int y=date.getYear()+1900;
		System.out.println(y);
		int m=date.getMonth()+1;
		System.out.println(m);
		int d=date.getDay();
		System.out.println(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());
		
		
		Calendar cal= new GregorianCalendar();
		y=cal.get(Calendar.YEAR);
		;// it starts from 0 
		System.out.println(" "+y+" "+m);
		
	}

}
