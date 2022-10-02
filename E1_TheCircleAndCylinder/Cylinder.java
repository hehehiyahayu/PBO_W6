package E1_TheCircleAndCylinder;

public class Cylinder extends Circle {
	private double height;
	
	public Cylinder() {
		super();
		height = 1.0;
	}
	
	public Cylinder(double height) {
		super();
		this.height = height;
	}
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return (2*Math.PI*super.getRadius()*this.height) + (2*super.getArea());
	}
	
	@Override
	public String toString() {
		return "Cylinder: subclass of " + super.toString() // use Circle's toString()
		 + " height=" + height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getVolume() {
		return getArea()*height;
	}
	
}
