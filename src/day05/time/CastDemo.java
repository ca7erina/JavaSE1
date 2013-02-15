package day05.time;
import java.util.*;
public class CastDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		//long ->date
		long gmt=0;
		Date date= new Date();
		date.setTime(gmt);
		int year = date.getYear()+1900;
		System.out.println(year);
		System.out.println("\n"+date);
		
		//Date->Calendar
		Calendar cal = new GregorianCalendar();
		cal.setTime(date);
		int day;
		year=cal.get(Calendar.YEAR);
		cal.setTime(date);
		day=cal.get(Calendar.DATE);
		System.out.println("\n"+year);
		System.out.println("\n"+day);
		
		// changing the date:
		cal.add(Calendar.DAY_OF_YEAR,-1);
		gmt=gmt-1000*60*60*24;
		
		//long->Calendar:
		year = cal.get(Calendar.YEAR);
		System.out.println("\n"+year);//1969
		
		//Calendar->Date:
		Date d= cal.getTime();//cal-->date
		year=d.getYear()+1900;
		System.out.println("\n"+year);
		
		//date->long
		long l=d.getTime();
		System.out.println("\n"+l);
		System.out.println("\n"+gmt);
		
		
		

	}

}
