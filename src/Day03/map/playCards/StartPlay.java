package day03.map.playCards;
import java.util.*;
public class StartPlay {
	public static void main(String[] args) {		
		List<Card> cards = new ArrayList<Card>();
		List<Player> players = new ArrayList<Player>();		
					
		players = GameProcess.setPlayers(players);
		System.out.println("Welcome to join Playing Cards :)  ");
		GameProcess.showPlayersName(players);
			
		cards = GameProcess.sortCards(cards);
		System.out.println(cards);
		
		cards = GameProcess.wash(cards);
		System.out.println(cards);
			
		players=GameProcess.deal(players,cards);
		GameProcess.handCards(players,cards);			
	}

}