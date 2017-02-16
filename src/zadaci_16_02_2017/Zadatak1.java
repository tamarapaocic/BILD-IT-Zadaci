package zadaci_16_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		try{ 
			Scanner sc = new Scanner(System.in);
			int danasnjiDan = 0;
            int brNakonDanas = 0;
            //radi dok se ne unese broj od 0 do 6
	    do {
		    System.out.println("Unesite broj od 0 do 6 za danasnji dan: ");
		    danasnjiDan = sc.nextInt();
			 } while ((danasnjiDan < 0) || (danasnjiDan > 6));
		    //radi dok se ne unese pozitivan broj
		do {
			System.out.print("Unesite broj dana koji su prosli od danas : ");
		    brNakonDanas = sc.nextInt();
		} while(brNakonDanas < 0);

		int buduciDan = (danasnjiDan + brNakonDanas) % 7;

		switch(danasnjiDan){
		case 0: System.out.println("Danas je nedelja");break;
		case 1: System.out.println("Danas je ponedeljak");break;
		case 2: System.out.println("Danas je utorak");break;
		case 3: System.out.println("Danas je srijeda");break;
		case 4: System.out.println("Danas je cetvrtak");break;
		case 5: System.out.println("Danas je petak");break;
		case 6: System.out.println("Danas je subota");break;

		}
		switch(buduciDan){
		case 0: System.out.println("Buduci dan je nedelja");break;
		case 1: System.out.println("Buduci dan je ponedeljak");break;
		case 2: System.out.println("Buduci dan je utorak");break;
		case 3: System.out.println("Buduci dan je srijeda");break;
		case 4: System.out.println("Buduci dan je cetvrtak");break;
		case 5: System.out.println("Buduci dan je petak");break;
		case 6: System.out.println("Buduci dan je subota");break;
		}

		}catch(InputMismatchException e){
			System.out.println("Pogresan unos. Pokusajte ponovo.");
		}
	}

		}
