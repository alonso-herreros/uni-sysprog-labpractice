package geometric;

public class Triangle {
	private Point[] vertices = new Point[3];
	
	public Triangle(Point vertex1, Point vertex2, Point vertex3) {
		vertices[0] = vertex1;
		vertices[1] = vertex2;
		vertices[2] = vertex3;
	}
	
	public double[] sideLengths() {
		return new double[] {
				vertices[0].distance(vertices[1]),
				vertices[1].distance(vertices[2]),
				vertices[2].distance(vertices[0])
		};
	}
}
