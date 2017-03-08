package zadaci_07_03_2017;

public class Triangle extends GeometricObject {
    

	private double side1;
	private double side2;
	private double side3;
	
	Triangle(){
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	
	Triangle(double nSide1,double nSide2, double nSide3){
		side1 = nSide1;
		side2 = nSide2;
		side3 = nSide3;
	}
	
	public double getSide1(){
		return side1;
	}

	
	public double getSide2(){
		return side2;
	}
	
	public double getSide3(){
		return side3;
	}
	
	double getPerimeter(){
		double obim = side1 + side2 + side3;
		return obim;
	}
	
	double getArea(){
		double S = (side1 + side2 + side3)/2;
		double area = Math.sqrt(S * (S - side1)) * (S - side2) * (S - side3);
		return area;
	}
	
	public String toString(){
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}

}