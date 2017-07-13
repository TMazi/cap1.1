package zad_1;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	private static Scanner scan;

	public static void main(String[] args) throws IOException {
		//TODO odwrocic finished na continuos
		boolean continues = true;
		scan = new Scanner(System.in);
		System.out.println("Sprawdzmy jakies palindromy?");
		String pall, decide;
		while (continues) {
			System.out.println("Podaj palindrom");
			pall = scan.nextLine();

			try {
				if (PalindromChecker.isPalindrom(pall))
					System.out.println("Palindrom!");
				else
					System.out.println("Nie jest palindromem!");
			} catch (WrongInputException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Wpisz 'y' aby kontynuowac, lub dowolny znak aby zakonczyc");
			decide = scan.nextLine();
			if (!decide.equals("y")) {
				continues = false;
				System.out.println("PA PA!");
			} 
		}

	}
}
