package day02.Arraylist;
import java.util.*;
public class TestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("b");
		list.add("j");
		list.add(0,"C");
		list.add(1,"N");
		
		System.out.println(list.size());
		System.out.println(list);
		
		StringBuilder buf=new StringBuilder();
		buf.append("b");
		buf.append("j");
		buf.insert(0,"C");
		buf.insert(1,"N");
		
		System.out.println(buf.length());
		System.out.println(buf);
	}

}
