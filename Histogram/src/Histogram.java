public class Histogram
{
	public static void scan(int[] ray) {
		int count0 = 0, count1 = 0, count2 = 0, count3 = 0,count4 = 0;
		int count5 = 0, count6 = 0, count7 = 0, count8 = 0,count9 = 0;
		for(int item : ray) {
			switch(item) {
			case 0:
				count0++;
				break;
			case 1:
				count1++;
				break;
			case 2:
				count2++;
				break;
			case 3:
				count3++;
				break;
			case 4:
				count4++;
				break;
			case 5:
				count5++;
				break;
			case 6:
				count6++;
				break;
			case 7:
				count7++;
				break;
			case 8:
				count8++;
				break;
			case 9:
				count9++;
				break;
			}
		}
		String res = "0 - "+count0 +"\n" +
					"1 - "+count1 +"\n" +
					"2 - "+count2 +"\n" +
					"3 - "+count3 +"\n" +
					"4 - "+count4 +"\n" +
					"5 - "+count5 +"\n" +
					"6 - "+count6 +"\n" +
					"7 - "+count7 +"\n" +
					"8 - "+count8 +"\n" +
					"9 - "+count9 +"\n";
		System.out.println(res);
	}
}