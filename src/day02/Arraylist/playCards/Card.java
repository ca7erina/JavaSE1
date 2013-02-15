package day02.Arraylist.playCards;


//import java.util.Arrays;
//import java.util.Random;

public class Card implements  Poker{
	private  int suit;
	private  int rank;
	
	public Card(){
		
	}
	public Card(int suit ,int rank){
		setRank(rank);
		setSuit(suit);
	}

	private void setRank(int rank){
		if(rank<0||rank>14){
			throw new RuntimeException("The value of rank is out of the range(0~14)."+rank);
		}
		this.rank=rank;
	}
	
	private int getRank(){
		return this.rank;
	}
	
	private void setSuit(int suit){
		if(suit<0||suit>4){//joker = 4;
			throw new RuntimeException("The value of suit is out of the range(0~3)."+suit);
		}
		this.suit=suit;
	}	
	private int getSuit(){
		return this.suit;
	}

	 
	 protected String setCard(int suit ,int rank){
			this.setSuit(suit);
			this.setRank(rank);
		return this.toString() ;
	}	
	
	 protected String getCard(){
		 return this.toString() ;
	}	
	
	 
	 public String toString(){
		 return SUIT_NAMES[getSuit()]+RANK_NAMES[getRank()];
	 }
	 public int hashCode(){
		 return suit*100+rank;
	 }
	 public boolean equals(Object obj ){
		 if (obj==null){
			 return false;
		 }
		 if(obj ==this){
			 return true;
		 }
		 if(obj instanceof Card){
			 Card other=(Card)obj;
			 return other.suit==this.suit&&other.rank==this.rank;
		 }
		 return false;
	 }
}
