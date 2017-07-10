package zad_1;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	private static Scanner scan;

	public static void main(String[] args) throws IOException {
		scan = new Scanner(System.in);
		System.out.println("Sprawdzmy jakies palindromy?");
		String pall;
		while (true) {
			System.out.println("Podaj palindrom");
			pall = scan.nextLine();
			try {
				if (PalindromChecker.isPalindrom(pall))
					System.out.println("Palindrom!");
				else
					System.out.println("Nie jest palindromem!");
			} catch (WrongInputException e) {
				
			}

		}
	}

}
