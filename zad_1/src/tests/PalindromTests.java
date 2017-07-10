package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import zad_1.*;

public class PalindromTests {

	@Test
	public void testPallindromCorrect() {

		String correctPall = "Do geese see God?";

		boolean res = PalindromChecker.isPalindrom(correctPall);

		assertTrue(res);
	}

	@Test
	public void testPallindromWrong() {

		String wrongPall = "I am not a palindrom";

		boolean res = PalindromChecker.isPalindrom(wrongPall);

		assertFalse(res);
	}

	@Test(expected = WrongInputException.class)
	public void testEmpty() {

		String emptyPall = "";

		PalindromChecker.isPalindrom(emptyPall);

	}

	@Test
	public void testSingleCorrect() {
		String singlePall = "A";

		boolean res = PalindromChecker.isPalindrom(singlePall);

		assertTrue(res);
		;
	}

	@Test(expected = WrongInputException.class)
	public void testExtraCharactersWrong() {
		String specialPall = "!!!!!! $$$@@#@# $%%///";

		PalindromChecker.isPalindrom(specialPall);

	}

}
