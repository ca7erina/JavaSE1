package day03.map.playCards;
import java.util.*;

/*Class: Card*/
public class Player {
	
	protected static int index ;
	private  int id ;
	private  String name;
	private  List<Card> cards=new ArrayList<Card>();	
	
	/*Constructor*/	
	public Player(){		
	}
	public Player(int id,String name){	
		this.setId(id);
		this.setName(name);
	}

	/*getter & setter*/	
	public void setId(int id){
		if(id>8 || id<0){
			throw new RuntimeException("The value of id is out of range(0~8). ");
		}
		this.id=id;
	}
	public int getId(){
		return this.id;
	}
	public void setName(String name){
		if(name.length()>30 || name.length()<0){
			throw new RuntimeException("The length of name is out of range(0~30). ");
		}
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void setCards(ArrayList<Card> cards){
		this.cards=cards;
	}
	public List<Card> getCards(){
		return this.cards;
	}

	/*Overrides toString(),equals(),hashCode().*/
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
	
	/*Other methods:printPlayerCards()*/                                   	
	protected void printPlayersCards(){		
			System.out.println(" has "+cards.size()+"cards:"+this.cards);	
	}		 		
}
	
	
	
	
		
	


