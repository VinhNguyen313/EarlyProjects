//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TwoToTen
{
	/* public String getBaseTwo(int bin)
	{
		int remainder = 0;
		String two = "";
		while(bin != 0)
		{
			remainder = bin %2;
			two = remainder + two;
			bin /= 2;
		}
	
		return two;
		
	} */

	public long getBaseTen(String bin)
	{
		long ten=0;
		for(int i = 0; i<bin.length();i++)
		{
			if(bin.charAt(i)== '1')
			{
				ten += Math.pow(2,bin.length()-1-i);
			}
		}
		return ten;
	}

	public String toString()
	{
		return "";
	}
}