package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import zad_1.*;

public class PalindromCheckerTests {

	@Test
	public void shoulPallindromBeCorrect() {

		String correctPall = "Do geese see God?";

		boolean res = PalindromChecker.isPalindrom(correctPall);

		assertTrue(res);
	}

	@Test
	public void shouldPallindromBeWrong() {

		String wrongPall = "I am not a palindrom";

		boolean res = PalindromChecker.isPalindrom(wrongPall);

		assertFalse(res);
	}
	

	@Test(expected = WrongInputException.class)
	public void emptyInputShouldThrowExc() {

		String emptyPall = "";

		PalindromChecker.isPalindrom(emptyPall);

	}

	@Test
	public void singleInputShouldBeCorrect() {
		String singlePall = "A";

		boolean res = PalindromChecker.isPalindrom(singlePall);

		assertTrue(res);

	}

	@Test(expected = WrongInputException.class)
	public void onlyExtraCharactersShouldThrowExc() {
		String specialPall = "!!!!!! $$$@@#@# $%%///";

		PalindromChecker.isPalindrom(specialPall);

	}

}
