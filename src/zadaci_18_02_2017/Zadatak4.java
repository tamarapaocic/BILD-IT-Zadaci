package zadaci_18_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long minutes = 0;
		boolean wrongUserInput = true;

		while (wrongUserInput) {
			try {
				System.out.print("Unesite broj minuta: ");
				minutes = sc.nextLong();

				wrongUserInput = false;

				if (minutes < 0) {
					System.out.println("Pogresan unos. Morate unijeti cijeli broj veci od 0.");
					wrongUserInput = true;
				}
			} catch (InputMismatchException ex) {
				System.out.println("Pogresan unos. Morate unijeti cijeli broj kao long.");
				sc.nextLine();
			}
		}

		//ukupan broj minuta u godini
		long numberOfMinutesInAYear = 365 * 1440;

		//broj godina
		long totalYears = minutes / numberOfMinutesInAYear;

		//broj dana
		long totalDays = (minutes % numberOfMinutesInAYear) / 1440;

		System.out.println(minutes + " minuta je " + totalYears + " godina i " + totalDays + " dana.");
	}

}
