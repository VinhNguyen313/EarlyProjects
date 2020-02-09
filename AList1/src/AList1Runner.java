import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.System.*;
public class AList1Runner {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("input.dat");
		AList a = new AList(f);
		out.println("List:" + a.displayList());
		out.println("Duplicates Removed: " + a.removeAllDuplicates());
		out.println("Multiples of five removed: " + 
		a.removeMultiplesOfFive());
		out.println("Numbers converted to characters (by ASCII value): "
		+a.convertNumbersToCharacters());
		out.println("Median Value: "+a.getMedianValue());
		out.println("Reversed List: "+a.reverseElements());
		out.println("Neighbor swapped: "+a.changeElementsWithNeighbor());
		out.println();
		File f1 = new File("input1.dat");
		AList b = new AList(f1);
		out.println("List:" + b.displayList());
		out.println("Duplicates Removed: " + b.removeAllDuplicates());
		out.println("Multiples of five removed: " + 
		b.removeMultiplesOfFive());
		out.println("Numbers converted to characters (by ASCII value): "
		+b.convertNumbersToCharacters());
		out.println("Median Value: "+b.getMedianValue());
		out.println("Reversed List: "+b.reverseElements());
		out.println("Neighbor swapped: "+b.changeElementsWithNeighbor());


			
	}

}
