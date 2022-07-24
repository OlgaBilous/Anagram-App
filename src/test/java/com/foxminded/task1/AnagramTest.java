package com.foxminded.task1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnagramTest {

	@Test
	void reverseWord_shouldReturnIllegalArgumentException_whenInputStringEqualsNull() {
		assertThrows(IllegalArgumentException.class, () -> Anagram.reverseWord(null), "reverse null should throw");
	}

	@Test
	void reverseWord_shouldReturnEmptyString_whenInputStringIsEmpty() {
		String expected = "";
		String actual = Anagram.reverseWord("");
		assertSame(expected, actual);
	}
	
	void reverseWord_shouldReturnEmptySpace_whenInputStringContainsEmptySpace() {
		String expected = " ";
		String actual = Anagram.reverseWord(" ");
		assertEquals(expected, actual);
	}
	
	@Test
	void reverseWord_shouldReturnSameAmountOfSpaces_whenInputStringContainsOnlySpaces() {
		String expected = "   ";
		String actual = Anagram.reverseWord("   ");
		assertEquals(expected, actual);
	}
	
	@Test
	void reverseWord_shouldReturnSameSingleCharacter_whenInputStringContainsSingleCharacter() {
		String expected = "a";
		String actual = Anagram.reverseWord("a");
		assertEquals(expected, actual);
	}
	
	@Test
	void reverseWord_shouldReturnSameAmountOfSameLetters_whenInputStringContainsMultipleSameLetter() {
		String expected = "aaaa";
		String actual = Anagram.reverseWord("aaaa");
		assertEquals(expected, actual);
	}
	
	@Test
	void reverseWord_shouldReturnReversedLayoutOfTheSameCharacterInLowerAndUpperCasesMixed_whenInputStringContainsTheSameCharacterInLowerAndUpperCasesMixed() {
		String expected = "AaAAa";
		String actual = Anagram.reverseWord("aAAaA");
		assertEquals(expected, actual);
	}

	@Test
	void reverseWord_shouldReturnReversedLayoutOfDifferentLetters_whenInputStringContainsAWordWithDifferentLetters() {
		String expected = "Word";
		String actual = Anagram.reverseWord("droW");
		assertEquals(expected, actual);
	}
	
	@Test
	void reverseWord_shouldReturnTheSameLayoutOfSymbols_whenInputStringContainsOnlySymbols() {
		String expected = "@#$%";
		String actual = Anagram.reverseWord("@#$%");
		assertEquals(expected, actual);
	}
	
	@Test
	void reverseWord_shouldReturnReversedInputWithoutAffectingSpaces_whenInputStringContainsTwoOrMoreWordsWithSpacesBetween() {
		String expected = "Hello java";
		String actual = Anagram.reverseWord("avajo lleH");
		assertEquals(expected, actual);
	}
	
	

	@Test
	void reverseText_shouldReturnIllegalArgumentException_whenInputStringEqualsNull() {
		assertThrows(IllegalArgumentException.class, () -> Anagram.reverseText(null), "reverse null should throw");
	}
	
	@Test
	void reverseText_shouldReturnSplitedInputIntoWordsWithReversedEachWordWithoutAffectingSpaces_whenInputStringContainsTwoOrMoreWordsWithSpacesBetween() {
		String expected = "Hello java";
		String actual = Anagram.reverseText("olleH avaj");
		assertEquals(expected, actual);
	}

	@Test
	void reverseText_shouldReturnSplitedInputIntoWordsWithReversedEachWordWithoutAffectingSpacesAndSpecialCharacters_whenInputStringContainsTwoOrMoreWordsWithSpacesBetweenAndSpecialCharacters() {
		String expected = "ol22le3456H 23avaj67!";
		String actual = Anagram.reverseText("He22ll3456o 23java67!");
		assertEquals(expected, actual);
	}

}
