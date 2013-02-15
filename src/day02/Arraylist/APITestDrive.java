package day02.Arraylist;
import java.util.ArrayList;
public class APITestDrive {

	public static void main(String[] args) {
		ArrayList list =new ArrayList();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		list.add("91210");	
		list.add("Picture to burn");
		list.add(0,"Poker Face");
		System.out.println(list.size());
		System.out.println(list.isEmpty());		
		
		list.remove(2);
		System.out.println(list);
		
		String name=(String) list.set(0, "You Da the one");// return Oldvalue!!!
		System.out.println(name);
		System.out.println(list);
		System.out.println(list.get(0));
		int index=list.indexOf("91210");
		System.out.println(index);
	}

}
