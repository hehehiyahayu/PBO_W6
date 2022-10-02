package E2_SuperclassShape;

public class Rectangle extends Shape {
	private double width;
	private double length;
	
	public Rectangle() {
		this.setLength(1.0);
		this.setWidth(1.0);
	}
	
	public Rectangle(double width, double length) {
		this.setLength(length);
		this.setWidth(width);
	}
	
	public Rectangle(double width, double length, String color) {
		this.setLength(length);
		this.setWidth(width);
		super.setColor(color);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double getArea() {
		return width*length;
	}
	
	public double getPerimeter() {
		return 2*(length + width);
	}
	
	public String toString() {
		return "A Rectangle with width= " + this.getWidth() + " and\r\n" + "length= "+ this.getLength() +", which is a subclass of " + super.toString() + "";
	}
}
