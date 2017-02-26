package zadaci_23_02_2017;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite Social Security broj u formatu DDD-DD-DDDD");
		
		String broj = "";
		
		//provjera da li uneseni broj odgovara odredjenom formatu tj da li je validan,ako nije trazi od korisnika da unese ponovo
		while (!broj.matches("\\d {3}-\\d{2}-\\d{4}")) {

			broj = unos.nextLine();

			if (!broj.matches("\\d{3}-\\d{2}-\\d{4}")) {
				System.out.println("Unos se ne poklapa sa formatom  DDD-DD-DDDD! Pokusajte ponovo:");
			}
			
			else if (broj.matches("\\d{3}-\\d{2}-\\d{4}")) {
				System.out.println("Unijeli ste ispravan Social Security Number.");
				break;
			}

		}

		unos.close();
	}
	}