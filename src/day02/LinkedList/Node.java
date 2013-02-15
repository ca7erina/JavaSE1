package day02.LinkedList;

public class Node {
	Object data;
	Node next;
	public Node(Object data){
		this.data=data;
	}
	
	public String toString(){
		return next==null?data.toString():data+" -> "+next ; 
	}
}
