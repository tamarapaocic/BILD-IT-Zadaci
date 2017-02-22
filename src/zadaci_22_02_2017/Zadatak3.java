package zadaci_22_02_2017;

public class Zadatak3 {

	public static void main(String[] args) {
		double sum = 0;
		for (double i = 1; i <= 97; i+=2){
			sum += i/(i+2);
		}
		System.out.println("Suma je " + sum);
	}

}
