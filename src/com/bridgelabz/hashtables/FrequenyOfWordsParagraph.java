package com.bridgelabz.hashtables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * Find frequency of words large paragraph
 */
public class FrequenyOfWordsParagraph {

	public static void main(String[] args) {
		
		String sentence = "Paranoids are not paranoid because \r\n"
				+ "they are paranoid but because \r\n"
				+ "they keep putting themselves deliberately \r\n"
				+ "into paranoid avoidable situations";
		String[] split = sentence.split(" ");
		
		Map<String, Integer> myMapNode = new HashMap<String, Integer>();
		
		for(String print : split) {
			String word = print.toLowerCase();
			if(myMapNode.containsKey(word)) {
				int count = myMapNode.get(word);
				myMapNode.put(word, count + 1);
			}else {
				myMapNode.put(word, 1);
			}
		}
		
		//printing
		int index = 0;
		for (Map.Entry<String, Integer> display : myMapNode.entrySet()) {
			String result = display.getKey() + ":" + display.getValue();
			System.out.println(result + ", Index is: " + index++);
			
		}

	}

}
