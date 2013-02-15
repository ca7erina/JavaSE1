package day02.regularExpression.Snake;
import java.util.*;
public class Play {

	public static void main(String[] args) {
		
		 PlayGround pane = new PlayGround();
		    //pane.print();
		    //Worm worm = new Worm();
		    Snake snake = pane.getSnake();
		    //worm.step();
		   // pane.print();
		    Scanner in = new Scanner(System.in);
		    while(true){
		      pane.print();
		      System.out.println(snake);
		      String cmd = in.nextLine();
		      if(cmd.equalsIgnoreCase("u")){
		        snake.go(Snake.TOUP);
		      }else if(cmd.equalsIgnoreCase("d")){
		    	  snake.go(Snake.TODOWN);
		      }else if(cmd.equalsIgnoreCase("r")){
		    	  snake.go(Snake.TORIGHT);
		      }else if(cmd.equalsIgnoreCase("l")){
		    	  snake.go(Snake.TOLEFT);
		      }else if(cmd.equalsIgnoreCase("q")){
		        System.out.println("bye!");
		      }else{
		        snake.go();
		      }
		      
		    }
		    
		  }

		  }


