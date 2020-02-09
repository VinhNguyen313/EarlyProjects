import java.io.*;
import java.util.*;
public class AList {
	File f;
	public AList(File a) {
		f = a;
	}
	public ArrayList<Integer> displayList() throws FileNotFoundException{
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner input = new Scanner(f);
		while(input.hasNextInt())
		{
		list.add(input.nextInt());
		}
		return list;
	}
	public ArrayList<Integer> removeAllDuplicates() throws FileNotFoundException {	
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner input = new Scanner(f);
		while(input.hasNextInt()) {
			list.add(input.nextInt());
		}
		ArrayList<Integer> reslist = new ArrayList<Integer>();
		Collections.sort(list);
		for(int i = 0; i<list.size()-1;i++) {
			if(list.get(i)!=list.get(i+1)) {
				reslist.add(list.get(i));
			}
			if(list.get(list.size()-1)!=list.get(i) && i == list.size()-2) {
				reslist.add(list.get(list.size()-1));
			}
		}		
		return reslist;
	}
	public ArrayList<Integer> removeMultiplesOfFive() throws FileNotFoundException {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner input = new Scanner(f);
		while(input.hasNextInt()) {
			list.add(input.nextInt());
		}
		ArrayList<Integer> reslist = new ArrayList<Integer>();
		for(int item : list) {
			if(item%5 != 0) {
				reslist.add(item);
			}
		}
		return reslist;
	}
	public ArrayList<Character> convertNumbersToCharacters() throws FileNotFoundException{//convert numbers in arraylist to characters.
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner input = new Scanner(f);
		while(input.hasNextInt()) {
			list.add(input.nextInt());
		}
		ArrayList<Character> reslist = new ArrayList<Character>();
		
		for(int item : list){
			if(122>item && item>33) {
			char a = (char)item;
			reslist.add(a);
			}else {
				reslist.add('.');
			}
		}
		return reslist;
	}
	public int getMedianValue() throws FileNotFoundException{	//get median value
		int median = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner input = new Scanner(f);
		while(input.hasNextInt()) {
			list.add(input.nextInt());
		}
		Collections.sort(list);
		if(list.size()%2 != 0) {
			int loc = list.size()/2;
			median = list.get(loc);
		}else{
			int loc = list.size()/2;
			median = (list.get(loc)+list.get(loc-1))/2;
		}
		
		return median;
	}
	public ArrayList<Integer> reverseElements() throws FileNotFoundException{
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner input = new Scanner(f);
		while(input.hasNextInt()) {
			list.add(input.nextInt());
		}
		ArrayList<Integer> reslist = new ArrayList<Integer>();
		
		for(int i = list.size()-1;i>=0;i--) {
			reslist.add(list.get(i));
		}
		return reslist;
	}
	public ArrayList<Integer> changeElementsWithNeighbor() throws FileNotFoundException{
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner input = new Scanner(f);
		while(input.hasNextInt()) {
			list.add(input.nextInt());
		}
		ArrayList<Integer> reslist = new ArrayList<Integer>();
		if(list.size()%2!=0) {
		for(int i = 1; i<list.size();i+=2) {
				reslist.add(list.get(i));
				reslist.add(list.get(i-1));
		}
		reslist.add(list.get(list.size()-1));
		}else {
			for(int i = 1; i<list.size();i+=2) {
			reslist.add(list.get(i));
			reslist.add(list.get(i-1));
		}
		}
		return reslist;
	}

}
