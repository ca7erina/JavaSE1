package day02.Arraylist.playCards;

public class StartPlay {
	public static void main(String[] args) {


		
			Card[] cards=new Card[54];
			Player[] players=new Player[]{};
			
		
			
			players=GameProcess.setPlayers(players);
			System.out.println("Welcome to join Playing Cards :)  ");
			GameProcess.showPlayersName(players);
			
			cards = GameProcess.sortCards() ;
			GameProcess.showCards(cards);
			
			
			cards = GameProcess.wash(cards);
			GameProcess.showCards(cards);
			
			players=GameProcess.deal(players,cards);
			GameProcess.handCards(players);
			

	}

}