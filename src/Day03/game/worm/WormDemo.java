package day03.game.worm;

import java.util.Scanner;


public class WormDemo {
  public static void main(String[] args) {
    WormPanel pane = new WormPanel();
    //pane.print();
    //Worm worm = new Worm();
    Worm worm = pane.getWorm();
    //worm.step();
   // pane.print();
    Scanner in = new Scanner(System.in);
    while(true){
      pane.print();
      System.out.println(worm);
      String cmd = in.nextLine();
      if(cmd.equalsIgnoreCase("u")){
        worm.step(Worm.UP);
      }else if(cmd.equalsIgnoreCase("d")){
        worm.step(Worm.DOWN);
      }else if(cmd.equalsIgnoreCase("r")){
        worm.step(Worm.RIGHT);
      }else if(cmd.equalsIgnoreCase("l")){
        worm.step(Worm.LEFT);
      }else if(cmd.equalsIgnoreCase("q")){
        System.out.println("��, bye!");
      }else{
        worm.step();
      }
      
    }
    
  }

}
