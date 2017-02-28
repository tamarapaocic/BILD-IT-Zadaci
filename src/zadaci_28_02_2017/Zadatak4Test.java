package zadaci_28_02_2017;

public class Zadatak4Test {

	public static void main(String[] args) {

		Zadatak4 account = new Zadatak4(1122,20000);

		account.setAnnualInterest(4.5);

		account.withdraw(2500);

		account.deposit(3000);

		System.out.println("Balance " + account.getBalance());

		System.out.println("MonthlyInterest " + account.getMonthlyInterest());

		System.out.println("Date " + account.getDate());
		
			}

		}
