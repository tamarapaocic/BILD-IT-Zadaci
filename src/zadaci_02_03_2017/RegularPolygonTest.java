package zadaci_02_03_2017;

public class RegularPolygonTest {

	public static void main(String[] args) {

		//kreiranje nova 3 objekta
		RegularPolygon regularPolygon1 = new RegularPolygon();
		RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
		RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

		System.out.println("| Regular Polygon Objects |  Perimeter  |  Area  |");
		System.out.println("--------------------------------------------------");
		System.out.printf( "|       Object# 1         |%8.2f     |%6.2f  |\n", 
			regularPolygon1.getPerimeter(), regularPolygon1.getArea());
		System.out.printf( "|       Object# 2         |%8.2f     |%6.2f  |\n", 
			regularPolygon2.getPerimeter(), regularPolygon2.getArea());
		System.out.printf( "|       Object# 3         |%8.2f     |%6.2f  |\n", 
			regularPolygon3.getPerimeter(), regularPolygon3.getArea());
		
	}
}