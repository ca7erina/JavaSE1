package Day03.iteration;
import java.util.*;
public class TestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> eggs=new HashSet<String>();
		eggs.add("egg");
		eggs.add("eeg");
		eggs.add("egg");
		eggs.add("eee");
		eggs.add("egg");
		eggs.add("gee");
	
		Iterator<String> ite=eggs.iterator();
		while(ite.hasNext()){
//			ite.next();
//			ite.remove();
//			eggs.add("agg?");
			
			String it=ite.next();
			System.out.println(it);
//			if(it.equals("egg")){
//				it.remove();
//			}
		}
		System.out.println(eggs);
	}

}
