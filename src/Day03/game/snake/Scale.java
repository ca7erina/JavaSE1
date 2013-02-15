package Day03.game.snake;

public class Scale {
	private int j;

	private int i;

	public Scale() {
		setI(20);
		setJ(40);
	}

	public Scale(int i, int j) {
		setI(i);
		setJ(j);
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j)  {
		this.j = j;
	}
	
	public String toString(){
		return "("+i+","+j+")";
	}

}
