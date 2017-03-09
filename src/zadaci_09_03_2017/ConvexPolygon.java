package zadaci_09_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

import metode.DoubleUserInput;
import metode.IntUserInput;
import zadaci_03_03_2017.MyPoint;

public class ConvexPolygon {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	int numberOfPoints = IntUserInput.getInt(input,"Enter the number of the points: ", 3);
	ArrayList<MyPoint> pointList = new ArrayList<>();

	for (int i = 0; i < numberOfPoints; i++) {
		System.out.println("Enter point" + (i + 1));
		double x = DoubleUserInput.getDouble(input, "Enter x: ");
		double y = DoubleUserInput.getDouble(input, "Enter y: ");

		MyPoint point = new MyPoint(x, y);

		pointList.add(point);
	}

	input.close();
	System.out.printf("\nThe total area is: %2.3f", getArea(pointList));

   }

    /**
     * method return area of convex polygon
     * @param pointList
     * @return
     */
    public static double getArea(ArrayList<MyPoint> pointList) {
	double area = 0;
	double sum1 = 0;
	double sum2 = 0;

	for (int i = 0; i < pointList.size() - 1; i++) {
		MyPoint point1 = pointList.get(i);
		MyPoint point2 = pointList.get(i + 1);

		sum1 += (point1.getX() * point2.getY() - point1.getY() * point2.getX());
	}

	MyPoint lastPoint = pointList.get(pointList.size() - 1);
	MyPoint firstPoint = pointList.get(0);

	sum2 += (lastPoint.getX() * firstPoint.getY() - lastPoint.getY() * firstPoint.getX());

	area = Math.abs((sum1 + sum2) / 2);

	return area;
}

}