package pkgCore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WordFilter filter = new WordFilter();
		//filter.setStrEndWith("S");
		//filter.setStrStartWith("L");
		//filter.setiContainsIdx(0);
		//filter.setStrContains("LA");
		//filter.setiLength(3);
		
		
		Dictionary d = new Dictionary();
		String strLetters = "CLASS";
		
		ArrayList<Word> words = d.GenerateWords(strLetters);
		System.out.println(words.size());
		
		
		
		for(int i = 0; i < words.size(); i++) {
			System.out.println(words.get(i).getWord());
			
		}
		
		/*
		int wordCount =0;
		
		for (int i = 0; i < words.size(); i++) {
			if(d.findWord(words.get(i).getWord()) != null) {
				wordCount ++;
			}
		}
		*/
		
		//System.out.println(wordCount);
		

		
	}

}
