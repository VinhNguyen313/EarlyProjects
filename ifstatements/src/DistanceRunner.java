//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		String condition="yes";
		while(condition.equals("yes")) {
		Scanner keyboard = new Scanner( System.in );
		out.print("Enter X1 :: ");
		int xOne = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		int yOne = keyboard.nextInt();
		out.print("Enter X2 :: ");
		int xTwo = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		int yTwo = keyboard.nextInt();
		Distance test = new Distance(xOne, yOne, xTwo, yTwo);
		out.println(test.determineClosest());
		out.print("Do you want to continue?");
		condition = keyboard.next();}
		
		//add more test cases
	}
}