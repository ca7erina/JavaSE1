package day03.game.snake;

import java.util.*;
import day03.game.snake.Panel.Snake;

public class Play {
	public static void main(String[] args) {
		try {
			Panel panel = new Panel();
			panel.setScale(20, 40);
			Operate(panel);

		} catch (NullPointerException e) {
			System.out.println("Sorry ,something bad happened have to quit .");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Sorry ,something bad happened have to quit .");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("Sorry ,something bad happened have to quit .");
			e.printStackTrace();
		} catch (ClassCastException e) {
			System.out.println("Sorry ,something bad happened have to quit .");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Sorry ,something bad happened have to quit .");
			e.printStackTrace();
		}

	}

	public static void Operate(Panel panel) {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out
					.println("\nControl the direction with keyboard: \"w\"->up,\"a\"->right,\"s\"->down,\"d\"->right");
			panel.printPanel();

			System.out.println(panel.getSnake());
			System.out.println("Eggs " + panel.getEggs().size() + " "
					+ panel.getEggs());
			String cmd = in.nextLine();
			try {
				if (cmd.equalsIgnoreCase("w")) {
					panel.getSnake().go(Snake.TOUP);
				} else if (cmd.equalsIgnoreCase("s")) {
					panel.getSnake().go(Snake.TODOWN);
				} else if (cmd.equalsIgnoreCase("d")) {
					panel.getSnake().go(Snake.TORIGHT);
				} else if (cmd.equalsIgnoreCase("a")) {
					panel.getSnake().go(Snake.TOLEFT);
				} else if (cmd.equalsIgnoreCase("q")) {
					System.out.println("bye!");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
