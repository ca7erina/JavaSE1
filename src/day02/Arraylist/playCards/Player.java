
package day02.Arraylist.playCards;
import java.util.Arrays;




public class Player {
	
	protected   int id ;
	protected String name;
	protected  Card[] cards=new Card[]{};
	
	
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
	private int getId(){
		return this.id;
	}
	private void setName(String name){
		if(name.length()>30 || name.length()<0){
			throw new RuntimeException("The value of name is out of range(0~30). ");
		}
		this.name=name;
	}
	private String getName(){
		return this.name;
	}
	protected void setCards(Card[] cards){
		this.cards=cards;
	}
	
	protected Card[] getCards(){
		return this.cards;
	}
	
	protected void addCards(Card card){
		this.cards=Arrays.copyOf(this.cards,this.cards.length+1);
		this.cards[cards.length-1]=card;	
	}
	
	protected String getPlayer(){
		return " "+getId()+" "+getName()+" "+Arrays.toString(this.cards);
	}
	                                    
	public String showMyname(){
		return this.getName();
	}
	protected int showMyID(){
		return this.getId();
	}
	
	public boolean equals(Object obj){
		if (obj==null){
			return false;
		}
		if (obj==this){
			return true;
		}
		if(obj instanceof Player){
			Player other = (Player)obj;
			return this.id==other.id;
		}
		return false;
	}
	public int hashcode(){
		return this.id;
	}
	
	protected  void showCards(){	
		String[] stringCards= new String[]{};
		int i=0;
		for( i=0;i<=this.cards.length-3;i++){
			stringCards=Arrays.copyOf(stringCards,stringCards.length+1);
			stringCards[stringCards.length-1]=this.cards[i].toString() ;
		}
		stringCards=Arrays.copyOf(stringCards,stringCards.length+1);
		stringCards[stringCards.length-1]=this.cards[i++].toString() ;
		stringCards=Arrays.copyOf(stringCards,stringCards.length+1);
		stringCards[stringCards.length-1]=this.cards[i++].toString() ;
		
			System.out.println(" has "+stringCards.length+"cards:"+Arrays.toString(stringCards));
	
		
	}


		
	}
	
	
	
	
		
	


