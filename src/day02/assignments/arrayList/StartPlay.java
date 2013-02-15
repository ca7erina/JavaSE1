package day02.assignments.arrayList;
import java.util.ArrayList;
public class StartPlay {
	public static void main(String[] args) {

		
			ArrayList<Card> cards=new ArrayList<Card>();
			ArrayList<Player> players=new ArrayList<Player>();
			
		
			
			players=GameProcess.setPlayers(players);
			System.out.println("Welcome to join Playing Cards :)  ");
			GameProcess.showPlayersName(players);
			
			 cards=GameProcess.sortCards(cards);
			System.out.println(cards);
			
	
			
			cards = GameProcess.wash(cards);
			System.out.println(cards);
			
			players=GameProcess.deal(players,cards);
			GameProcess.handCards(players);
			
	

	}

}