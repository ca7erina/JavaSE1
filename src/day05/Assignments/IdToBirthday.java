package day05.Assignments;
import java.util.*;
import java.text.*;
public class IdToBirthday {

	public static void main(String[] args) throws DateInputException {

		DateFormat fmt= new SimpleDateFormat  ("EEE, d MMM yyyy HH:mm:ss");				
		System.out.println("Your birthday is : "+fmt.format(readDate()));

	}
	
	public static Date readDate()throws DateInputException{	
		Scanner console= new Scanner(System.in);	
		for (int i=0;i<3;i++){
			try{
			
				System.out.print("\nPlz input your id number:");							
				String id=console.nextLine();
				
				DateFormat fmt= new SimpleDateFormat("yyyyMMdd");
				String idDate =id.substring(6, 14);
//				System.out.println(idDate);
				String birthday=idDate;		
				Date theDate=fmt.parse(birthday);
				return theDate;
					}catch(StringIndexOutOfBoundsException e){
						
						System.out.println("Need 18 numbers as a id!");
						e.printStackTrace();
						continue;
					}catch(ParseException e){
						System.out.println("Need a valid IDcard number plz.");
						e.printStackTrace();
						continue;
					}
					
		}
		throw new DateInputException(" Invalid data");		
		
	}
}


class DateInputException extends Exception{
	public DateInputException(){
		
	}
	public DateInputException(String message){
		super(message);
	}
	public DateInputException(Throwable e){
		super(e);
	}
	public DateInputException(String message,Throwable e){
		super(message,e);
	}
	
	}
