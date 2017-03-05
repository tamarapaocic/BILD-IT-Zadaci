package zadaci_04_03_2017;

import java.math.BigInteger;

public class Zadatak1 {

	public static void main(String[] args) {
		
		String first50Dig = "1";
		
		for(int i = 1; i < 50; i++){
		first50Dig += "0";
			}
				
		BigInteger number = new BigInteger(first50Dig);
		BigInteger two = new BigInteger("2");
		BigInteger three = new BigInteger("3");
				
		int count =1;
		while(count<=10){
		if(number.mod(two).equals(BigInteger.ZERO) || number.mod(three).equals(BigInteger.ZERO) ) {
			System.out.println(count+". "+number);
		    count++;
					}
		number = number.add(BigInteger.ONE);
					
				}
			}

		}