//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
	}

	public TriangleFive(char c, int amt)
	{
	amount = amt;
	letter = c;
	}
	
	public void print() {
		for(int i = 1; i<=amount; i++) {
			for(int j = amount; j>=i;j--) {
				for(int v = 0; v<j;v++) {
						System.out.print(Character.toString ((char) ((int)letter+(amount-j))));					
				}
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
	public void setLetter(char c)
	{
	}
	
	public void setAmount(int amt)
	{
	}

	public String toString()
	{
		String output="";
		return output;
	}
}