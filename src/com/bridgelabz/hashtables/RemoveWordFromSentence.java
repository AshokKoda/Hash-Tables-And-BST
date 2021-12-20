package com.bridgelabz.hashtables;

/*
 * Remove the word
 */
public class RemoveWordFromSentence {
	
	//REmove method
	public static void removeWord(String str, String word) {
		
		//Split sentence
		String split[] = str.split(" ");
		String s = "";
		
		//taking for loop
		for (String words : split) {
			//Check word is found or not
			if (!words.equals(word)){
				s += words + " "; //Concate the word not equal to the given word
			}
		}
		System.out.print(s);
	}

	public static void main(String[] args) {

		String str = "Paranoids are not paranoid because \r\n"
				+ "they are paranoid but because \r\n"
				+ "they keep putting themselves deliberately \r\n"
				+ "into paranoid avoidable situations";
		
		String word = "avoidable";
		removeWord(str, word);
	}

}
