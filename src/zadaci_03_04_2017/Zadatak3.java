package zadaci_03_04_2017;

public class Zadatak3 {

	public static void main(String[] args) {
		
		System.out.println("\n i    m(i)");
		System.out.println("-----------");
	    for (int i = 1; i <= 10; i++) {
		
	    System.out.printf("%2d%8.2f\n", i, m(i));
	    
				}
			}

			/** Method for computing m(i) */
			private static double m(double i) {
				if (i == 1) // Base case
					return 1; 
				else
					return  1 / i + m(i - 1); // Recursive call
			}
		}