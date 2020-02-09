
public class DownRunner
{
	public static void main( String args[] )
	{	
		int[] a = {9,8,10,3,2};
		int[] b = {-99,1,2,3,4,5,6,7,8,9,10,12345};
		int[] c = {10,9,8,7,6,5,4,3,2,1,-99};
		int[] d = {10,20,30,40,50,-11818,40,30,20,10};
		int[] e = {32767};
		int[] f = {9,10,-88,100,-555,1000};
		int[] v = {10,10,10,11,456};
		int[] z = {-111,1,2,3,9,11,20,30};
		int[] ab = {9,8,7,6,5,4,3,2,0,-2,-989};
		int[] cd = {12,15,18,21,23,1000};
		int[] w = {250,19,17,15,13,11,10,9,6,3,2,1,-455};
		int[] l = {9,10,-8,10000,-5000,1000};
		System.out.println(RayDown.go(a));
		System.out.println(RayDown.go(b));
		System.out.println(RayDown.go(c));
		System.out.println(RayDown.go(d));
		System.out.println(RayDown.go(e));
		System.out.println(RayDown.go(f));
		System.out.println(RayDown.go(v));
		System.out.println(RayDown.go(z));
		System.out.println(RayDown.go(ab));
		System.out.println(RayDown.go(cd));
		System.out.println(RayDown.go(w));
		System.out.println(RayDown.go(l));


	}
}