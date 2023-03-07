package geometric;

import java.math.BigDecimal;

import decimals.PiFromMath;
import decimals.PiProvider;

public class Circle extends Figure {
	
	Point center;
	BigDecimal radius;

	public Circle(BigDecimal radius) {
		this("", new Point(0,0), radius);
	}
	public Circle(String name, Point center, int radius) {
		this(name, center, new BigDecimal(radius));
	}
	public Circle(String name, Point center, BigDecimal radius) {
		super(name);
		this.center = center;
		this.radius = radius;
	}

	public double area() {
		return area(new PiFromMath()).doubleValue();
	}
	public BigDecimal area(PiProvider provider) {
		return provider.computePi().multiply(radius.multiply(radius));
	}

	public boolean isRegular() {
		return true;
	}
	
	public String toString() {
		return String.format("Name: %s, Center: %s, Radius: %.1f", getName(), center.toString(), getRadius().doubleValue());
	}
	
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public BigDecimal getRadius() {
		return radius;
	}
	public void setRadius(BigDecimal radius) {
		this.radius = radius;
	}
	
}
