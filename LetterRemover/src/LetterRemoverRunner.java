//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover a = new LetterRemover("I am Sam I am",'a');
		System.out.println(a+"\n"+a.removeLetters());
		LetterRemover b = new LetterRemover("ssssssssxssssesssssesss",'s');
		System.out.println(b+"\n"+b.removeLetters());
		LetterRemover c = new LetterRemover("qwertyqwertyqwerty ",'a');
		System.out.println(c+"\n"+c.removeLetters());
		LetterRemover d = new LetterRemover("abababababa",'b');
		System.out.println(d+"\n"+d.removeLetters());
		LetterRemover e = new LetterRemover("abaababababa",'x');
		System.out.println(e+"\n"+e.removeLetters());
	}
}