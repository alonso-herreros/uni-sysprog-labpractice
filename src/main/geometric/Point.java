package geometric;

import java.util.Locale;

public class Point {
	private double x, y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return String.format(Locale.US, "(%.2f, %.2f)", x, y);
	}
	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	
	public double distance() {
		return Math.sqrt(x*x+y*y);
	}
	public double distance(Point point2) {
		return vectorTo(point2).distance();
		// return Math.sqrt(point2.getX()*point2.getX()+point2.getY()*point2.getY());
	}
	
	public int quadrant() {
		if (x == 0 || y == 0) {
			return 0;
		}
		if (x > 0) {
			return (x>0)? 1 : 2;
		} 
		else {
			return (x>0)? 4 : 3;
		}
	}
	
	public Point nearest(Point[] points) {
		int nearestIndex = 0;
		for (int i=0; i<points.length; i++) {
			if (this.distance(points[i]) < this.distance(points[nearestIndex])) {				
				nearestIndex =  i;
			}
		}
		return points[nearestIndex];
	}
	
	private Point vectorTo(Point point2) {
		return new Point(point2.getX()-x, point2.getY()-y);
	}
}
