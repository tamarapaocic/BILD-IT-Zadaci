package zadaci_04_03_2017;

import java.math.BigInteger;

public class Zadatak5 {

	public static void main(String[] args) {
		
		BigInteger number = new BigInteger(""+Long.MAX_VALUE);//big integer koji ima vrijednost Long.MAX_VALUE
		BigInteger five = new BigInteger("5");//big integer sa vrijednoscu 5
		BigInteger six = new BigInteger("6");//big integer sa vrijednoscu 6
		int count = 0;
		
		System.out.println("Numbers greater than "+Long.MAX_VALUE+" divisible by 5 or 6: ");
		
		while(count<10){
			//ako je djeljiv sa 5 ili 6, ispis broj
			if(number.mod(five).equals(BigInteger.ZERO) || number.mod(six).equals(BigInteger.ZERO)){
				System.out.println(number);
				count++;
			}
			number = number.add(BigInteger.ONE);
		}
	}

}