
public class Enterprise implements IMobile, IGame {
	private int col;
	private int row;
	private boolean status = false;

	public Enterprise() {
		row = 0;
		col = 0;
	}

	public Enterprise(int row, int col) {
		this.row = row;
		this.col = col;

	}

	public void move(String a) {
		int roworig = row;
		int colorig = col;
		switch (a.toUpperCase()) {
		case "NE":
			row = row - 1;
			col = col + 1;
			break;
		case "N":
			row = row - 1;
			break;
		case "S":
			row = row + 1;
			break;
		case "NW":
			col = col - 1;
			row = row - 1;
			break;
		case "SE":
			col = col + 1;
			row = row + 1;
			break;
		case "SW":
			col = col - 1;
			row = row + 1;
			break;
		case "E":
			col = col + 1;
			break;
		case "W":
			col = col - 1;
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
		GameRunner.removeElement(GameRunner.board, roworig, colorig);
		boolean condition1 = (row == GameRunner.star.getRow() && col == GameRunner.star.getCol())
				|| (row == GameRunner.star1.getRow() && col == GameRunner.star1.getCol())
				|| (row == GameRunner.mine.getRow() && col == GameRunner.mine.getCol()&& GameRunner.mine.isDestroyed()== false);
		if (condition1) {
			System.out.println("YOU DIED");
			status = true;
		}else if(row < 0 || row >= GameRunner.board.length || col >= GameRunner.board[1].length || col < 0) {
			row = roworig;
			col = colorig;
		}else if(row == GameRunner.kling.getRow() && col == GameRunner.kling.getCol()) {
			System.out.println("You have successfully destoryed the Klingon and killed yourself!");
			GameRunner.kling.setStatus(true);
			status = true;

		}
		GameRunner.addElement(GameRunner.board, "E", row, col);

	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

	public boolean isDestroyed() {
		return status;
	}

	public void setRow(int a) {
		row = a;
	}

	public void setCol(int a) {
		col = a;
	}
	
	public void setCondition(boolean a) {
		status = a;
	}

}
