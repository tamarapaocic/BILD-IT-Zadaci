package zadaci_03_03_2017;

public class StackOfIntegers {

	private int[] integers;
	private int size;

	public StackOfIntegers() {
		integers = new int[16];
	}

	public StackOfIntegers(int capacity) {
		integers = new int[capacity];
	}

	// metoda vraca true ako je stack prazan
	public boolean isEmpty() {
		return size == 0;
	}

	// metoda vraca posljednji element u stack-u
	public int peek() {
		return integers[size - 1];
	}

	// metoda koja ubacuje neku vrijednost na zadnje mjesto
	public void push(int value) {
		if (size >= integers.length) {
			int[] temp = new int[integers.length * 2];
			System.arraycopy(integers, 0, temp, 0, integers.length);
			integers = temp;
		}
		integers[size++] = value;
	}

	// metoda koja uklanja i vraca zadnji element u stack-u
	public int pop() {
		return integers[--size];
	}

	public int getSize() {
		return size;
	}

	public int getElement(int index) {
		return integers[index];
	}

}
