package day03.CollectionsDemo;
import java.util.*;
public class ArrayConvertCollection {

	/**
	 * @
	 * Convert between Array and Collections.
	 */
	public static void main(String[] args) {
		String[] names={"Tom","Jerry","Ada"};
		System.out.println("String "+Arrays.toString(names));
		
		//String to list ,but the length can't be changed.
		List<String> list2 = Arrays.asList(names);
		System.out.println("Arrays.asList(names) String->List : \n"+list2);
		
		//list to LinkedList
		List<String> list3 = new LinkedList<String>(list2);
		System.out.println("list=New LinkedList<String>(list2)   List-->linkedList : \n"+list3);
		
		//list to set
		Set<String>set= new HashSet<String>(list2);
		System.out.println("set=New HashSet<String>(list2)  List-->set:\n "+set);
		
		//Collection to set
		Collection<String> col=set;
		System.out.println("set=New HashSet<String>(list2)  set-->collect: \n"+set);
		
		//toArray() make the elememts in a set filling the object[]
		Object[] ary = col.toArray();
		System.out.println("ary[] = col.toArray()  clct->Array : \n"+Arrays.toString(ary));
		
		//
		String[] ary2=new String[2];
		System.out.println("String[] ary2=new String[2]  List-->set: \n"+Arrays.toString(ary2));
		
		
		ary2=col.toArray(ary2);
		System.out.println("ary2=col.toArray(ary2)  ? : \n"+Arrays.toString(ary2));
		
		
		
		System.out.println("\n\n\n  "+2);
		
	}

}
