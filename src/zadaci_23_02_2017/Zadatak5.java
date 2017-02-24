package zadaci_23_02_2017;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
	
		int i, j;
		System.out.println("Unesite broj");
		Scanner unos = new Scanner(System.in);
		int broj = unos.nextInt();

		for (i = 1 ; i <= broj ; i++){
			
			for(j = broj - 1 ; j >= i ; j--) {
				System.out.printf("%3s"," ");}
			for (int k=i ; k >0 ; k--){
				System.out.printf("%3d",k);
			}
			
			for (int m = 2; m <= i; m++){
				System.out.printf("%3d",m);
			}
			System.out.println();
		}


			}

		}