
public class Mine implements IGame {
	private int row;
	private int col;
	private boolean destroyed = false;
	
	public boolean isDestroyed() {
		return destroyed;
	}
	
	public void setStatus(boolean a) {
		destroyed = a;
	}
	public Mine(int a, int b) {
		row=a;
		col=b;
	}
	public Mine() {
		row=0;
		col=0;
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

	public void setRow(int a) {
		row=a;
	}
	
	public void setCol(int a) {
		col=a;
	}
}
