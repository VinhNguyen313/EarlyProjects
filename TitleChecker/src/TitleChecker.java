import java.io.*;
import java.util.Scanner;

public class TitleChecker 
{

    public static void main (String args[]) throws IOException 
    {  	
    	processTitle();
  
    }
       
    public static void processTitle() throws IOException
    {
    	//add code here
    	String title = "";
    	String print = "";
    	File f = new File("C:\\Users\\s705575\\Downloads\\TitleChecker\\title.dat");
    	Scanner reader = new Scanner(f);
    	int a = reader.nextInt();
		String[] list = null;
        reader.nextLine();
    	for(int i = 1; i<=a; i++){
    		title = reader.nextLine();
    		list = title.split(" ");
    		list[0] = list[0].substring(0,1).toUpperCase() + list[0].substring(1);
    		for(int v =1; v<list.length; v++)
    		{
    			if(!list[v].equals("the") && !list[v].equals("a") && !list[v].equals("an")
    					&& !list[v].equals("and")&& !list[v].equals("or")&& 
    					!list[v].equals("for")&& !list[v].equals("on")&& !list[v].equals("is")&& !list[v].equals("of"))
    			list[v] = list[v].substring(0,1).toUpperCase() + list[v].substring(1);
    		}
			System.out.print("#"+i+": ");
    		for(String abc : list) {
    			
    			System.out.print(abc+" ");
    		
	    	}
    		System.out.println(" ");

    	}
    	reader.close();
    
   
    }
}
