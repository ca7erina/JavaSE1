package day03.hashMap;
import java.util.HashMap;
public class TestDrive {
	public static void main(String[] args) {
		HashMap hotel=new HashMap(20);
		hotel.put("Tom",new Person("Tom",2));
		hotel.put("Jerry",new Person("Jerry",5));
		hotel.put("Tomttt",new Person("Tomttt",12));
		hotel.put("Tomtttt",new Person("Tomtttt",22));
		
		
		if (hotel.containsKey("Tom")){
			
			Person p =(Person) hotel.get("Tom");
			System.out.println("Tom's age : "+p.getAge());
		}
	}
}
class Person{
	String name;
	int age;
	public Person(String name,int age){
		this.age=age;
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	}

