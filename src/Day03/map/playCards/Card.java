package Day03.map.playCards;

public class Card implements  Poker{
	//private instance variable.
	private  int suit;
	private  int rank;
	
	//Constructors
	public Card(){
		
	}
	public Card(int suit ,int rank){
		setRank(rank);
		setSuit(suit);
	}

	//public setter and getter.
	public void setRank(int rank){
		if(rank<0||rank>14){			throw new RuntimeException("The value of rank is out of the range(0~14)."+rank);
		}
		this.rank=rank;
	}	
	public int getRank(){
		return this.rank;
	}	
	public void setSuit(int suit){
		if(suit<0||suit>4){//joker = 4;
			throw new RuntimeException("The value of suit is out of the range(0~3)."+suit);
		}
		this.suit=suit;
	}	
	public int getSuit(){
		return this.suit;
	}	 
		
	//Overrides toString(),equals(),hashCode().
	public String toString(){
		 return SUIT_NAMES[getSuit()]+RANK_NAMES[getRank()];
	 }
	public boolean equals(Object obj) {
		    if(obj==null)
		      return false;
		    if(this==obj)
		      return true;
		    if (obj instanceof Card) {
		    	Card other = (Card) obj;
		      return this.suit==other.suit&&this.rank==other.rank;
		    }
		    return false;
		  }
	public int hashCode(){
			return this.suit+1000+this.rank;
		}
		
}