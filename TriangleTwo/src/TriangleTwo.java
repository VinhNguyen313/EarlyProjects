//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleTwo
{
   private int size;
   private String letter;
   private String output = "";

	public TriangleTwo()
	{
	}

	public TriangleTwo( String let, int sz)
	{
		size = sz;
		letter = let;
	}

	public void setTriangle(int count, String let)
	{
		size = count;
		letter = let;
	
	}
	public void setTriangle()
	{
		for(int i = size; i>=1; i--)
		{
			for(int j = i; j>=1;j--) {
				output += letter;
			}
			output += "\n";
		}
	}

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		return output+"\n";
	}
}