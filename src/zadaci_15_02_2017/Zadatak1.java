package zadaci_15_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		boolean tacno = false;
		try{
		Scanner unos = new Scanner(System.in);

		int broj1 = (int)(Math.random() * 100);
		int broj2 = (int)(Math.random() * 100);
		int broj3 = (int)(Math.random() * 10);

		System.out.println("Koliko iznosi suma " + broj1 + " + "+ + broj2 + " + " + broj3);
			
		int korisnikovaSuma = unos.nextInt();

		int rezultat = broj1 + broj2 + broj3;
		
        //sve dok nije tacno,program ponavlja korisniku da pokusa ponovo
		while (!tacno){
			System.out.println("Odgovor nije tacan, pokusajte ponovo: ");
			korisnikovaSuma = unos.nextInt();
			//ako je odgovor tacan zavrsava sa radom
			if (korisnikovaSuma == rezultat){
				System.out.println("Odgovor je tacan.Cestitamo! ");
				tacno = true;
				break;
			}
		}
	} catch(InputMismatchException e){
		System.out.println("Pogresan unos.");
		}
		}
        }