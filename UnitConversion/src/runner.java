import static java.lang.System.*;

import java.io.*;
import java.util.*;

public class runner {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("in.txt");
		Scanner a = new Scanner(f);
		while (a.hasNextLine()) {
			double miles = a.nextDouble();
			out.println("Enter the distance (in miles) :: " + miles);
			double hours = a.nextDouble();
			out.println("Enter the hours :: " + hours);
			double minutes = a.nextDouble();
			out.println("Enter the minutes :: " + minutes);
			miles m = new miles(miles, hours, minutes);
			kilometers km = new kilometers(miles, hours, minutes);
			out.println("\n" + String.format("%.2f", miles) + " miles in " + String.format("%.2f", hours)
					+ " hours and " + String.format("%.2f", minutes) + " minutes = " + String.format("%.2f", m.toMPH())
					+ " mph.");
			out.println(String.format("%.2f", km.toKm()) + " kilometers in " + String.format("%.2f", hours)
					+ " hours and " + String.format("%.2f", minutes) + " minutes = " + String.format("%.2f", km.toKPH())
					+ " km/h.");
			out.println("--");
			if (a.hasNextLine())
				a.nextLine();
		}
		a.close();
	}

}
