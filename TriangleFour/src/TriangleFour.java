//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFour
{
   private int size;
   private String letter;

	public TriangleFour()
	{
	}

	public TriangleFour(int count, String let)
	{
	}

	public String setTriangle( String let, int sz )
	{
		String output = "";
		for(int i=1;i<=sz;i++) {
			for(int j=2;j<=i;j++)
			{
				output += " ";
			}
			for(int k =1;k<=(sz-i+1);k++) {
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