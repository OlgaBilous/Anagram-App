package com.foxminded.task1;

public final class Anagram{	
	
	private Anagram() {
	} 
		
	public static String reverseWord(String word) {
		if(word == null) {
			throw new IllegalArgumentException("word may not be null");
		} 
		if(word.isEmpty()) {
			return word;
		}
		
        char[] chars = word.toCharArray();    
        int leftIndex = 0;
        int rightIndex = chars.length - 1;
        
		while (leftIndex < rightIndex) {
            
			if(!Character.isAlphabetic(chars[rightIndex])) {
				rightIndex--;
			}else if(!Character.isAlphabetic(chars[leftIndex])) {
				leftIndex++;
				
			} else {
				char temporary = chars[leftIndex];
				chars[leftIndex] = chars[rightIndex];
				chars[rightIndex] = temporary;				
				leftIndex++;
				rightIndex--;
			}

		}
		return String.valueOf(chars);
	}
	
	public static String reverseText(String text) {
		
		if(text == null) {
			throw new IllegalArgumentException("text may not be null");
		} 
		String [] words = text.split(" ");
		StringBuilder reversed = new StringBuilder();
		
		for (int i = 0; i < words.length; i++) {	
			reversed.append(reverseWord(words[i]));
			if (i < words.length - 1) {
				reversed.append(" ");
		    }
	    }	
		return reversed.toString();
    } 
} 
