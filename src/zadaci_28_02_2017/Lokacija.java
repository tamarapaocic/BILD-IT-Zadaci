package zadaci_28_02_2017;

public class Lokacija {

	int red;
	int kolona;
	double max;
	
	Lokacija(double[][] a){
		max = a[0][0];
		red = 0;
		kolona = 0;
		
		//trazenje max elementa
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
					red = i;
					kolona = j;
				}
			}
		}
	}
}
	

