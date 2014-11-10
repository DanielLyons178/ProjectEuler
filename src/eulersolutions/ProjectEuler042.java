package eulersolutions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProjectEuler042 {
	
	public static void main(String[] args) throws FileNotFoundException{
		int count=0;
		for(String s: words()){
			
			if(triWord(s)){
			count++;
			}
		}
		System.out.println("Number of triangular words: "+count);
		
	}
	
	public static int charAlphNum(char c){
		return Character.getNumericValue(c) - 9;
	}
	
	public static boolean triWord(String s){
		return isTri(wordSum(s));
	}
	
	public static boolean isTri(int n){
		
		n = n*2;
		int sqrt = (int) Math.sqrt(n);
		return (sqrt*(sqrt+1))/2 == n/2;
		
		
	}
	
	
	public static int wordSum(String s){
		int total=0;
		
		for(char c: s.toCharArray()){
			total+= charAlphNum(c);
		}
		
		return total;
	}
	
	public static List<String> words() throws FileNotFoundException {
		File f = new File("words.txt");
		Scanner fileScanner = new Scanner(f);
		
		fileScanner.useDelimiter("\",\"");
		
		List<String> l = new ArrayList<String>();
		
		while(fileScanner.hasNext()){
			l.add(fileScanner.next());
		}
		fileScanner.close();
		l.set(0, l.get(0).replaceAll("\"", ""));
		l.set(l.size()-1, l.get(l.size()-1).replaceAll("\"", ""));
		return l;
	}

}
