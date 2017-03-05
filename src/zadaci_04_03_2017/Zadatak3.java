package zadaci_04_03_2017;

import java.math.BigInteger;

public class Zadatak3 {
	public static void main(String[] args) {

		BigInteger number = new BigInteger(Long.MAX_VALUE + "");
		int count = 0; 
		final int NUMBER_OF_PRIMES = 5;
		number = number.add(new BigInteger("1"));

		System.out.println();
		while (count < NUMBER_OF_PRIMES) {
				if (isPrime(number)){
					count++;
					System.out.println(number);
				}
				number = number.add(BigInteger.ONE);
			}
		}

		/** Return true ako je broj prime */
	public static boolean isPrime(BigInteger num) {
		BigInteger j = new BigInteger("2");
		for (BigInteger i = j;i.compareTo(num.divide(new BigInteger("2")))<=0 ; i = i.add(BigInteger.ONE)) {
			if (num.remainder(i).equals(BigInteger.ZERO))
				return false;
		}

		return true;
	}
}