package zadaci_15_02_2017;

public class Zadatak4 {

	public static void main(String[] args) {
		
		System.out.println("savršeni brojevi u rasponu od 0 do 10.000");
		
		for (int i = 1; i < 10000; i++) {
	
			int sum = 0;
			
			for (int djelilac = 1; djelilac < i; djelilac++) {
				// ako je i djeljiv sa djelilcem
				if (i % djelilac == 0) {
					// dodajemo na sumu
					sum += djelilac;
				}
			}
			// ako je suma jednaka i onda je savrsen broj
			if (sum == i) {
				System.out.println(i);
			}
		   }
	     }
       }