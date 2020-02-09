//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
	}

	public TriangleThree(int count, String let)
	{
	}

	public String setTriangle( String let, int sz )
	{
		String output = "";
		for(int i=1;i<=sz;i++) {

			for(int j=1;j<=(sz-i);j++)
			{
				output += " ";
			}
			for(int k =1;k<=i;k++) {
				output += let;
			}
			
			
			output += "\n";
		}
		return output;
	}

	public String getLetter() 
	{
		return "#";
	}

	public String toString()
	{
		String output="";
		return output+"\n";
	}
}