package day05;
import java.util.*;
public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] test={"Tom","Jerry","Amy"};	
		System.out.println(" String:"+Arrays.toString(test));
		
		List<String> test1=  Arrays.asList(test);
		System.out.println("List: "+test);
		
		List<String> test2= new ArrayList<String>(test1);
		System.out.println("Arraylist: "+test2);
		
		Set<String> set= new HashSet<String>(test1);
		System.out.println("Hashset: "+set);
		
		Collection<String> clct=set;
		System.out.println("Collection<String>: "+clct);//must has <String>
		
		Object[] clctToArray=clct.toArray();
		System.out.println("Object[]: "+clctToArray);
		
		String[] toary=new String[2];
		toary = clct.toArray(toary);
		System.out.println("Array" +": "+clctToArray);
	}

}
