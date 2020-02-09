//(c) A+ Computer Science
// www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int x1,y1,x2,y2;
	public Distance()
	{
		x1=0;
		x2=0;
		y1=0;
		y2=0;
	}
	public Distance(int xOne, int yOne, int xTwo, int yTwo)
	{
		x1=xOne;
		x2=xTwo;
		y1=yOne;
		y2=yTwo;
	}

	public String determineClosest( )
	{
		String result="";
		double distanceA = 0.0; 
		double distanceB = 0.0;
		distanceA = Math.sqrt((Math.pow(x1,2)+Math.pow(y1,2)));
		distanceB = Math.sqrt((Math.pow(x2,2)+Math.pow(y2,2)));
		if(distanceB>distanceA) {
		 result="A is closer to (0,0)";
		}
		if(distanceB==distanceA) {
			result="A and B are equidistant to (0,0)";
		}
		if(distanceB<distanceA) {
			result="B is closer to (0,0)";
		}
		
		return result;
	}
	
	public String toString()
	{
		return "";
	}
}