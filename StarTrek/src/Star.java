
public class Star implements IGame {

	private int row;
	private int col;
	public Star() {
		row=0;
		col=0;
	}
	public Star(int a, int b) {
		row=a;
		col=b;
	}
	public int getRow() {
	
		return row;
	}

	
	public int getCol() {
		return col;
	}

	
	public boolean isDestroyed() {
	
		return false;
	}
	public void setRow(int a) {
		row=a;
	}
	
	public void setCol(int a) {
		col=a;
	}
}
