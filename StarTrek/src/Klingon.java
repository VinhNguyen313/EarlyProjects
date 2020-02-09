
public class Klingon implements IGame {
	private int col;
	private int row;
	private boolean destroyed = false;
	
	public Klingon(int row, int col) {
		this.col=col;
		this.row=row;
		
	}
	public Klingon() {
		col=0;
		row=0;
	}
	public int getCol() {
		return col;
	}

	public int getRow() {
		return row;
	}

	
	public boolean isDestroyed() {
		return destroyed;
	}
	
	public void setStatus(boolean a) {
		destroyed = a;
	}
	
	public void setCol(int a) {
		col=a;
	}
	
	public void setRow(int a) {
		row=a;
	}
	
}
