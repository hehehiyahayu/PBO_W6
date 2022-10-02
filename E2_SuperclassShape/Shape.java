package E2_SuperclassShape;

public class Shape {
	private String color = "red";
	private boolean filled = true;
	
	public Shape() {
		this.setColor("green");
		this.setFilled(true);
	}
	
	public Shape(String color, boolean filled) {
		this.setColor(color);
		this.setFilled(filled);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public String toString() {
		if(this.isFilled()) {
			return "A Shape with color of " + this.getColor() + " and filled";
		}else {
			return "A Shape with color of " + this.getColor() + " and Not filled";
		}
	}
}
