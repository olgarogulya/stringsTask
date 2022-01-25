package by.epam.training.strings.main;

import java.util.ArrayList;
import java.util.List;

import by.epam.training.strings.logic.MyStringLogic;
import by.epam.training.strings.print.Print;

public class Main {

	public static void main(String[] args) {
		
		MyStringLogic logic = new MyStringLogic();
		Print view = new Print();
		
		//task 'Remove Extra Spaces' in the String
		String a = new String("  string      with      extra      spaces  ");
		a = logic.removeExtraSpaces(a);
		view.print(a);
		
		//task 'Count words in the String'
		String b = new String("word1 word2 word3 word4 word5");
		int countWords = logic.wordsCount(b);
		view.print(countWords);
		
		//task 'Longest Word'
		String c = new String("word11 word2 word3 word44444 word5");
		String longestWord = logic.longestWord(c);
		view.print(longestWord);
		
		//task 'Longest string'
		List<String> l = new ArrayList<String>();
		l.add("Minsk");
		l.add("Oslo");
		l.add("Netherlands");
		l.add("Ol");
		String longestString = logic.longestString(l);
		view.print(longestString);
		
		//task 'Remove all spaces and check if String is reversed'
		String str = "re divider ";
		str = logic.removeSpaces(str);
		StringBuilder sb = new StringBuilder(str);
		StringBuilder sb2 = new StringBuilder(logic.reverseString(sb));
		view.print(str.equals(sb2.toString()));
		
		//task 'Count number of symbols with upper case and lower case'
	    //String to Enter "Hello Java! Hello JavaScript! JavaSE 8.";
        String s = logic.enterString();
		int lowerCaseCount = logic.countSymbolsByPattern(s, "[a-z]");
        view.print(lowerCaseCount);
        int upperCaseCount = logic.countSymbolsByPattern(s, "[A-Z]");
        view.print(upperCaseCount);
	}

}
