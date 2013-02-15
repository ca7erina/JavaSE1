package day05.Assignments;
import java.util.*;
import java.text.*;
public class ContractSigningDate {

	/**
	 *
	 */
	public static void main(String[] args) throws  ParseException {
		String str="2009-5-25";
		Date startDate= new Date();
		SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd");
		startDate=fmt.parse(str);
		System.out.println("The contract starts from:"+str);
		System.out.println("You have to resign it at :"+fmt.format(resignDate(startDate,-1,3)));
	
			
	}
	public static Date resignDate(Date startDate,int months,int years){
		Calendar cal= Calendar.getInstance();
		cal.setTime(startDate);
		
		cal.add(Calendar.YEAR,years);//out of date after 3 year
		cal.add(Calendar.MONTH,months);//before 1 month;
		
		if(cal.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY||cal.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY){
			cal.add(Calendar.WEEK_OF_MONTH, +1);
		}
		cal.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
		
		
		return cal.getTime();
		
	}

}
