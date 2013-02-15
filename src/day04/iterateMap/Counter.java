package day04.iterateMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.*;



public class Counter {
	
	
	String taget= Target.body;
	
	Map<Character,Integer> map = new HashMap<Character,Integer>();
	
	Set<Character> keySet = map.keySet();
	Iterator<Character> i=keySet.iterator();
	
	Collection<Integer> values = map.values();
	Iterator<Integer> it=values.iterator();
	
	Set<Entry<Character,Integer>> entrySet= map.entrySet();
	List list=new ArrayList<Entry<Character,Integer>>(entrySet);
	Iterator<Entry<Character,Integer>> ite= list.iterator();
	
	
	
	public  Counter(){}
	
	public  Map<Character,Integer> countwords(String str){
		Collections.sort(list,new Comparator<String>(){    // simplified 
			public int compare(String o1,String o2){
				return o1.length()-o2.length();
			}
		});
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			Integer num = map.get(ch);
			map.put(ch,num == null?1 : num+1);			
		}								
		return map;	
	}	
	
	
	
	
	
	
	
}
