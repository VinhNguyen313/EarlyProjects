import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameRunner {
	static String[][] board = new String[7][10];
	private static Random rand = new Random();
	static Klingon kling;
	static Mine mine;
	static Star star, star1;
	static Enterprise ent;
	static PhotonTorpedo PhotonTorpedo = new PhotonTorpedo();

	public static void main(String[] args) {
		boolean done = false;
		int z = -1;
		ArrayList<Integer> listx = new ArrayList<Integer>();
		ArrayList<Integer> listy = new ArrayList<Integer>();

		// random coor generator
		while (!done) {
			int x1 = rand.nextInt(7);
			int y1 = rand.nextInt(10);
			listx.add(0, x1);
			listy.add(0, y1);
			if (listx.size() > 1) {
				z = checkValues(listx, listy);
			}
			if (z != -1) {
				listx.remove(z);
				listy.remove(z);
				z = -1;
			}
			if (listx.size() >= 5) {
				done = true;

			}
		}
		// done

		// assign random coordinates to objects
		ent = new Enterprise(listx.get(0), listy.get(0));
		kling = new Klingon(listx.get(1), listy.get(1));
		mine = new Mine(listx.get(2), listy.get(2));
		star = new Star(listx.get(3), listy.get(3));
		star1 = new Star(listx.get(4), listy.get(4));
		// done
//		out.println(listx.get(2)+" "+ listy.get(2)); //mine location
		// Instantiate original array
		for (int r = 0; r < board.length; r++) {
			for (int c = 0; c < board[1].length; c++) {
				board[r][c] = "+";
			}
		}
		// done
		
		//Add objects onto array
		addElement(board, "*", star.getRow(), star.getCol());
		addElement(board, "*", star1.getRow(), star1.getCol());
		addElement(board, "E", ent.getRow(), ent.getCol());
		addElement(board, "K", kling.getRow(), kling.getCol());

		printArray(board);
		//Done
		Scanner input = new Scanner(System.in);

		// out.print("Enter 'S' to give the coordinates of the Klingon");
		//
		// if (input.next().equalsIgnoreCase("S")) {
		// out.print("col-coor: ");
		// kling.setCol(input.nextInt());
		// out.print("row-coor: ");
		// kling.setRow(input.nextInt());
		// }
		// addElement(board, "K", kling.getRow(), kling.getCol());
		// printArray(board);
		
		do{
			out.print("Enter 'M' to move the Enterprise,'F' to launch photon torpedo :: ");
			takeInput(input);
			if(!ent.isDestroyed() && !kling.isDestroyed())
			printArray(board);

		}
		while(!ent.isDestroyed() && !kling.isDestroyed()); 

	}

	public static void printArray(String[][] a) {
		int count = 0;
		out.println("  0 1 2 3 4 5 6 7 8 9");
		for (String[] x : a) {
			out.print(count + " ");
			for (String y : x) {
				out.print(y + " ");
			}
			out.println();
			count++;
		}
	}

	public static void addElement(String[][] a, String b, int row, int col) {
		for (int r = 0; r < a.length; r++) {
			for (int c = 0; c < a[r].length; c++) {
				if (c == col && r == row) {
					a[r][c] = b;

				}
			}
		}

	}

	public static void removeElement(String[][] a, int row, int col) {
		for (int r = 0; r < a.length; r++) {
			for (int c = 0; c < a[r].length; c++) {
				if (c == col && r == row) {
					a[r][c] = "+";

				}
			}
		}
	}

	public static int checkValues(ArrayList<Integer> x, ArrayList<Integer> y) {
		int value = -1;
		for (int i = 0; i < x.size() - 1; i++) {
			for (int j = i + 1; j < x.size(); j++) {
				if (x.get(i) == x.get(j)) {
					if (y.get(i) == y.get(j)) {
						value = j;
						break;
					}
				}
			}
		}
		return value;
	}

	public static void takeInput(Scanner input) {
		String a = input.next();
		if (a.equalsIgnoreCase("M")) {
			out.print("Enter your direction: ");
			ent.move(input.next());
		}
		if (a.equalsIgnoreCase("F")) {
			out.print("Row-coor: ");
			int row = input.nextInt();
			out.print("Col-coor: ");
			int col = input.nextInt();
			PhotonTorpedo.shoot(row, col);
		}
	}
}
