package day01.playcards;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GameProcess extends Card {
	
	 Card[] cards=new Card[]{};
	 Player[] players=new Player[]{};
	
	public GameProcess(){};
	
	protected  static Card[] sortCards() {
		Card[] cards=new Card[54];
		int i=0;
		for (int rank=Card.THREE;rank<=Card.DEUCE;rank++){
			
			cards[i++]=new Card(Card.DIAMOND,rank);
			cards[i++]=new Card(Card.HEART, rank);
		   cards[i++]=new Card(Card.CLUB, rank);
		   cards[i++]=new Card(Card.SPADE, rank);
		}		
	    cards[i++]=new Card(Card.JOKER, Card.BLACK);
	    cards[i++]=new Card(Card.JOKER, Card.COLOR);
	    System.out.println("\nSetting up 54 cards for playing ................. done!");
	    return cards;
	}
	
	protected static Card[] wash(Card[] cards) {
		Random random = new Random();
	    for(int i=cards.length-1; i>0; i--){
	      int j = random.nextInt(i);
	      Card t = cards[i];
	      cards[i] = cards[j];
	      cards[j] = t;
	    }
	    System.out.println("\nWashing cards .....................done!"); 
	    return cards;
	}
	protected static Player[] setPlayers(Player[] players) {
		Scanner console= new Scanner(System.in);
		System.out.print("Please how many players this game gonna set up for? -> ");	
		//Player[] players=new Player[console.nextInt()];
		int number=console.nextInt();
		System.out.print("Input their name follow the instruction one by one .....\n");	
		for (int id=0;id<number;id++){
			Scanner consol= new Scanner(System.in);
			System.out.print("Player No."+(id+1)+ " is : ");
			String name =consol.next();
			players=Arrays.copyOf(players, players.length+1);
			players[id]=new Player(id, name);	
			players[id].id++;
			
		}
		System.out.println("Saving players'names..................done!");
		System.out.println("Initializing...\n\n");
		
		return players;
		
	}
//	protected static void showPlayersName(Player[] players){	
//		String[] playerNames= new String[]{};
//		for(int i=0;i<players.length;i++){
//			playerNames=Arrays.copyOf(playerNames, playerNames.length+1);
//			playerNames[playerNames.length-1]=players[i].showMyname();
//		}
//			System.out.println(Arrays.toString(playerNames));
//				
//	}
	protected  static void showPlayersName(Player[] players){
		System.out.print("");
		for(int i=0;i<players.length;i++){
			System.out.print(players[i].getPlayer());
		}
	}

	protected static Player[] deal(Player[] players, Card[] cards) {
		System.out.println("\nDealing Cards for Players.................. done!");
		for (int i=0;i<=cards.length-1;i++){				
		players[i%players.length].addCards(cards[i]);			
		}
		return players;
	}
	
	protected static void handCards(Player[] players) {
		for (int i=0;i<players.length;i++){
		System.out.print(players[i].showMyname()+ " ");
		players[i].showCards();
		}

    }
	protected static void showCards(Card[] cards){	
		String[] stringCards= new String[]{};
		int i=0;
		for( i=0;i<=cards.length-3;i++){
			stringCards=Arrays.copyOf(stringCards,stringCards.length+1);
			stringCards[stringCards.length-1]=cards[i].toString() ;
		}
		stringCards=Arrays.copyOf(stringCards,stringCards.length+1);
		stringCards[stringCards.length-1]=cards[i++].toString() ;
		stringCards=Arrays.copyOf(stringCards,stringCards.length+1);
		stringCards[stringCards.length-1]=cards[i++].toString() ;
		
			System.out.println(" "+stringCards.length+" cards: "+Arrays.toString(stringCards));	
	}
	
}

