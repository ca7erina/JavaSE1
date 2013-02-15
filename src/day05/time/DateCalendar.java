package day05.time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class DateCalendar {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
	//		long now=System.currentTimeMillis();
	//		now+=1000L*3600*24*5;
	//		System.out.println(now);
	//		
	//		
			Calendar cal= new GregorianCalendar();
	//		cal.add(Calendar.DAY_OF_MONTH,5);
	//		System.out.println(cal.getTime().getTime());
			
			
			
	//		long now2=System.currentTimeMillis();
	//		now2+=1000L*3600*24*60;
	//		System.out.println(cal.getTime().getTime()/(1000L*3600*24)+" now:"+now2);
	//		
			
			cal=new GregorianCalendar();
	//		cal.add(Calendar.MONTH, 2);
	//		System.out.println(cal.getTime().getTime());
			
			
			long now3=System.currentTimeMillis();
			//format
			DateFormat fmt= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String str =fmt.format(now3);
			System.out.println(str);
			
			
			DateFormat fmt2= new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
			System.out.println(fmt2.format(cal.getTime()));
			
			
			
		}

}
