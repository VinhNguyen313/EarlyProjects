
public class PhotonTorpedo{

	
	public void shoot(int row, int col) {
		if(row == GameRunner.mine.getRow() && col == GameRunner.mine.getCol()) {
			System.out.println("You have destroyed a mine, good job!");
			GameRunner.addElement(GameRunner.board, "D", GameRunner.mine.getRow(), GameRunner.mine.getCol());
			GameRunner.mine.setStatus(true);
		}else if(row == GameRunner.kling.getRow() && col == GameRunner.kling.getCol()) {
			System.out.println("You have destroyed the Klingon, therefore you won!!");
			GameRunner.addElement(GameRunner.board, "D", GameRunner.kling.getRow(), GameRunner.kling.getCol());
			GameRunner.kling.setStatus(true);
		}else if(row == GameRunner.ent.getRow() && col == GameRunner.ent.getCol()) {
			System.out.println("You have successfully killed yourself, awesome!!");
			GameRunner.addElement(GameRunner.board, "X", GameRunner.ent.getRow(), GameRunner.ent.getCol());
			GameRunner.ent.setCondition(true);
		}else {
			System.out.println("Congratulations, you have destroyed nothing!");
			GameRunner.addElement(GameRunner.board, "0", row, col);
		}
	}



	public boolean isDestroyed() {
		return false;
	}

}
