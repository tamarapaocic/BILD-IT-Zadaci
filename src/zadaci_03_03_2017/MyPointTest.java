package zadaci_03_03_2017;

public class MyPointTest {

	public static void main(String[] args) {

		MyPoint point1 = new MyPoint();
		MyPoint point2 = new MyPoint(10, 30.5);

		System.out.println("The distance between (" + point1.getX() + ", " + point1.getY() + ") and ("
		+ point2.getX() + ", " + point2.getY() + ") is: " + point1.distance(point2));
	}
}