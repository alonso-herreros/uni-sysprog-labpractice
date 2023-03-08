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
	public boolean equals(Point p2) {
		return distance(p2) < 1e-10;
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
		if (y > 0) {
			return (x>0)? 1 : 2;
		} 
		else {
			return (x>0)? 4 : 3;
		}
	}
	
	public Point nearest(Point[] points) {
		return points[nearestIndex(points)];
	}
	public int nearestIndex(Point[] points) {
		int index = 0;
		for (int i=0; i<points.length; i++) {
			if (this.distance(points[i]) < this.distance(points[index])) {				
				index =  i;
			}
		}
		return index;
	}
	
	public Point[] orderNearest(Point[] points) {
		Point farthest = new Point(Float.MAX_VALUE, Float.MIN_VALUE);
		Point[] pointsAux = points.clone();
		Point[] pointsOrdered = new Point[points.length];
		
		for (int i=0; i<points.length; i++) {
			int nearestIndex = nearestIndex(pointsAux);
			pointsOrdered[i] = pointsAux[nearestIndex];
			pointsAux[nearestIndex] = farthest;
		}
		return pointsOrdered;
	}
	
	private Point vectorTo(Point point2) {
		return new Point(point2.getX()-x, point2.getY()-y);
	}
	
	public double scalarProduct(Point p2) {
		return getY()*p2.getY() + getX()*p2.getX();
	}

	public boolean orthogonal(Point p2){
		return scalarProduct(p2) == 0;
	}
	public boolean orthogonal(Point p2, Point p3) {
		return vectorTo(p2).orthogonal(vectorTo(p3));
	}
	
}
