//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RomanNumeralRunner
{
	public static void main( String args[] )
	{
		RomanNumeral test = new RomanNumeral();
		
		out.println("10 is " + test.toRoman(10));

		out.println("100 is " + test.toRoman(100));

		out.println("1000 is " + test.toRoman(1000));

		out.println("2500 is " + test.toRoman(2500));

		out.println("1500 is " + test.toRoman(1500));

		out.println("23 is " + test.toRoman(23));

		out.println("38 is " + test.toRoman(38));

		out.println("1020 is " + test.toRoman(1020));

		out.println("LXXVII is " + test.toArabic("LXXVII"));

		out.println("XLIX is " + test.toArabic("XLIX"));

		out.println("XX is " + test.toArabic("XX"));
		
		out.println("MIX is "+test.toArabic("MIX"));
	}
}