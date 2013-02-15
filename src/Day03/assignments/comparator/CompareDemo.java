package Day03.assignments.comparator;
import java.util.*;
public class CompareDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
		List<String> strs=new ArrayList<String>();
		strs.add("ABC");
		strs.add("BCD");
		strs.add("ABC");
		strs.add("abcdefg");
		strs.add("xyz");
		strs.add("HUJIK");
		strs.add("AcGt");	
		Collections.sort(strs);//default String type conparator.
		System.out.println("Default compare method of comparator Used in collections.sort(str) \n"+strs);
			
		
		
		List<Person> users= new ArrayList<Person>();
		users.add(new Person("Yooji",16));
		users.add(new Person("Evan",22));
		users.add(new Person("Zoey",16));
		users.add(new Person("Mike",13));
		users.add(new Person("Cat",23));
		users.add(new Person("Clint",24));
		
	
		ByName byName=new ByName();
		Collections.sort(users,byName);		
		System.out.println("\nArraylist users Sorted by name ascend\n"+users);
		
		ByAge byAge=new ByAge();
		Collections.sort(users,byAge);
		System.out.println("\nArraylist users Sorted by age descend\n"+users);
				
	}
		

}


class ByName implements Comparator<Person>{
	public  int compare(Person p1,Person p2){
		return (p1.name.compareTo(p2.name));
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
		return name+age;
	}
class users{
	Person person = new Person();
	

}
}
