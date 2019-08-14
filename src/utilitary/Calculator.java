package utilitary;

public class Calculator {
	public static final double Pi = 3.14;
	
	public static double circunference(double radius) {
		return 2.0 * Pi * radius;
	}
	public static double volume(double radius) {
		return (4.0 * Pi * radius * radius * radius) / 3.0; 
	}


}
