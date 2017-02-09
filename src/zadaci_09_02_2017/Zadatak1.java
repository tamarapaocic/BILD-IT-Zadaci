package zadaci_09_02_2017;

public class Zadatak1 {

	public static void main(String[] args) {
		
        int count = 0; //brojac

		for (int i = 101; i <= 2100; i++){ //petlja od 101 do 2100 godine
		if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)){ //ispitivanje da li je prestupna
			count++; //ako jeste povecati brojac
			System.out.printf(i + (count % 10 == 0 ? "\n" : " ")); //ispis prestupne godine,10 po redu
		}
		}
		System.out.println("Number of leap years " + count); //ukupan broj prestupnih godina
	}
}
