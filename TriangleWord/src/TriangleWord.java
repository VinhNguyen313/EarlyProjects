//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

class TriangleWord
{
   private String word;

	public TriangleWord()
	{
	}

	public TriangleWord(String w)
	{
		word = w;
	}

	public void setWord(String w)
	{
		word = w;
	}
	
	public void print() {
		StringBuffer a = new StringBuffer(word);
		for(int i = 0; i<word.length()-1;i++) {
			
			for(int j = 0;j<=(2*word.length()-1);j++) {
				if(j== word.length()-1-i || j==word.length()-1+i) {
					System.out.print(word.charAt(i));
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.println();

			if(i==(word.length()-2)) {
				System.out.print(a.reverse()+word.substring(1));
				
			}
			
		}
		System.out.println();
	}
	public String toString()
	{
		String output= "";
		return output+"\n";
	}

}