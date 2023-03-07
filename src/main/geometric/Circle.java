package geometric;

public class Circle extends Figure {
	
	Point center;
	int radius;

	public Circle(String name, Point center, int radius) {
		super(name);
		this.center = center;
		this.radius = radius;
	}

	public double area() {
		return Math.PI*radius*radius;
	}

	public boolean isRegular() {
		return true;
	}
	
	public String toString() {
		return String.format("Name: %s, Center: %s, Radius: %d", getName(), center.toString(), radius);
	}
	
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}
