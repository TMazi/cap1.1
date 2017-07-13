package zad_1;

/**
 * 
 * @author TMAZUREK
 * Class responsible for deleting special characters
 * from text string, used to check palindroms
 */

public class InputCleaner {
	
	/**
	 * 
	 * @param text
	 * @return string aftere delete of special characters and blank spaces
	 * @throws WrongInputException when text after cleaning is empty, means
	 * it contains only special characters
	 */
	
	public static String clean(String text) throws WrongInputException {
		String cleanedtext = text.toLowerCase().replaceAll("[^a-z]", "");
		if (cleanedtext.length() < 1)
			throw new WrongInputException("Niepoprawny tekst! (" + text + ")");
		return cleanedtext;
	}

}
