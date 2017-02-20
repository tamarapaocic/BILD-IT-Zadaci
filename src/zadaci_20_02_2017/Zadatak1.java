package zadaci_20_02_2017;

public class Zadatak1 {

	public static void main(String[] args) {
		
		//generise uppercase karaktere
		for(int i = 0; i < 3; i++){
			System.out.print((char)(65 + Math.random() * (90-65)));
		}
		System.out.print("-");
		
		//generise brojeve
		for(int i = 0; i < 3; i++){
			System.out.print((int)(Math.random() * 10));
		}

	}

}
