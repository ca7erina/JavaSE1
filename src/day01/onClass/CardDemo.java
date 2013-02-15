package day01.onClass;

public class CardDemo {
  public static void main(String[] args) {
    Card card = new Card(Card.SPADE, Card.ACE);
    Card ace = new Card(Card.SPADE, Card.ACE);
    System.out.println(card.equals(ace));//true

    System.out.println(card.hashCode());
    System.out.println(ace.hashCode());
    
    String s1 = new String("abc");
    String s2 = new String("abc");
    String s3 = new String("abd");
    System.out.println(s1==s2);//false
    System.out.println(s1.equals(s2));//true
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    System.out.println(s3.hashCode());
  }

}
