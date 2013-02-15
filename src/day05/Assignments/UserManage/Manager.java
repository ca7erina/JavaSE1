package day05.Assignments.UserManage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.management.RuntimeErrorException;

public class Manager {

	private Map<String, People> users = new HashMap<String, People>();

	// Collection<People> value = users.values();
	// Set<String> keySet = users.keySet();
	// Set<Entry<String,People>> entrySet=users.entrySet();
	// List<Entry<String,People>> list=new
	// ArrayList<Entry<String,People>>(entrySet);
	People p = new People();

	private int id = 1;

	Scanner console = new Scanner(System.in);

	public Map<String,People> reg(){
		Scanner console = new Scanner(System.in);
		String str;
		try{
			for(int i=0;i<3;i++){
				System.out.print("Plz input a valid email and password to finish the regisration");
				str=console.nextLine();
			
				if(str.matches("\\w{4,8}@\\w{3,5}.com\\s+\\w{8,12}")){
					String[] data = str.trim().split("\\s+");
					
					People p=new People();
					p.setEmail(data[0]);
					p.setID(id++);
					p.setPwd(data[1]);
					users.put(p.getEmail(), p);
					
					break;
				}
				
			}
		}catch(NullPointerException e){
				e.printStackTrace();
		}return users;
	
	}

	public void login() {
		Scanner console = new Scanner(System.in);
		System.out.print("Plz input the email and password:");
		String str = console.nextLine();
		if (!str.matches("\\s*\\w{12,30}\\s+\\w{3,8}\\s*")) {
			throw new RuntimeException(" datagather: invalid data!");

		}

		String[] data = str.trim().split("\\s+");
		String email = data[0];
		String pwd = data[1];

		if (users.containsKey(email)) {
			People p = (People) users.get(email);
			if (p.getPwd().equals(pwd)) {
				System.out.println("Welcome ! (Logging in... ");
				return;
			}
		}
		System.out.println("The username dosen't match the password!");
	}

}
