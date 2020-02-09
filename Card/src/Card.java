//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
		private String suit;
		private int face;

  	//constructors
		public Card(String s, int f)
		{
			suit = setSuit(s);
			face = setFace(f);
		}
		public Card()
		{
			suit ="N/A";
			face = 0;		
		}

	// modifiers
		//set methods
		public String setSuit(String s) {
			suit = s;
			return suit;
		}
		public int setFace(int f) {
			if(1<=f &&f<=13)
			{
				face= f;
			}else {return 0;}
			return face;
		}
  	//accessors
		//get methods
		public String getSuit()
		{
			return suit;
		}
		public String getFace()
		{
			return FACES[face];
		}
  	//toString
		public String toString() {
			String ans = FACES[face] + " of "+ suit;
			return ans;
			
		}
 }