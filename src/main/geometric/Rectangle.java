package geometric;

public class Rectangle extends Quadrilateral {

	public Rectangle(String name, Point p1, Point p2, Point p3, Point p4) throws Exception {
		super(name, p1, p2, p3, p4);
		if (!isRegular()) {
			throw new Exception("The provided vertices do not correspond to a rectangle.");
		}
	}

	public double area() {
		Point[] closestVerts = verts[0].orderNearest(new Point[]{verts[1], verts[2], verts[3]});
		return verts[0].distance(closestVerts[0])*verts[0].distance(closestVerts[1]);
	}

}
