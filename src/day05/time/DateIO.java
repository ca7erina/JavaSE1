package day05.time;
import java.util.*;
import java.text.*;
public class DateIO {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		Long l=System.currentTimeMillis();	
		l+=1000L*3600*24*5;
		
		Date date = new Date(l);
		SimpleDateFormat fmt=new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
		System.out.println(fmt.format(date));
		
		
		String finalDay="2012-12-31";
		fmt=new SimpleDateFormat("yyyy-MM-dd");
		Date theDate=fmt.parse(finalDay);
		System.out.println(theDate);
		
		Date d= new Date();
		Calendar c= new GregorianCalendar();
		
	}

}
