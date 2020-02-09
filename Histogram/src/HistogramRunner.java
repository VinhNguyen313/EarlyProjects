public class HistogramRunner
{
	public static void main(String args[])
	{
		int[] a = {1, 5, 3, 4, 5, 5, 5, 4, 3, 2, 5, 5, 5, 3};
		int[] b = {2,3, 4, 5, 6, 7, 8, 9, 0, 2, 3, 5, 6, 8, 8,8, 9, 4, 5};
		int[] c = {7, 7, 7, 7, 7, 7, 7, 7, 5, 6, 7, 8, 2, 0, 2, 3, 5, 1, 2, 3, 4, 5, 6, 5};
		Histogram.scan(a);
		Histogram.scan(b);
		Histogram.scan(c);
		
	}
}