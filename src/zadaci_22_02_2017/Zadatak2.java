package zadaci_22_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite 0 (makaze), 1 (papir) ili 2 (bunar)");
		int racunar = (int)(Math.random() * 3);
        
		int unos = -1;
		try{ 
		unos = sc.nextInt();
		while (unos < 0 || unos > 2){
			System.out.println("Unesite 0 (makaze), 1 (papir) ili 2 (bunar)");
            unos = sc.nextInt();
		}
		} catch(InputMismatchException e){
			System.out.println("Pogresan unos.");
		}

		if (unos == racunar){
		switch (racunar){
		case 0: System.out.println("Izabrali ste makaze. Racunar je izabrao makaze. Nerijeseno.");break;
		case 1: System.out.println("Izabrali ste papir. Racunar je izabrao papir. Nerijeseno.");break;
		case 2: System.out.println("Izabrali ste bunar. Racunar je izabrao bunar. Nerijeseno.");break;
		}
		}
		else {
			switch (unos) {
			case 0: 
				if (racunar == 1){
					System.out.println("Izabrali ste makaze. Racunar je izabrao papir. Pobijedili ste");}
				else if (racunar == 2){
					System.out.println("Izabrali ste makaze. Racunar je izabrao bunar. Racunar je pobijedio");
					break;}
			case 1:
				if (racunar == 0){
					System.out.println("Izabrali ste papir. Racunar je izabrao makaze. Racunar je pobijedio");
				}
				else if (racunar == 2)
				{
					System.out.println("Izabrali ste papir. Racunar je izabrao bunar. Pobijedili ste");
				break;}
			case 2:
				if (racunar == 0){
					System.out.println("Izabrali ste bunar. Racunar je izabrao makaze. Pobijedili ste.");
				}
				else if (racunar == 1){
					System.out.println("Izabrali ste bunar. Racunar je izabrao papir. Racunar je pobijedio");
				break;}
				}
				}

			}
			
		}

			


