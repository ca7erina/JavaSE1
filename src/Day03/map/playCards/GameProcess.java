package Day03.map.playCards;
import java.util.*;

public class GameProcess extends Card {
	
	List<Card> cards=new ArrayList<Card>();
	List<Player> players=new ArrayList<Player>();
	
	//Constructors:
	public GameProcess(){};
	
	//Method:sortCards(),wash(),deal(),setPlayers(),showPlayersName(),handCards()
	protected static List<Card> sortCards(List<Card> cards) {
		cards=new ArrayList<Card>(54);
		for (int rank=Card.THREE;rank<=Card.DEUCE;rank++){
			cards.add(new Card(Card.DIAMOND,rank));
			cards.add(new Card(Card.HEART, rank));
			cards.add(new Card(Card.CLUB, rank));
			cards.add(new Card(Card.SPADE, rank));
		}	
		cards.add(new Card(Card.JOKER,BLACK));
		cards.add(new Card(Card.JOKER,COLOR));
	
	    System.out.println("\nSetting up 54 cards for playing ................. done!");
	    return cards;
	}
	protected static List<Card> wash(List<Card> cards) {
		Collections.shuffle(cards);
	    System.out.println("\nWashing cards .....................done!"); 
	    return cards;
	}
	protected static List<Player> deal(List<Player> players, List<Card> cards) {
		System.out.println("\nDealing                                                                                                    Cards for Players.................. done!");
		int i=0;
		Iterator<Card> ite=cards.iterator();
		for(;ite.hasNext();){
			Card card=ite.next();
			Player someone=players.get(i++%players.size());
			someone.getCards().add(card); 
			ite.remove();
			if(cards.size()==3){
				break;
			}
		}
		return players;
	}
	protected static List<Player> setPlayers(List<Player> players) {
		Scanner console= new Scanner(System.in);
		System.out.print("Please how many players this game gonna set up for? -> ");	
		//Player[] players=new Player[console.nextInt()];
		int length=console.nextInt();
		System.out.print("Input their name follow the instruction one by one .....\n");	
		for (int id=0;id<length;id++){
			Scanner consol= new Scanner(System.in);
			System.out.print("Player No."+(id+1)+ " is : ");
			String name =consol.nextLine();		
			players.add(id,new Player(id,name));	
			Player.index++;
		}
		System.out.println("Saving players'names..................done!");
		System.out.println("Initializing...\n\n");
		
		return players;
		
	}
	protected static void showPlayersName(List<Player> players){
		List<String> playsNames=new ArrayList<String>(0);
		for (int i=0;i<players.size();i++){
			playsNames.add(i, players.get(i).getName());
		}
		
		System.out.println(playsNames);
	}
	protected static void handCards(List<Player> players,List<Card> cards) {
		System.out.println("\nUnderground Cards : "+cards);
		for (int i=0;i<players.size();i++){
		System.out.print(players.get(i).getName()+ " ");
		players.get(i).printPlayersCards();
		}

    }

	// Overrides toString(),equals(),hashCode().	
//	String toString();
//	boolean equals(Object obj);
//	int hashCode();
}

