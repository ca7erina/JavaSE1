package day02.regularExpression;
import java.util.*;
public class RegExString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str="100101";
		String zip="^\\d{6}$";
		boolean isZipCode=str.matches(zip);
		System.out.println(isZipCode);
		str="1001011";
		 isZipCode=str.matches(zip);
		 System.out.println(isZipCode);
		 
		 String user=",1001, tom, ,tom@tarena.com.cn,,";
		 String[] data=user.split(",\\s*");
		 System.out.println(data[0]);
		 System.out.println(data[1]);
		 System.out.println(data[2]);
		 System.out.println(data[3]);
		 System.out.println(Arrays.toString(data));
		 String[] Data1=new String[]{};
		 String[] Data2=new String[]{};
		 Data1=Arrays.copyOfRange(data, 1, 3);
		Data2=Arrays.copyOfRange(data, 4,5);
		 System.out.println(Arrays.toString(Data1));
		 System.out.println(Arrays.toString(Data2));
		Data2=Arrays.copyOf (Data2,Data2.length+2);
		 System.arraycopy(Data1,0, Data2, 1, Data1.length);
		 System.out.println(Arrays.toString(Data1));
		 System.out.println(Arrays.toString(Data2));
		 
	}

}
