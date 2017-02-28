package zadaci_28_02_2017;

import java.util.Arrays;

public class Zadatak3Test {

	public static void main(String[] args) {
		
		
		int [] niz = new int[100000];
		Zadatak3 stoperica = new Zadatak3();
		for (int i = 0; i < niz.length; i++){
			niz[i] = (int)(Math.random() * 100000);
		}
		//pokretanje stoperice koja mjeri potrebno vrijeme za selection sort 100000 elemenata niza
		stoperica.start();
		Arrays.sort(niz);
		stoperica.stop();

		System.out.println("Proteklo vrijeme je " + stoperica.getElapsedTime());
			}

		}
