package com.foxminded.task1;
import java.util.Scanner;

public class AnagramApp implements AutoCloseable{

	public static void main(String[] args){	
		
	    try(Scanner scanner = new Scanner(System.in);){
	    	System.out.print("Enter word: ");
			String input = scanner.nextLine();
			
			System.out.print("Enter text: ");
			String input2 = scanner.nextLine();
			
			String reversed = Anagram.reverseWord(input);
			System.out.println("Reversed word: " + reversed);
			
			String reversed2 = Anagram.reverseText(input2);
			System.out.print("Reversed String: " + reversed2);
	    }
		
	}

	@Override
	public void close() throws Exception {
		System.out.println("Closed");
	}
}
