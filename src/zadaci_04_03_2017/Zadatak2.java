package zadaci_04_03_2017;

import java.math.BigInteger;

public class Zadatak2 {

	public static void main(String[] args) {
		
	   String squareRootOfMaxLong = (long) Math.ceil(Math.sqrt(Long.MAX_VALUE)) + "";
				
	   //broj koji ima vrijednost korijena od Long.MaLong.MAX_VALUE
	   BigInteger number = new BigInteger(squareRootOfMaxLong);
	   int count = 0;

	   System.out.println("Square numbers greater than " + Long.MAX_VALUE);
	   while (count < 10) {

	   BigInteger numberSquared = number.multiply(number);

	   System.out.println(count + ". " + numberSquared);
	   count++;
        
		//povecanje broja
		number = number.add(BigInteger.ONE);
		
				}
			}

		}