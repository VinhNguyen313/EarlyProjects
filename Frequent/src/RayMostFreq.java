import java.util.Arrays;

public class RayMostFreq
{
	//method go will return the value 
	//that appears the most
	//if several numbers all appear
	//the same number of times
	//return the first number found
	public static int go(int[] ray)
	{
		int count1 = 1;
		int finalcount=1;
		int a = ray[0];
		Arrays.sort(ray);
		int first = ray[0];
		for(int i = 0; i<ray.length-1;i++) {
			if(ray[i]==ray[i+1]) {
				count1 = count1+1;
				
					if(count1>finalcount) {
						finalcount = count1;
						first = ray[i];	
					}
			}else {
				count1 = 1;
			}
		}
		if(finalcount == 1) {
			return a;
		}


		return first;
	}
}