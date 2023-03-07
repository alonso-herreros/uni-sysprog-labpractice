package geometric;

public abstract class Quadrilateral extends Figure {
	
	Point[] verts = new Point[4];

	public Quadrilateral(String name, Point p1, Point p2, Point p3, Point p4) {
		super(name);
		verts[0] = p1;
		verts[1] = p2;
		verts[2] = p3;
		verts[3] = p4;
	}

	public boolean isRegular() {
		return checkRectangle(verts[0], verts[1], verts[2], verts[3]);
	}

	/**
	* Indicates if the quadrilateral is a rectangle or square by
	* comparing sizes and diagonals and calculating the scalar product
	*
	*/
	private boolean checkRectangle(Point v1, Point v2, Point v3, Point v4){
		Point[] closestVerts = v1.orderNearest(new Point[]{v2,v3,v4});
		return v1.distance(closestVerts[1]) == closestVerts[0].distance(closestVerts[2])
			&& v1.distance(closestVerts[2]) == closestVerts[0].distance(closestVerts[1])
			&& v1.orthogonal(closestVerts[0], closestVerts[1]);
	}


	public String toString() {
		return String.format("Name: %s, Vertices: %s, %s, %s %s", getName(), verts[0].toString(), verts[1].toString(), verts[2].toString(), verts[3].toString());
	}

}
