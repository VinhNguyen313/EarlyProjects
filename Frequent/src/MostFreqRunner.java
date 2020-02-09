//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.*;

@SuppressWarnings("unused")
public class MostFreqRunner
{
	public static void main( String args[] )
	{							
		int[] b = {7,7,7,8,8,8,8,8,6,6};
		int[] c = {10,9,8,7,6,5,4,3,2,1,-99};
		int[] d = {10,20,30,40,50,10,10,40,30,20,10};
		int[] a = {3,3,1,1,7,7,8,8};

		System.out.println(RayMostFreq.go(b));
		System.out.println(RayMostFreq.go(c));
		System.out.println(RayMostFreq.go(d));
		System.out.println(RayMostFreq.go(a));



	}
}