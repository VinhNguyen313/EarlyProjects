//Name - Vinh Nguyen

public class TwoToTenRunner
{
	public static void main ( String[] args )
	{
		TwoToTen abc = new TwoToTen();
		//From binary to decimal input a String.
		//From decimal to binary input an int.
		System.out.println("0100 == " + abc.getBaseTen("0100"));
		System.out.println();
		System.out.println("1010 == " + abc.getBaseTen("1010"));
		System.out.println();
		System.out.println("1100 == " + abc.getBaseTen("1100"));
		System.out.println();
		System.out.println("1110 == " + abc.getBaseTen("1110"));
		System.out.println();
		System.out.println("1111 == " + abc.getBaseTen("1111"));
		System.out.println();
		System.out.println("11111 == " + abc.getBaseTen("11111"));
		System.out.println();
		System.out.println("111111 == " + abc.getBaseTen("111111"));
		System.out.println();
		System.out.println("1110101 == " + abc.getBaseTen("1110101"));
		System.out.println();
		System.out.println("10101010101 ==" + abc.getBaseTen("10101010101"));
		System.out.println();
		System.out.println("1010101010110 == " + abc.getBaseTen("1010101010110"));
		System.out.println();
		System.out.println("111111111111111111 == " + abc.getBaseTen("111111111111111111"));


	}
}