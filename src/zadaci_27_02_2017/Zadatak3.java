package zadaci_27_02_2017;

public class Zadatak3 {

	public static void main(String[] args) {
    
		int[][] matrix = new int[4][4];
		
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
		System.out.println("The largest row index is " + LargestRow(matrix));
		System.out.println("The largest column index is " + LargestColumn(matrix));
	    }
		
	    //metoda za nalazenje indexa najveceg reda
		public static int LargestRow (int[][] matrix){
			
			int max = 0;
			int maxRowIndex = 0;
			
	    for(int row = 0; row < matrix.length; row++){
		int count = 0;
		for(int column = 0; column < matrix[row].length; column++){
         if (matrix[row][column] == 1){
        	 count++;
         }
         if (count > max){
        	 max = count;
        	 maxRowIndex = row;
         }
		}
	       }
         return maxRowIndex;
              }
		
		//metoda za nalazenje indexa najvece kolone
		public static int LargestColumn (int[][] matrix){
			
			int max = 0;
			int maxColumnIndex = 0;
			
			for(int column = 0; column < matrix[0].length; column++){
		    int count2 = 0;
		   for(int row = 0; row < matrix.length; row++){
            if (matrix[row][column] == 1){
        	 count2++;
         }
            if (count2 > max){
        	 max = count2;
        	 maxColumnIndex = column;
         }
		}
	}
         return maxColumnIndex;
         }
}