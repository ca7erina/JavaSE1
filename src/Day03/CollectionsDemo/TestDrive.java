package Day03.CollectionsDemo;
import java.util.*;
public class TestDrive {

	/**
	 * 
	 */
	public static void main(String[] args) {
		ArrayList<String> users= new ArrayList<String>();
		users.add("Tom");
		users.add("Jerry");
//		users.add("Tom1");
		users.add("Evan");
		users.add("Jerry2");
		int index=Collections.binarySearch(users,"T");
		System.out.println(users.toString());
		System.out.println(index);

	}
}
	


