package day01.onClass;

import java.util.Arrays;

public class Player {
  private int id;
  private String name;
  private Card[] cards={};
  
  public Player() {
  }
  public Player(int id, String name) {
    this.id = id;
    this.name = name;
  }
  
  public void add(Card card){
    this.cards = Arrays.copyOf(cards, cards.length+1);
    cards[cards.length-1] = card;
  }
  
  public Card[] getCards() {
    return cards;
  }
  public void setCards(Card[] cards) {
    this.cards = cards;
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String toString() {
    return id+" "+ name + Arrays.toString(cards); 
  }
 
  public boolean equals(Object obj) {
    if(obj==null){
      return false;
    }
    if(this==obj){
      return true;
    }
    if(obj instanceof Player){
      Player other = (Player)obj;
      return this.id == other.id;
    }
    return false;
  }
 
  public int hashCode() {
    return id;
  }
}
