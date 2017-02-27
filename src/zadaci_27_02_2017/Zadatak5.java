package zadaci_27_02_2017;

public class Zadatak5 {

	public static void main(String[] args) {
		
        int[][] matrix = new int[6][6];
		
		for(int row = 0; row < matrix.length; row++){
			for(int column = 0; column < matrix[row].length; column++){
			matrix[row][column] = (int)( Math.random() * 2);
		}
	}
		for(int row = 0; row < matrix.length; row++){
			for(int column = 0; column < matrix[row].length; column++){
				System.out.print(matrix[row][column] + " ");
	        }
			System.out.println();
	    }
		System.out.println("Every row" + ((RowsEven(matrix) ? " does " : " does not ") + "have an even number of 1s"));
		System.out.println("Every column" + ((ColumnsEven(matrix) ? " does " : " does not ") + "have an even number of 1s"));
	}
	
	   //metoda koja vraca true ako redovi imaju paran broj jedinica
		public static boolean RowsEven(int[][] m){
			int count = 0;
			
			for(int i = 0; i < m.length; i++){
				for(int j = 0; j < m[i].length; j++){
					if (m[i][j] == 1)
						count++;}
					if(count % 2 != 0) return false;
					}
				return true;
			}
		
		//metoda koja vraca ture ako kolone imaju paran broj jedinica
		public static boolean ColumnsEven(int[][] m){
			int count2 = 0;
			
			for(int i = 0; i < m.length; i++){
				for(int j = 0; j < m[i].length; j++){
					if (m[j][i] == 1)
						count2++;}
					if(count2 % 2 != 0) return false;
					}
				  return true;
			}
		}
