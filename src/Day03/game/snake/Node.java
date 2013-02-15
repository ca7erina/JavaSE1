package day03.game.snake;

public class Node {
	private int i;

	private int j;

	/**
	 * Nodes Constructors
	 */
	public Node() {
	};

	public Node(int i, int j) {
		try {
			this.setI(i);
			this.setJ(j);
		} catch (NullPointerException e) {
			System.out
					.println("Sorry ,fail to set i or j in value of the node."
							+ i + " " + j);
			e.printStackTrace();
		} catch (Exception e) {

		}
	}

	// Method:get(),set()
	protected void setI(int i)throws RuntimeException{
		if( i<0){
			throw new RuntimeException("Error snake.i<0! ");
		}
		this.i = i;
	}

	protected int getI() {
		return this.i;
	}

	protected void setJ(int j) throws RuntimeException {
		if( j<0){
			throw new RuntimeException("Error snake.i<0! ");
		}
		this.j = j;
	}

	protected int getJ() {
		return this.j;
	}

	// Override: toString(),hashcode(),equals()
	public String toString() {
		return "(" + i + "," + j + ")";
	}

	public int hashCode() {
		return this.i * 10000 + j;
	}

	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (o == null) {
			return false;
		}
		if (o instanceof Node) {
			Node other = (Node) o;
			return (this.getI() == other.getI())
					&& (this.getJ() == other.getJ());
		}
		return false;
	}

}
