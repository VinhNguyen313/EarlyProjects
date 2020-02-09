//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class GuessRunner
{
	public static void main(String args[])
	{
		
		GuessingGame a = new GuessingGame();
		a.playGame();
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Do you want to play again? ");
		String response = keyboard.next();
		while(response.equals("y") || response.equals("yes"))
		{
			System.out.println("");
			a.playGame();
			System.out.print("Do you want to play again? ");
			response = keyboard.next();
		} 
		System.out.println("Thanks for playing");
		keyboard.close();
	}
}