package zadaci_09_03_2017;

public class TestLoan {
         
	public static void main(String[] args) {

		try {
			Loan loan = new Loan(5, 7, 1000);
			
			System.out.printf("Total payment: %2.2f", loan.getTotalPayment());
		} catch (IllegalArgumentException ex) {
			System.out.println("Wrong input");
		}
		

	}

}
