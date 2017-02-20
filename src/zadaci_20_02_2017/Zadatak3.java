package zadaci_20_02_2017;

public class Zadatak3 {

	public static void main(String[] args) {
		
		System.out.println("prime numbers \n"); 
		printPrimeNumbers();
	}
	
	//metoda za printanje prostih brojeva od 2 do 1000
	public static void printPrimeNumbers (){
	int count = 0;
	for(int number = 2; number <= 1000; number++) {
		 if (isPrime(number)) {
			 count++;
			 System.out.print(number + (count % 8 == 0 ? "\n" : " " ));
		 }
       
    }
	}
	//metoda za provjera da li je broj prost
    public static boolean isPrime(int number){
	for (int divisor = 2; divisor <= number / 2; divisor++) { 
		if (number % divisor == 0) {
			return false;
      }
      }
    return true;

	}

}
