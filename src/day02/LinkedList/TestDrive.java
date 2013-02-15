package day02.LinkedList;
import java.util.*;
public class TestDrive {

	public static void main(String[] args) {
		Node head=new Node("91210");
		head.next=new Node("Poker Face");
		head.next.next=new Node("Picture to burn");
		head.next.next.next=new Node("On to the next One");
		System.out.println(head);
		
		LinkedList llist=new LinkedList();
		llist.add("91210");
		llist.add("Poker Face");
		llist.add("Picture to burn");
		llist.add("On to the next One");
		
		System.out.println(llist);
	}

}
