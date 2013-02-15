package day03.CollectionsDemo;

import java.util.*;

public class CollectionDuplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> names= new ArrayList<String>();
		names.add("honey");
		names.add("Tommy");
		names.add("Mike");
		names.add("Ada");
//		int index=Collections.binarySearch(names."Tom");
//		System.out.println(index);
		ArrayList<String>list=names;
		System.out.println(names==list);
		System.out.println(list.get(0)==names.get(0));
		
		list = (ArrayList<String>)names.clone();
		System.out.println(names==list);
		System.out.println(list.get(0)==names.get(0));
		
		//Poker<card> p1= new LinkedList<card> (p2 )
		List<String> list2=new LinkedList<String>(names);
		System.out.println(names==list2);
		System.out.println(list2.get(0)==names.get(0));
		
		
		List<String> list3=(LinkedList<String>)list2;
		System.out.println(names==list3);
		System.out.println(list3.get(0)==names.get(0));
		
		Set<String> set=new HashSet<String>(names);
		System.out.println(set);
		
	}

}
