package zadaci_21_02_2017;

public class Zadatak4 {

	public static void main(String[] args) {

		int i = 0;
		int count = 0;
		//ispis prvih 100 palindrom prime brojeva
		while (count < 100) {
			if (isPrime(i) && isPalindrome(i)) {
				count++;
				System.out.print(count % 10 == 0 ? i + "\n" : i + " "); }
			i++;
		}
	}
    //provjera da li je broj prost
	public static boolean isPrime(int broj) {
		if (broj == 0 || broj == 1) {
			return false;
		}
		for (int djelilac = 2; djelilac <= broj/2; djelilac++) {
			if (broj % djelilac == 0) { 
				return false; } }
		return true; 
		}
	
   //metoda za okretanje broja naopako
	 public static int obrnuto(int broj) {
			String obrnuto = ""; 	
			String n = broj + ""; 
			
			for (int i = n.length() - 1; i >= 0; i--) {
				obrnuto += n.charAt(i); }
			return Integer.parseInt(obrnuto); }
	 
    //provjera da li je broj isti kada se okrene naopako tj da li je palindrom
	public static boolean isPalindrome(int broj) {
		return broj == obrnuto(broj);
	}
}
