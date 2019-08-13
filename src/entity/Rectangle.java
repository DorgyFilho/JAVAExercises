package entity;

public class Rectangle {
	public double a;
	public double b;
	public double c;
	
	public double Perimeter(){
		return 2*a + 2*b;
	}
	
	public double Area() {
		return a*b;
	}
	
	public double Diagonal() {
		c = (a*a) + (b*b);
		return Math.sqrt(c);
	}
	
}
