package zadaci_31_3_2017;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Circle circle1 = new Circle(5, "red", true);
		Circle circle2 = new Circle(5, "green", false);
		Circle circle3 = new Circle(4, "green", false);

		System.out.println("Circle1 radius: " + circle1.getRadius());
		System.out.println("Circle2 radius: " + circle2.getRadius());
		System.out.println("Circle3 radius: " + circle3.getRadius());

		System.out.println("Circle1 is " + (circle1.equals(circle2) ? "" : "not ") + "equal to circle2");

		System.out.println("Circle1 is " + (circle1.equals(circle3) ? "" : "not ") + "equal to circle3");
	}
}