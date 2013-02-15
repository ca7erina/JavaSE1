package Day03.comparation;
import java.util.*;
public class CompareDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s1="ABC";
		String s2="BCD";
		String s3="ABC";
		
		System.out.println(s1.compareTo(s2)+"  ABC-BCD="+('A'-'D'));
		System.out.println(s2.compareTo(s1));
		System.out.println(s1.compareTo(s3));
		Bylength bylength=new Bylength();
		String s4="abcd";
		String s5="efg";
		System.out.println(bylength.compare(s4, s5));
		System.out.println(bylength.compare(s5, s4));
		System.out.println(bylength.compare(s4, s4));
		
		
		
		
		List<String> strs=new ArrayList<String>();
		strs.add("ABC");
		strs.add("BCD");
		strs.add("ABC");
		strs.add("abcdefg");
		strs.add("xyz");
		strs.add("HUJIK");
		strs.add("AcGt");	
		Collections.sort(strs);//default String type conparator.
		System.out.print(strs);
		
		
		
		
		
		List<Person> users= new ArrayList<Person>();
		users.add(new Person("Yooji",16));
		users.add(new Person("Evan",22));
		users.add(new Person("Zoey",16));
		users.add(new Person("Mike",13));
		users.add(new Person("Cat",23));
		users.add(new Person("Clint",24));
		
		
		
		
		
		
	
		ByName byName=new ByName();
		Collections.sort(users,byName);		
		System.out.println("\nSorted by name ascend  "+users);
		
		ByAge byAge=new ByAge();
		Collections.sort(users,byAge);
		System.out.println("\nSorted by age descend  "+users);
		
		
		
		PriorityQueue<Person> usesp= new PriorityQueue<Person>();
		usesp.add(new Person("Yooji",16));
		usesp.add(new Person("Evan",22));
		usesp.add(new Person("Zoey",16));
		usesp.add(new Person("Mike",13));
		usesp.add(new Person("Cat",23));
		usesp.add(new Person("Clint",24));
		System.out.println(usesp);
		
		System.out.println(usesp.poll());
	}
		

}


class ByName implements Comparator<Person>{
	public  int compare(Person p1,Person p2){
		return (p1.name.compareTo(p2.name));
	}
	
	
}

class byTest implements Comparable<Person>{

	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class ByAge implements Comparator<Person>{
	public  int compare(Person p1,Person p2){
		return -(p1.age -p2.age);
	}
	
}

class Bylength implements Comparator<String>{		
	public  int compare(String o1,String o2){
		return -(o1.length()-o2.length());
	}
}

class Person {
	String name;
	int age;
	public Person(){}
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public String toString(){
		return " "+this.name+this.age+" ";
	}
class users{
	Person person = new Person();
	

}

}
