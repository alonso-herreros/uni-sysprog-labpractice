package geometric;

import java.util.Locale;

public class TestPoint {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.err.println("Two arguments were expected");
			return;
		}
		
		Point point1 = new Point(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
		System.out.print("Point 1: ");
		System.out.println(point1);
		
		System.out.printf(Locale.US, "Using get() methods: (%.2f, %.2f)\n", point1.getX(), point1.getY());
		System.out.println();
		
		System.out.printf(Locale.US, "Distance to origin: %.3f.\n", point1.distance());
		System.out.printf(Locale.US, "Distance to point (1,1): %.3f.\n", point1.distance(new Point(1,1)));
		System.out.println();

		System.out.printf("Point (1, 1) is in quadrant %d.\n", new Point(1,1).quadrant());
		System.out.printf("Point (1, -1) is in quadrant %d.\n", new Point(1,-1).quadrant());
		System.out.printf("Point (-1, 1) is in quadrant %d.\n", new Point(-1,1).quadrant());
		System.out.printf("Point (-1, -1) is in quadrant %d.\n", new Point(-1,-1).quadrant());
		System.out.println();
		
		Point[] points = new Point[] {new Point(3,4), new Point(0,1), new Point(-1,2)};
		System.out.printf("The closest to (1,2) between (3,4), (0, 1) and (-1, 2) is %s.\n", point1.nearest(points));
		System.out.println();
	}

}
