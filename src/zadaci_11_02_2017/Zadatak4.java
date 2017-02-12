package zadaci_11_02_2017;

import java.util.ArrayList;

public class Zadatak4 {

	public static void main(String[] args) {
     // poziv metode
     print();
	}
	
	public static void print(){
		//koliko brojeva zelimo po liniji
		final int perLine = 10; 
		//counter
		int count = 0;
		//prolazi kroz petlju,generise 100 random brojeva i broji ih,kada ima 10 u liniji prelazi u novi red
		for(int i = 0; i <= 100; i++){
			int number = (int)(Math.random() * 100);
			count++;
			System.out.print(number + (count % perLine == 0 ? "\n" : " "));
		}
		//prolazi kroz petlju,generise 100 random uupercase karaktera i nastavlja pomocu brojaca ispisivati
		for(int i = 0; i <= 100; i++){
			char ch = (char)(65 + Math.random() * (91-65));
			count++;
			System.out.print(ch + (count % perLine == 0 ? "\n" : " "));
		}
	}

}
