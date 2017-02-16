package zadaci_16_02_2017;

public class Zadatak3 {

	public static void main(String[] args) {
	    
		int count = 0;
		for (int i = 100; i <= 1000; i++ ){
			if ((i % 6 == 0) && (i % 5 ==0))
			{ count++;
			System.out.print(i + (count % 10 == 0 ? "\n" : " "));}
		}
			}

		}
