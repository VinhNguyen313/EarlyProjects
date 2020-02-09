import static java.lang.System.*;
public class runner {

	public static void main(String[] args) {
		int[][] list = {{1,6,11,16,21},{2,7,12,17,22},{3,8,13,18,23},
				{4,9,14,19,24},{5,10,15,20,25}};
		out.println(Converter.printTwo(list));
		out.println(Converter.printOne(list));
		out.println(Converter.printDiag(list));
		out.println(Converter.printBorder(list));
		out.println(Converter.toEvensOdds(list));
		out.println(Converter.printSquare(list));
		}
		
	}


