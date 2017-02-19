package mini_projekat_2;

public class Craps {

	public static void main(String[] args) {
		
		int point = rollTwoDices();
		
		if ((point == 7) || (point == 11)){
			System.out.println("You win.");
		}
		else if ((point == 2) || (point == 3) || (point == 11)){
			System.out.println("You lose.");
		}
		else{ 
			System.out.println("Point is " + point);

			boolean rollAgain = true;

			while (rollAgain) {
				try{
					Thread.sleep(1000);
				    System.out.println("Rolling again...");
				} catch(Exception e){
				}
				
				// pozivamo metodu koja simulira bacanje kockica
				int newSum = rollTwoDices();

				if (newSum == 7) {
					// ako je zbir ponovljenih kockica 7, korisnik gubi
					System.out.println("You lose");
					rollAgain = false;
				} else if (newSum == point) {
					// ako je zbir ponovljenih kockica jednak pocetnom zbiru, korisnik pobjedjuje
					System.out.println("You win");
					rollAgain = false;
				}
			}
		}
		}
	
	//metoda za random bacanje kockice(1-6)
	public static int roll(){
		int kocka = (int)(1 + Math.random() * 6);
		return kocka;
	}
	
	//vraca zbir bacenih kockica i ispisuje  
	public static int rollTwoDices(){
		int kocka1 = roll();
		int kocka2 = roll();
		
		int suma = kocka1 + kocka2;
		try{
			Thread.sleep(700);
		
		System.out.println("You rolled " + kocka1 + " + " + kocka2 + " = " + suma);}catch(Exception e){}
		return suma;
	}

}
