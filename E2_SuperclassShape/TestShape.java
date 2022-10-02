package E2_SuperclassShape;

public class TestShape {

	public static void main(String[] args) {
		Shape s1 = new Shape("grey", false);
		System.out.println("Shape: " + s1.toString());
		
		Circle c1 = new Circle();
		System.out.println("Circle: " + c1.toString());
		
		Rectangle r1 = new Rectangle();
		System.out.println("Rectangle: " + r1.toString());
		
		Square sq1 = new Square(10.0);
		System.out.println("Square: " + sq1.toString());
	}
}
