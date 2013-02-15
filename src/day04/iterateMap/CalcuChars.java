package day04.iterateMap;
import java.util.*;
import java.util.Map.Entry;

public class CalcuChars {

	/**
	 * @
	 *	 Calculate the times of a single char's showing.
	 */
	public static void main(String[] args) {
		String str= "abcef hghij klshell isnihal liido,ntkn.ow";
		System.out.println("Target String: \""+str+"\"");
		
		
		/* Initialize a map to contain the 
		 * key->character, value -> counting;*/
		Map<Character,Integer> map = countAll(str);
		System.out.println(map);
		
		/* map.values()->Collection<Integer>
		 * Use iterator to count totoal number of the values .
		 * 
		 */
		Collection<Integer> values = map.values();
		Iterator<Integer> ite = values.iterator();
		int all=0;
		while (ite.hasNext()){
			Integer n=ite.next();
			all+=n;
		}
		System.out.println("Totally count of characters: "+all);
		
		
		/*
		 * map.keySet()--> Set<Character>;
		 * Use iterator to print the "key" .
		 * After u get the "value" u can also print the "value" form a "map".
		 */
		Set<Character> keySet = map.keySet();
		int all2=0;
		for(Iterator<Character> i=keySet.iterator();i.hasNext();){
			Character ch = i.next();
			Integer num=map.get(ch);
			all2+=num;
			System.out.println("Char[ "+ch+" ]  Times[ "+num+" ]   Rates[ "+((double)num/all*100)+"% ]");
		}
		System.out.println("Totally count of characters: "+all2);

		/*map.engtrySet()-->ArrayList<Entry<Character,Integer>>(entrySet)
		 * use Collection.sort
		 * 
		 */
		Set<Entry<Character,Integer>> entrySet=map.entrySet();
		List<Entry<Character,Integer>> list=new ArrayList<Entry<Character,Integer>>(entrySet);
		Collections.sort(list,new ByValue());
		
		System.out.println("\n\nTOP 10 : \n");
		for(Iterator<Entry<Character,Integer>> it = list.iterator();it.hasNext();){
			Entry<Character,Integer> entry = it.next();
			char ch = entry.getKey();
			int num = entry.getValue();
			System.out.println("Char[ "+ch+" ]  Times[ "+num+" ]   Rates[ "+(int)((double)num/all*100)/1+"% ]");
		}
		

		
		
	}	
	
	
	
	
	
	public static Map<Character,Integer> countAll(String str){
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			Integer num = map.get(ch);
			map.put(ch,num == null?1 : num+1);			
		}								
		return map;
		
	}	
		
	

}
class ByValue implements Comparator<Entry<Character,Integer>>{
	public int compare( Entry<Character,Integer> e1,Entry<Character,Integer> e2){
	return -(e1.getValue()- e2.getValue());
	}
	
}