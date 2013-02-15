package day02.regularExpression.Snake;
import java.util.*;

public class Snake {
	
	
	LinkedList<Node> body=new LinkedList<Node>();
	int dir;
	static final int TOUP=2;
	static final int TOLEFT=1;
	static final int TORIGHT=-1;
	static final int TODOWN=-2;
//	public Snake(){};
	
	public Snake(){
	 this.body.add(new Node(3,9));
	 this.body.add(new Node(4,9));
	 this.body.add(new Node(5,9));
	 this.body.add(new Node(5,10));
	 this.body.add(new Node(5,11));
	 this.body.add(new Node(6,11));
	 this.body.add(new Node(7,11));
	 this.dir=2;
	}
	private int getdir(){
	return this.dir;
	}
	private int getdir(LinkedList<Node> body){
		if( body.get(0).getI()==this.body.get(0).getI()&&body.get(0).getJ()>this.body.get(0).getJ()){
			return 1;
		}else if( body.get(0).getI()==this.body.get(0).getI()&&body.get(0).getJ()<this.body.get(0).getJ()){
			return 2;
		}else if( body.get(0).getI()>this.body.get(0).getI()&&body.get(0).getJ()==this.body.get(0).getJ()){
			return 3;
		}else if(body.get(0).getI()<this.body.get(0).getI()&&body.get(0).getJ()==this.body.get(0).getJ()){
		    return 0;
		}
		return -1;
	}
	private void setdir(int dir){
		this.dir=dir;
	}
	private LinkedList<Node> getbody(){
		return this.body;
	}
	private void setbody(LinkedList<Node> body){
		this.body=body;
	}
	
	 protected void go(int todir){
		 if (this.getdir()==0-todir){
			 System.out.print("!!!!!!Can't go back !!");
		 }
		 int i=this.body.get(0).getI();
		 int j=this.body.get(0).getJ();
		 switch(todir){
		 
			 case TOLEFT:
				 this.body.addFirst(new Node(i,j-1));
				 this.body.removeLast();				 
				 break;		 
			 case -1:
				 this.body.addFirst(new Node(i,j+1));
				 this.body.removeLast();
				 break;
			 case TOUP:
				 this.body.addFirst(new Node(i-1,j));
				 this.body.removeLast();
				 break;
			 case TODOWN:
				 this.body.addFirst(new Node(i+1,j));
				 this.body.removeLast();
				 break;
			default:
				System.out.println("the value of dir is wrong");
				
				
		 }
		
		 
		 
	 }
	 protected void go(){
		 int i=this.body.get(0).getI();
		 int j=this.body.get(0).getJ();
		 this.body.addFirst(new Node(i-1,j));
		 this.body.removeLast();
	 }

	 public String toString(){
		 return this.dir+" "+this.body;
		 
	 }
	 
	 public int hashCode(){
		 int dirNum=this.dir;
		 
		 int bodyNum=0;
		 for (int i=0;i<this.body.size();i++){
			 bodyNum+=this.body.get(i).getI()*100+this.body.get(i).getJ();
			 
		 }
		 return dirNum*bodyNum;
	 }
	 
	 public boolean equals(Object o){
		 
		 boolean bodyIsSame=true;
		 if (o == this){
				return true;
			}
			if (o==null){
				return false;
			}
			if(o instanceof Snake){
				 Snake other=(Snake)o;
				 for(int i=0;i<other.body.size();i++){			
					 if (other.body.get(i)!=this.body.get(i)){
						 bodyIsSame=false;
						 break;
					 }
					 		 
				 }
				 return other.dir==this.dir && bodyIsSame ;
		 }
		 return false;
	 }
	 
	 public void run(){
		 
	 }
	 
	 
}		
