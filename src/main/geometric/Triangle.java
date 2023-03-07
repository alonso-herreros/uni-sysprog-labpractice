package geometric;

public class Triangle extends Figure {
	private Point[] verts = new Point[3];
	
	public Triangle(Point v1, Point v2, Point v3) {
		this("", v1, v2, v3);
	}
	public Triangle(String name, Point v1, Point v2, Point v3) {
		super(name);
		verts[0] = v1;
		verts[1] = v2;
		verts[2] = v3;
	}
	
	public double[] sideLengths() {
		return new double[] {
				verts[0].distance(verts[1]),
				verts[1].distance(verts[2]),
				verts[2].distance(verts[0])
		};
	}

	public double area() {
		return 0.5*Math.abs((verts[1].getY()-verts[2].getY())+verts[1].getX()*(verts[2].getY()-verts[0].getY())+verts[2].getX()*(verts[0].getY()-verts[1].getY()));
	}

	public boolean isRegular() {
		double dist1 = verts[0].distance(verts[1]);
		if (dist1 == verts[1].distance(verts[2]) && dist1 == verts[2].distance(verts[0])) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return String.format("Name: %s, Vertices: %s, %s, %s", getName(), verts[0].toString(), verts[1].toString(), verts[2].toString());
	}
	
	// Getters and Setters
	public Point[] getVerts() {
		return verts;
	}
	public Point getVert(int i) {
		return verts[i];
	}
	public void setVert(int i, Point p) {
		verts[i] = p;
	}
	
}
