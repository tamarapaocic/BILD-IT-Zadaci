package zadaci_17_02_2017;

public class Zadatak2 {

	public static void main(String[] args) {
		
		int count = 0;
		for(int i = 3; i < 10000; i++){
			boolean bothPrime = true;
			for(int j = 2; j < i; j++){
				if((i % j == 0) || ( (i+2) % j == 0)){
					bothPrime = false;
					break;
				}
			}
			
			if(bothPrime){
				System.out.printf("(%4d,%-4d) ",i,(i+2));
				count++;
				if(count % 10 == 0){
					System.out.println();
				}
			}
		}
	}

}