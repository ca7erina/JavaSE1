package day05.Assignments.UserManage;


public class People {
	public static int index;
	private int id;
	private String email;
	private String pwd;
	
	public People(){}
	public People(int id,String pwd){
		setID(id);
		setPwd(pwd);
	}
	public People(String email,String pwd){
		setEmail(email);
		setPwd(pwd);		
	}
	public People(int id,String pwd,String email){
		setID(id);
		setPwd(pwd);
		setEmail(email);
	}
	
	public void setID(int id){
		
		if(id<0||id ==People.index){
			throw new RuntimeException("Fail !ID is invalid!!");
		}
		
		this.id=id;
	}
	public int getID(){
		return this.id;
	}
	
	public void setEmail(String email){
		if( email.matches("\\w*@\\w*.com\\w*")){
			throw new RuntimeException("Fail !Email is invalid!!");
		}
		this.email=email;
	}
	public String getEmail(){
		return this.email;
	}
	public void setPwd(String pwd){
		if(pwd.matches("\\w*8")){
			throw new RuntimeException("Fail !Password is invalid!!");
		}
		this.pwd=pwd;
	}
	public String getPwd(){
		return this.pwd;
	}
	
	public String toString(){
		return id+","+email;
	}
	public boolean equals(Object o){
		if (o==this){
			return true;
		}
		if (o==null){
			return false;
		}
		if(o instanceof People){
			People other=(People)o;
			return (this.getID()==other.getID());
		}
		return false;
	}
	public int hashCode(){
		return this.getID();
	}




}
