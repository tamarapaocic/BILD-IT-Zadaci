package zadaci_21_02_2017;

public class Zadatak3 {
    //metoda koja provjerava da li je broj prost
	public static boolean isPrime(int broj) {
		if (broj == 0 || broj == 1) {
			return false;
		}
		for (int djelilac = 2; djelilac <= broj/2; djelilac++) {
			if (broj % djelilac == 0) { 
				return false; } }
		return true; }
	
	//metoda za okretanje broja naopako
    public static int obrnuto(int broj) {
			String obrnuto = ""; 	
			String n = broj + ""; 
			
			for (int i = n.length() - 1; i >= 0; i--) {
				obrnuto += n.charAt(i); }
			return Integer.parseInt(obrnuto); }
    
    //provjera da li je broj palindrom
    public static boolean Palindrom(int broj) {
		return broj == obrnuto(broj) ? true : false; }

    //provjera da li je nepalindromski prosti broj koji je prosti broj i kada ispišemo naopako
    public static boolean Emirp(int broj) {
		return isPrime(broj) && !Palindrom(broj) && isPrime(obrnuto(broj)); }
    
	public static void main(String[] args) {
	
		int count = 0; 
		int n = 2; 
        //ispis prvih 100 emirp brojeva
		while (count < 100) {
			if (Emirp(n)) {
				count++; 
				System.out.print(count % 10 == 0 ? n + "\n" : n + " "); }
			n++; } }
	}


