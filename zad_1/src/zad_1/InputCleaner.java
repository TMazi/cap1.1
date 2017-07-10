package zad_1;

public class InputCleaner {
	
	public static String clean(String text) throws WrongInputException {
		String _text = text.toLowerCase().replaceAll("[^a-zA-Z]", "");
		if (_text.length() < 1)
			throw new WrongInputException("Niepoprawny tekst!");
		return _text;
	}

}
