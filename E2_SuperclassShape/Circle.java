package E2_SuperclassShape;

public class Circle extends Shape{
	private double radius;
	
	public Circle() {
		radius = 1.0;
		super.setColor("red");
	}
	
	public Circle(double r) {
		radius = r;
		super.setColor("red");
	}
	
	public Circle(double r, String color) {
		radius = r;
		super.setColor(color); 
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
	@Override
	public String toString() {
		return "\"A Circle with radius="+ this.getRadius() +", which is\r\n" + "a subclass of " +super.toString()+ "";
	}
}
