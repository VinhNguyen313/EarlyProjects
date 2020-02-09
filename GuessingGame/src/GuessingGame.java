//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
	Random ran = new Random();
	
	public GuessingGame(int stop)
	{
	}
	
	public GuessingGame()
	{
	}
	public void playGame()
	{
		double count = 2;		
		System.out.print("Guessing Game - how many numbers? ");
		Scanner keyboard = new Scanner(System.in);
		upperBound = keyboard.nextInt();
		int a = ran.nextInt(upperBound)+1;
		System.out.print("Enter a number between 1 and " + upperBound + " ");
		int ans = keyboard.nextInt();
		if(ans != a) {
		while(ans != a) {
			if(ans>upperBound) 
			{System.out.print("Number out of range!"); 
			}
			System.out.print("Enter a number between 1 and " + upperBound + " ");
			ans = keyboard.nextInt();
			count++;
		}
		System.out.println("It took " +  (count-1) + " guesses to guess " + a);
		System.out.println("You guessed wrong " +  String.format("%.2f", (((count-1)/count)*100)) + " percent of the time");

		}else if(ans == a) {
			System.out.println("It took 1 guess to guess " + a);
			System.out.println("You guessed wrong 0 percent of the time");
		}

	}

	public String toString()
	{
		String output="";
		return output;
	}
}