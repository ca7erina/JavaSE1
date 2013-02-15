package day01;
import java.util.*;
public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		char[] chs1={'C','h','i','n','a'};
		char[] chs2={'B','J'};
		char[] chs3=Arrays.copyOf(chs1,chs1.length+chs2.length);
		System.arraycopy(chs2, 0, chs3, chs1.length, chs2.length);
		System.out.println(chs1);		
		System.out.println(chs2);
		System.out.println(chs3);
		


			String s1="China";
			String s2="BJ";
			String s3=s1+s2;
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			

			
		
		char[] chs4={'C','h','i','n','a'};
		char[] chs5=Arrays.copyOf(chs4, chs4.length);
		String s6 = "China\u4e2d\u56fd";
		String s7=s6.toUpperCase();
		System.out.println(s7);
		

		
	}
	
}
