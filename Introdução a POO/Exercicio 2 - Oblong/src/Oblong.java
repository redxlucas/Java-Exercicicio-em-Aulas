import java.lang.Math;

public class Oblong {
	
	public double width;
	public double height;
	
	public double Area() {
		return width * height;
	}
	
	public double Perimeter() {
		return width * 2 + height * 2;
	}
	
	public double Diagonal(){
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
}
