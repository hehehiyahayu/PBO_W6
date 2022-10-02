package E2_SuperclassShape;

public class Square extends Rectangle{
	public Square(double side) {
		super(side, side);
	}
	
	@Override
	public double getArea() {
		return super.getLength() * super.getWidth();
	}
	
	@Override
	public double getPerimeter() {
		return 4 * super.getWidth();
	}
	
	@Override
	public String toString() {
		return "A Square with side=" + super.getLength() + ", which is a subclass\r\n" + "of " +super.toString()+ "";
	}
}
