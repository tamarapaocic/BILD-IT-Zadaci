package zadaci_08_02_2017;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		//Novi scanner objekat
		Scanner sc = new Scanner(System.in);
        System.out.println("Unesite prvi broj");
        //Unos prvog broja
        int br1 = sc.nextInt();
        System.out.println("Unesite drugi broj");
        //Unos drugog broja
        int br2 = sc.nextInt();
        //Ispis nzd
        System.out.println("Najveci zajednicki djelilac za " + br1 +  " i " + br2 + " je " + nzd(br1, br2)); 
        
        }
	   
	    //metoda za pronalazak najveceg zajednickog djelioca
	public static int nzd (int br1,int br2){
		
		int nzd = 1; //pocetni nzd
		int k = 2; //moguci nzd
		
		while ((k <= br1) && (k <= br2)){
			if (br1 % k == 0 && br2 % k == 0)
				nzd = k; //novi nzd
			k++; //sljedeci moguci nzd
		}
		return nzd; //vracanje najveceg
	}
	}

