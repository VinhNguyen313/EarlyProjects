
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -


public class WordSearch {
	private String[][] m;

	public WordSearch(int size, String str) {
		String[] in = str.split("");
		m = new String[size][size];
		int i = 0;
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				m[row][col] = in[i];
				i++;
			}
		}
	}

	public boolean isFound(String word) {
		if (checkRight(word) || checkLeft(word) || checkUp(word) || checkDown(word) || checkDiagUpRight(word)
				|| checkDiagUpLeft(word) || checkDiagDownRight(word) || checkDiagDownLeft(word)) {
			return true;
		} else
			return false;
	}

	public boolean checkRight(String w) {
		boolean a = false;
		String in = "";
		for (String[] row : m) {
			for (String ele : row) {
				in += ele;

			}
			a = (in.contains(w)) ? true : false;
			if (a)
				return a;
			in = "";
		}
		return a;
	}

	public boolean checkLeft(String w) {
		boolean a = false;
		String in = "";

		for (int r = m.length - 1; r >= 0; r--) {
			for (int c = m[1].length - 1; c >= 0; c--) {
				in += m[r][c];
			}
			a = (in.contains(w)) ? true : false;
			if (a)
				return a;
			in = "";
		}

		return a;
	}

	public boolean checkUp(String w) {
		boolean a = false;
		String in = "";
		for (int c = 0; c < m[1].length - 1; c++) {
			for (int r = m.length - 1; r >= 0; r--) {
				in += m[r][c];
			}
			a = (in.contains(w)) ? true : false;
			if (a)
				return a;
			in = "";
		}
		return a;
	}

	public boolean checkDown(String w) {
		boolean a = false;
		String in = "";
		for (int c = 0; c < m[1].length - 1; c++) {
			for (int r = 0; r <= m.length - 1; r++) {
				in += m[r][c];
			}
			a = (in.contains(w)) ? true : false;
			if (a)
				return a;
			in = "";
		}

		return a;
	}

	public boolean checkDiagUpRight(String w) {
		boolean a = false;
		String in = "";
		for (int r = m.length - 1; r >= 0; r--) {
			int temp = r;
			for (int c = 0; c <= r; c++) {
				in += m[temp][c];
				temp--;
			}
			a = (in.contains(w)) ? true : false;
			if (a)
				return a;
			in = "";

		}
		for (int c = 1; c <= m.length; c++) {
			int temp = c;
			for (int r = m[1].length - 1; r >= c; r--) {
				in += m[r][temp];
				temp++;
			}
			a = (in.contains(w)) ? true : false;
			if (a)
				return a;
			in = "";

		}
		return a;
	}

	public boolean checkDiagUpLeft(String w) {
		boolean a = false;
		String in = "";
		for (int c = m[1].length - 1; c >= 0; c--) {
			int temp = c;
			for (int r = m.length - 1; r >= (m[1].length - 1 - c); r--) {
				in += m[r][temp];
				temp--;
			}
			a = (in.contains(w)) ? true : false;
			if (a)
				return a;
			in = "";
		}

		for (int r = m.length - 1; r > 0; r--) {
			int temp = r;
			for (int c = m[1].length - 1; c >= (m.length - r - 1); c--) {
				in += m[temp][c];
				temp--;
			}
			a = (in.contains(w)) ? true : false;
			if (a)
				return a;
			in = "";

		}

		return a;
	}

	public boolean checkDiagDownLeft(String w) {
		boolean a = false;
		String in = "";
		for (int c = 0; c < m[1].length; c++) {
			int temp = c;
			for (int r = 0; r <= c; r++) {
				in += m[r][temp];
				temp--;
			}
			a = (in.contains(w)) ? true : false;
			if (a)
				return a;
			in = "";
		}
		for(int r = 0; r<m.length;r++){
			int temp = r;
			for(int c = m[1].length-1;c>=r;c--) {
				in += m[temp][c];
				temp++;
			}
			a = (in.contains(w)) ? true : false;
			if (a)
				return a;
			in = "";
		}
		
		return a;
	}

	public boolean checkDiagDownRight(String w) {
		boolean a = false;
		String in = "";

		for (int r = 0; r < m.length; r++) {
			int temp = r;
			for (int c = 0; c < (m.length - r + 1); c++) {
				if (temp >= m.length)
					break;
				in += m[temp][c];
				temp++;
			}
			a = (in.contains(w)) ? true : false;
			if (a)
				return a;
			in = "";
		}
		for (int c = 0; c < m[1].length; c++) {
			int temp = c;
			for (int r = 0; r < (-c + m.length); r++) {
				in += m[r][temp];
				temp++;
			}
			a = (in.contains(w)) ? true : false;
			if (a)
				return a;
			in = "";
		}

		return a;
	}

	public String toString() {
		String res = "";
		for (String[] row : m) {
			for (String element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
		return res;
	}
}
