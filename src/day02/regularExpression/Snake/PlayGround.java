package day02.regularExpression.Snake;
import java.util.*;
public class PlayGround {
	private Snake snake;
	  
	  private int rows = 15;//����
	  private int cols = 40;//����
	  
	 
	  public PlayGround() {
	    snake = new Snake();
	 
	  }
	  
	  public Snake getSnake() {
	    return snake;
	  }
	  
	
	  public void print(){
	    for(int i=0; i<rows; i++){
	      for(int j=0;j<cols; j++){
	        if(i==0 || i==rows-1){
	          System.out.print("-");//�����س�!
	        }else if(j==0 || j==cols-1){
	          System.out.print("|"); 
	        }else if(snake.body.contains(new Node(i,j))){
		          System.out.print("@");
	        }else{
	          System.out.print(" ");
	        }
	      }
	      System.out.println();
	    }
	  }
}
