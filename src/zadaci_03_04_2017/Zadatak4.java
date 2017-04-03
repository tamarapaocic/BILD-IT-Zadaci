package zadaci_03_04_2017;

public class Zadatak4 {

	public static void main(String[] args) {
		
		// Display m(i) for i = 1 - 10
		System.out.println("\n i    m(i)");
		System.out.println("-----------");
		for (int i = 1; i <= 10; i++) {
		System.out.printf("%2d%8.2f\n", i, m(i));
		
				}
			}

		/** Method for computing m(i) */
		private static double m(double i) {
			if (i == 0) // Base case
				return 0;
			else
				return i / (2 * i + 1) + m(i - 1); // Recursive call
			}
		}