package day02.assignments.arrayList;
import java.util.*;
public interface Poker {
	
	int DIAMOND=0;
	int CLUB=1;	
	int HEART=2;	
	int SPADE=3;
    int JOKER=4;

	int THREE=0;
	int FOUR=1;
	int FIVE=2;
	int SEX=3;
	int SEVEN=4;
	int EIGHT=5;
	int NINE=6;
	int TEN=7;
	int JAKE=8;
	int QUEEN=9;
	int KING=10;
	int ACE=11;
	int DEUCE=12;
	int BLACK=13; 
	int COLOR=14;
	
	ArrayList<Card> cards=new ArrayList<Card>();
	
	String[] RANK_NAMES={ "3", "4", "5", "6", "7", "8","9", "10", "J", "Q", "K", "A", "2", " ", "☻"};
	String[] SUIT_NAMES={"♦","♣","♥","♠","☻"};//♠9824 ♣9827 ♥ 9829 ♦ 9830 
	
	String toString();
	boolean equals(Object obj);
	int hashCode();
	
	
}
