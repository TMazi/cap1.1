package zad_1;

public class PalindromChecker {

	public static boolean isPalindrom(String text) {
		String _text;
		try {
			_text = InputCleaner.clean(text);
		} catch (WrongInputException e) {
			System.out.println(e.getMessage());
			throw e;
		}
		return isPall(_text);

	}

	private static boolean isPall(String text) {

		if (text.length() < 2)
			return true;
		if (text.toCharArray()[0] == text.toCharArray()[text.length() - 1]) {
			return isPalindrom(text.substring(1, text.length() - 1));
		}
		return false;
	}

}
