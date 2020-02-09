//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		for(int i = 1; i<=5; i++) {
		out.print("Enter the original bill amount :: ");
		Scanner keyboard = new Scanner(System.in);
		double amt = keyboard.nextDouble();
		out.println("Bill after discount :: " + 
		String.format("%.2f",Discount.getDiscountedBill(amt)));
		System.out.println();
		}
		

	}
}