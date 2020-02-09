
public class Converter {
	
	public static String toEvensOdds(int[][] list) {
		String res = "";
		for(int c = 0; c<list[1].length;c++) {
			for(int r = 0; r<list.length;r++) {
				if(list[r][c] %2 == 0) {
					res = res + list[r][c] + " ";
				}
			}
		}
		for(int c = 0; c<list[1].length;c++) {
			for(int r = 0; r<list.length;r++) {
				if(list[r][c] % 2 != 0) {
					res = res + list[r][c] + " ";
				}
			}
		}
		return res;
	}
	public static String printOne(int[][] list) {
		String res = "";
		for(int c  = 0; c<list[1].length;c++) {
			for(int r= 0; r<list.length;r++){
				res = res + list[r][c] + " ";
			}
		}
		return res;
	}
	public static String printTwo(int[][] list) {
		String res = "";
		for(int c  = 0; c<list[1].length;c++) {
			for(int r= 0; r<list.length;r++){
				if(c%2 == 0) {
				res = res + list[r][c] + " ";
				}else {
					res = res + list[list.length-r-1][c] + " ";
				}
			}
		}
		return res;
	}
	public static String printDiag(int[][] list) {
		String res = "";
		for(int c  = 0; c<list[1].length;c++) {
			for(int r= 0; r<list.length;r++){
				if(r ==c) {
					res = res + list[r][c] + " ";
				}
			}				
		}
			for(int c  = 0; c<list[1].length;c++) {
				for(int r= 0; r<list.length;r++){
					if(c == -r+4) {
						res = res + list[list.length-1-r][list[1].length-c-1] + " ";
					
			}
		}
	}
			return res;
	
	}
	public static String printBorder(int[][] list) {
		String res = "";
		for(int top = 0; top<list[1].length;top++) {
			res += list[0][top] + " ";
		}
		for(int s = 1; s<list[1].length;s++) {
			res += list[s][list[1].length-1] + " ";
		}
		for(int bot = list[1].length-2; bot>=0;bot--) {
			res += list[list[1].length-1][bot] + " ";
		}
		for(int s = list.length-2; s>=0;s--) {
			res += list[s][0] + " ";
		}
		return res;
	}
	
	public static String printSquare(int[]list[]) {
		String res = "";
		res += list[1][2] + " ";
		res += list[1][3] + " ";
		res += list[2][2] + " ";
		res += list[2][3];
		return res;
	}
}
