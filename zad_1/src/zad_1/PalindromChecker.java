package zad_1;

/**
 * 
 * @author TMAZUREK
 * Class responsible for checking, if input text
 * is an palindrom
 */

public class PalindromChecker {
	
	/**
	 * Method checking, if input text is and palindrom
	 * @param text - potential palindrom
	 * @return true when it is palindrom, false when it's not
	 */

	public static boolean isPalindrom(String text) {
		String _text;
		try {
			_text = InputCleaner.clean(text);
		} catch (WrongInputException e) {
			throw e;
		}
		return isPall(_text);

	}

	private static boolean isPall(String text) {

		if (text.length() < 2)
			return true;
		if (text.toCharArray()[0] == text.toCharArray()[text.length() - 1]) {
			return isPall(text.substring(1, text.length() - 1));
		}
		return false;
	}

}
