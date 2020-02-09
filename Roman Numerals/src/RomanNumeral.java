//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class RomanNumeral
{

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};
	public RomanNumeral() {
		
	}
	public String toRoman(Integer orig) {
		String rom = "";
		for(int i = 0; i<NUMBERS.length;i++) {
			while(orig>=NUMBERS[i])
			{
				rom += LETTERS[i];
				orig -= NUMBERS[i];
			}
		}		
		return rom;
	}
	
	public int toArabic(String rom) {
		int orig = 0;
		for(int i = 0; i< NUMBERS.length;i++) {
			while(rom.indexOf(LETTERS[i])==0) {
				orig += NUMBERS[i];
				rom = rom.substring(LETTERS[i].length());
			}
		}
		return orig;
	}

}