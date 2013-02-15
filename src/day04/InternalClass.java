package day04;
import java.util.*;
import day04.Foo.Koo;
public class InternalClass {
	
	public static void main(String[] args) {
		
	
		Koo koo=new Koo();
		koo.test();
		Foo.Koo fk= new Koo();
		Foo.Koo fk2= new Foo.Koo();
		Koo fk3 = new Koo();
		Koo fk4 = new Foo.Koo();
//		Foo.Koo fk5 = new Foo().new Koo(); ?
		System.out.println(fk+" "+fk2+" "+fk3+" "+fk4);
		
	
	String[] names={"Tom","Amy","Evan"};
	
	Arrays.sort(names,new Bylength());
	
	}
	private static class Bylength implements Comparator<String>{
		public int compare(String s1,String s2){
			return s1.length()-s2.length();
		}
	}
}

class Foo{
	static final int a=1;
	final int b=8;

	static class Koo{
//		private static int b=1;
		static String cc="b";
		public void test(){
//			System.out.print(cc);
//			System.out.print(b);
			System.out.print(a);
		}
		public String toString(){
			return cc;
		}
	}
	
}