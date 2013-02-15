package day02.assignments.arrayList;
import java.util.*;

public class GameProcess extends Card {
	
	ArrayList<Card> cards=new ArrayList<Card>();
	ArrayList<Player> players=new ArrayList<Player>();
	
	public GameProcess(){};
	
	
	public static ArrayList<Card> sortCards(ArrayList<Card> cards) {
		for (int rank=Card.THREE;rank<=Card.DEUCE;rank++){
			cards.add(new Card(DIAMOND,rank));
			cards.add(new Card(HEART, rank));
			cards.add(new Card(CLUB, rank));
			cards.add(new Card(SPADE, rank));
		}	
		cards.add(new Card(JOKER,BLACK));
		cards.add(new Card(JOKER,COLOR));
	
	    System.out.println("\nSetting up 54 cards for playing ................. done!");
	    return cards;
	}
	
	protected static ArrayList<Card> wash(ArrayList<Card> cards) {
		Random random = new Random();
	    for(int i= cards.size(); i>0; i--){
	      int j = random.nextInt(i);
	      Card temp=cards.get((cards.size()-i));
	      cards.set((cards.size()-i), cards.get(j));
	      cards.set(j, temp);
	    }
	    System.out.println("\nWashing cards .....................done!"); 
	    return cards;
	}
	protected static ArrayList<Player> setPlayers(ArrayList<Player> players) {
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
	protected static void showPlayersName(ArrayList<Player> players){
		ArrayList<String> playsNames=new ArrayList<String>(0);
		for (int i=0;i<players.size();i++){
			playsNames.add(i, players.get(i).getName());
		}
		
		System.out.println(playsNames);
	}


	protected static ArrayList<Player> deal(ArrayList<Player> players, ArrayList<Card> cards) {
		System.out.println("\nDealing Cards for Players.................. done!");
		for (int i=0;i<=cards.size()-1;i++){				
		players.get(i%players.size()).cards.add(cards.get(i));			
		}
		return players;
	}
	
	protected static void handCards(ArrayList<Player> players) {
		for (int i=0;i<players.size();i++){
		System.out.print(players.get(i).showMyname()+ " ");
		players.get(i).showCards();
		}

    }

	
}

