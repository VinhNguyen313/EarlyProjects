import static java.lang.System.out;

public class main {

	public static void main(String[] args) {
		rearrange();
	}

	public static void rearrange() {
		String[] a = { "a", "b", "c", "d", "e", "f", "g" };
		String[][] mat = new String[3][3];
		for (int r = 0; r < mat.length; r++) {
			for (int c = 0; c < mat[r].length; c++) {
				if (r == 0) {
					mat[r][c] = (7 - 2 * c == 7) ? a[c] : a[(7 - 2 * c)];
					continue;
				}
				if (r == 2 && r != c) {
					mat[r][c] = a[2 * r + 2 * c];
					continue;
				}
				if (r == c)
					mat[r][c] = a[r];

			}
		}
		printArray(mat);
	}

	public static void printArray(String[][] a) {
		for (String[] x : a) {
			for (String y : x) {
				if (y != null)
					out.print(y + " ");
				else
					out.print("  ");

			}
			out.println();
		}
	}

}
