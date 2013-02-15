package day02.regularExpression.Snake;

public class Node {
	private int i;
	private int j;
	
	public Node(){};
	public Node (int i,int j){
		this.setI(i);
		this.setJ(j);
	}
	protected int getI(){		
		return this.i ;
	}
		
	protected void setI(int i){
		this.i=i;
	}
	private void setJ(int j){
		this.j=j;
	}
	protected int getJ(){
		return this.j;
	}
	
	public String toString(){

//		for(int i=0;i<this.i-1;i++){
//			System.out.println("");
//		}
//		for(int j=0;i<this.j-1;j++){
//			System.out.println(" ");
//		}
//		System.out.println("@");
		
		return "("+i+","+j+")";
	}
	
	public int hashCode(){
		return this.i*10000+j;
		
	}
	public boolean equals(Object o){
		if (o == this){
			return true;
		}
		if (o==null){
			return false;
		}
		if(o instanceof Node){
			Node other=(Node)o;
			return this.i==other.i&&this.j==other.j;
		}
		return false;
	}
	
	
	
	
}	
