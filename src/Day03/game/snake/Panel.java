package day03.game.snake;

import java.util.*;

public class Panel {
	private Snake snake = new Snake();

	private List<Node> edges;

	private Scale scale = new Scale();

	private Set<Node> eggs = new HashSet<Node>();

	// Constructor
	public Panel() {
		scale = new Scale();
		// setEdges();
		setEggs();
		setSnake();
	}

	// getters and setters;
	protected void setScale(int i, int j) {
		scale = new Scale(i, j);
	}

	protected Scale getScale() {
		return this.scale;
	}

	// protected void setEdges() {
	// try {
	// List<Node> edges = new ArrayList<Node>();
	// for (int i = 0; i < scale.getI(); i++) {
	// for (int j = 0; j < scale.getJ(); j++) {
	// if ((i == 0 && j != 0 && j != scale.getJ() - 1)
	// || (i == scale.getI() - 1 && j != 0 && j != scale
	// .getJ() - 1)) {
	// edges.add(new Node(i, j));
	// } else if ((j == 0 && i != 0 && i != scale.getI() - 1)
	// || (i != 0 && i != scale.getI() - 1 && j == scale
	// .getJ() - 1)) {
	// edges.add(new Node(i, j));
	// } else if (snake.body.contains(new Node(i, j))) {
	// continue;
	// }
	// }
	// }
	// } catch (Exception e) {
	// System.out.println("Failed to print the panel....");
	// e.printStackTrace();
	// }
	// }

	protected List<Node> getEdges() {
		return this.edges;
	}

	protected void setSnake() {
		Snake snake = new Snake();
		this.snake=snake.setSnake();
	}

	protected Snake getSnake() {
		return this.snake;
	}

	final protected void setEggs() {

		try {
			for (;;) {
				Random rand = new Random();

				Node egg = new Node(rand.nextInt(scale.getI()), rand
						.nextInt(scale.getJ()));
				if ((egg.getI() == scale.getI() - 1 || egg.getI() == 0)
						&& (egg.getJ() == scale.getJ() - 1 || egg.getJ() == 0)) {

					continue;
				} else if (this.snake.body.contains(egg)) {

					continue;
				} else
					this.eggs.add(egg);
				if (eggs.size() == 30) {
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(" Sorry ,Set eggs x,y failed" + scale.getI());

		}

	}

	protected Set<Node> getEggs() {
		return this.eggs;
	}

	// Method: printPanel()
	public void printPanel() {
		try {
			for (int i = 0; i < scale.getI(); i++) {
				for (int j = 0; j < scale.getJ(); j++) {
					if ((i == 0 && j != 0 && j != scale.getJ() - 1)
							|| (i == scale.getI() - 1 && j != 0 && j != scale
									.getJ() - 1)) {
						System.out.print("-");
					} else if ((j == 0 && i != 0 && i != scale.getI() - 1)
							|| (i != 0 && i != scale.getI() - 1 && j == scale
									.getJ() - 1)) {
						System.out.print("|");
					} else if (snake.body.contains(new Node(i, j))) {
						if (i <= 0 || j <= 0) {
							throw new RuntimeException(
									"fail to print the snake ,i or j < 0.");
						}
						System.out.print("☢");
					} else if (eggs.contains(new Node(i, j))) {

						System.out.print("♥");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed to print the egg, panel and snake.");
		}
	}

	// Internal Class
	// -------------------------------Snake----------------------------
	public class Snake {
		// instance variable:
		public static final int TOUP = -10;

		public static final int TODOWN = 10;

		public static final int TOLEFT = -1;

		public static final int TORIGHT = 1;

		private LinkedList<Node> body = new LinkedList<Node>();;

		private int dir;

		// constructor
		public Snake() {
		}

		// getters and setters
		public void setdir(int dir) throws RuntimeException {

			if (dir != -10 && dir != 10 && dir != 1 && dir != -1) {
				throw new RuntimeException("Set dir failed ,invalid dir! ");
			}

			this.dir = dir;

		}

		public int getdir() {
			return this.dir;
		}

		public void setbody(LinkedList<Node> body) {
			this.body = body;
		}

		public List<Node> getbody() {
			return this.body;
		}

		// Snake's method: setSnake(),calcuSnakedir(),go()
		protected Snake setSnake() {
			Snake snake = new Snake();
			snake.body.add(new Node(3, 9));
			snake.body.add(new Node(4, 9));
			snake.body.add(new Node(5, 9));
			snake.body.add(new Node(5, 10));
			snake.body.add(new Node(5, 11));
			snake.body.add(new Node(6, 11));
			snake.body.add(new Node(7, 11));
			snake.setdir(Snake.TOUP);
			return snake;
		}

		/**
		 * Calculate the direction of the present snake.
		 * 
		 * @param snake
		 * @return snake's dir
		 */
		protected int calcuSnakedir(Snake snake) {
			int i0 = snake.body.get(0).getI();
			int i1 = snake.body.get(1).getI();
			int j0 = snake.body.get(0).getJ();
			int j1 = snake.body.get(1).getJ();
			if (i0 == i1 && j0 > j1) {
				snake.dir = TORIGHT;
				return TORIGHT;
			} else if (i0 == i1 && j0 < j1) {
				snake.dir = TOLEFT;
				return TOLEFT;
			} else if (j0 == j1 && i0 < i1) {
				snake.dir = TOUP;
				return TOUP;
			} else if (j0 == j1 && i0 > i1) {
				snake.dir = TODOWN;
				return TODOWN;
			}
			return 0;
		}

		protected void go(int dir) throws RuntimeException {
			if (dir == TOUP || dir == TOLEFT || dir == TORIGHT || dir == TODOWN) {
				if (dir + this.dir == 0) {
					System.out.println(" snake:" + this.dir + "  input dir:"
							+ dir);
					throw new RuntimeException("Can't go back!!!");
				}
				if (-this.body.get(0).getI() == dir / 10
						|| -this.body.get(0).getJ() == dir % 10) {
					throw new RuntimeException("Hit the wall,Gave Over");
				}				
				int i = this.body.get(0).getI() + dir / 10;
				int j = this.body.get(0).getJ() + dir % 10;
				Node node = new Node(i, j);
				if (this.body.get(0).getI() > 1 && this.body.get(0).getI() < 20&&this.body.get(0).getJ() > 1&&this.body.get(0).getJ() < 40) {
					this.body.addFirst(node);
					if (!eggs.contains(node)) {
						this.body.removeLast();
					} else {
						eggs.remove(node);
					}
				} else {
					throw new RuntimeException("Hit the wall,Gave Over");
				}

			} else {
				throw new RuntimeException("Go.dir is invalid!!");
			}
			
		}

		// Override toString(),hashCode(),equals() by Snake
		public String toString() {
			return "Length " + this.body.size() + " " + this.body;
		}

		public int hashCode() {
			int dirNum = this.dir;
			int bodyNum = 0;
			for (int i = 0; i < this.body.size(); i++) {
				bodyNum += this.body.get(i).getI() * 100
						+ this.body.get(i).getJ();
			}
			return dirNum * 10000 + bodyNum;
		}

		public boolean equals(Object o) {
			if (o == this) {
				return true;
			}
			if (o == null) {
				return false;
			}
			if (o instanceof Snake) {
				Snake other = (Snake) o;
				if (snake.body.size() == other.body.size()) {
					for (int i = 0; i < other.body.size(); i++) {
						if (other.body.get(i) != this.body.get(i)) {
							return false;
						}
					}
				}
			}
			return true;
		}

	}

}
