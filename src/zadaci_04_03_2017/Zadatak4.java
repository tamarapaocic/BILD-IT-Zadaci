package zadaci_04_03_2017;

import java.math.BigInteger;

public class Zadatak4 {

	public static void main(String[] args) {
		
		BigInteger two = new BigInteger("2");
		System.out.println("p\tp^2-1");
		System.out.println("-------------------");
		
		for (int i = 0; i <= 100; i++) {
			BigInteger number = two.pow(i);//varijabla sa vrijednoscu 2^i
			BigInteger marsennePrime=number.subtract(BigInteger.ONE);//potencijalni mersenne prime (2^i - 1)
			if (marsennePrime.isProbablePrime(1)) {
				System.out.println(i+"\t"+marsennePrime);
			}
		}
	}
}