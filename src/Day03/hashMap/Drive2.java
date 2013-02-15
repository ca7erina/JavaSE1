package Day03.hashMap;

import java.util.*;

public class Drive2 {


	public static void main(String[] args) {
		HashMap users=new HashMap(20);
		users.put("Tom",new User("Tom","123456"));
		users.put("Jerry",new User("Jerry","52we52"));
		users.put("Tomttt",new User("Mary","12wr4"));
		users.put("Tomtttt",new User("Mike","22g234"));
	
		Scanner console= new Scanner(System.in);
		String str;
		while(true){
			System.out.print("Plz input the username and password:");
			str=console.nextLine();
			if(str.matches("\\s*\\w{3,8}\\s+\\w{3,8}\\s*")){
				break;
			}
			System.out.println("Error!");
		}
		
		
		String[] data = str.trim().split("\\s+");
		String name=data[0];
		String pwd=data[1];
		if (users.containsKey(name)){
			User user=(User)users.get(name);
			if(user.pwd.equals(pwd)){
			System.out.println("Welcome ! (Loged in0 ");
			return;
			}
		}
		System.out.println("The username dosen't match the password!");
		}
	}

class User{
	String name;
	String pwd;
	public User(String name,String pwd){
		this.pwd=pwd;
		this.name=name;
	}
	


	

}
