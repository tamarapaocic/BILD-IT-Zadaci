package zadaci_03_03_2017;

public class Zadatak5 {

	public static void main(String[] args) {
		
		StackOfIntegers stack = new StackOfIntegers();

		for (int i = 2; i < 120; i++) {
			if (isPrime(i))
				stack.push(i);
		}

		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
		System.out.println();
	}

	public static boolean isPrime(int n) {
		for (int d = 2; d <= n / 2; d++) {
			if (n % d == 0) 
				return false;
		}
		return true;
	}
}