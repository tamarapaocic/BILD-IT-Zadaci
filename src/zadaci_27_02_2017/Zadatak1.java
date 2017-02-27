package zadaci_27_02_2017;

public class Zadatak1 {
	
	public static void main(String[] args) {
		
		int[][] hours = new int[8][7];
		fillArray(hours);
		int[] employees = { 0, 1, 2, 3, 4, 5, 6, 7 };
		int[] employeeHours = new int[8];

		System.out.println("\t\tMon\tTue\tWed\tThu\tFri\tSat\tSun");
		printArray(hours);
		System.out.println();
		
		//suma sati za svakog zaposlenika
		for (int i = 0; i < hours.length; i++) {
			int sum = 0;
			for (int j = 0; j < hours[i].length; j++) {
				sum += hours[i][j];
			}
			employeeHours[i] = sum;
		}

		//soriranje uposlenika po broju sati
		for (int i = 0; i < employeeHours.length; i++) {
			for (int j = i; j < employeeHours.length; j++) {
				if (employeeHours[i] < employeeHours[j]) {
					int temp = employeeHours[i];
					employeeHours[i] = employeeHours[j];
					employeeHours[j] = temp;

					temp = employees[i];
					employees[i] = employees[j];
					employees[j] = temp;
				}
			}
		}
		System.out.println();
		for(int i = 0; i < employeeHours.length; i++){
			System.out.println("Employee " + employees[i]+ " has worked for " + employeeHours[i] + " hours.");
		}
	}
	
	//metoda za popunjavanje niza sa random brojem sati
	public static void fillArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (1 + Math.random() * 9);
			}
		}
	}

	//metoda za ispis
	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Employee " + i+"\t ");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t ");
			}
			System.out.println();
		}
	}
}
