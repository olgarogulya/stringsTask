package by.epam.training.strings.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyStringLogic {

	//String s = new String();
	//List<String> l = new ArrayList<String>();
	
	public String removeExtraSpaces(String s) {
		s = s.trim().replaceAll("\\s+", " ");
		return s;
	}
	
	public Integer wordsCount(String s) {
		String [] b = s.split("\\s");
		int count = b.length;
		return count;
	}
	
	public String longestWord(String s) {
		String [] b = s.split("\\s");
		String c = " ";
		for(String strings : b) {
			if(strings.length() > c.length()) {
				c = strings;
			}
		}
		return c;
	}
	
	public String longestString(List<String> l) {
		String c = " ";
		for(int i = 0; i < l.get(i).length(); i++) {
			if(l.get(i).length() > c.length()) {
				c = l.get(i);
			}
		}
		return c;
	}
	
	public String removeSpaces(String s) {
		s = s.trim().replaceAll("\\s+", "");
		return s;
	}
	
	public StringBuilder reverseString(StringBuilder s) {
		s = s.reverse();
		return s;
	}
	
	public String reverseString(String s) {
		//String input = "Hello Java! Hello JavaScript! JavaSE 8.";
        Pattern pattern = Pattern.compile("[a-z]");
        String[] words = pattern.split(s);
        for(String word:words)
            System.out.println(word);   
		return s;
	}
	
	public String enterString() {
		System.out.println("Enter a String");
		Scanner sa = new Scanner(System.in);
	    String s = sa.nextLine();
	    sa.close();
		return s;
	}
	
	public Integer countSymbolsByPattern(String s, String p) {
		 Pattern pattern = Pattern.compile(p);
	        Matcher matcher = pattern.matcher(s);
	        String m = "";
	        List<String> list = new ArrayList<String>();
			
	        while(matcher.find()) {
	        	m = matcher.group();
	        	list.add(m);
	        }
	        int count = list.size();
	        
		return count;
	}
	
}
