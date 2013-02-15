
package day02.assignments.arrayList;
import java.util.ArrayList;





public class Player {
	protected  static int index ;
	protected  int id ;
	protected  String name;
	protected  ArrayList<Card> cards=new ArrayList<Card>();
	
	
	public Player(){		
	}
	 public  Player(int id,String name){	
		this.setId(id);
		this.setName(name);
	}

	
	private void setId(int id){
		if(id>8 || id<0){
			throw new RuntimeException("The value of id is out of range(0~8). ");
		}
		this.id=id;
	}
	protected int getId(){
		return this.id;
	}
	protected void setName(String name){
		if(name.length()>30 || name.length()<0){
			throw new RuntimeException("The value of name is out of range(0~30). ");
		}
		this.name=name;
	}
	protected String getName(){
		return this.name;
	}

	protected void setCards(ArrayList<Card> cards){
		this.cards=cards;
	}
	protected ArrayList<Card> getCards(){
		return this.cards;
	}
		
	protected String getPlayer(){
		return " "+getId()+" "+getName()+" "+this.cards;
	}
	                                    
	public String showMyname(){
		return this.getName();
	}
	
	protected int showMyID(){
		return this.getId();
	}	
	
	protected  void showCards(){		
			System.out.println(" has "+cards.size()+"cards:"+this.cards);
	

	}
	public String toString(){
		return this.name+" has "+cards.size()+"cards:"+this.cards;
	}
	public boolean equals(Object obj) {
	    if(obj==null)
	      return false;
	    if(this==obj)
	      return true;
	    if (obj instanceof Player) {
	    	Player other = (Player) obj;
	    	return this.id==other.id;
	    }
	    return false;
	  }
	public int hashCode(){
		return id;
	}
}
	
	
	
	
		
	


