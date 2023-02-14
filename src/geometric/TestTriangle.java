package geometric;

import java.util.Locale;

public class TestTriangle {

	public static void main(String[] args) {
		if (args.length != 6) {
			System.err.println("Six arguments were expected");
			return;
		}
		Point vertex1 = new Point(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
		Point vertex2 = new Point(Double.parseDouble(args[2]), Double.parseDouble(args[3]));
		Point vertex3 = new Point(Double.parseDouble(args[4]), Double.parseDouble(args[5]));
		Triangle tri = new Triangle(vertex1, vertex2, vertex3);
		
		double[] lengths = tri.sideLengths();
		System.out.print("Side lengths: ");
		for (int i=0; i<lengths.length; i++) {			
			System.out.printf(Locale.US, "%.2f%s", lengths[i], (i<lengths.length-1)? ", " : "\n");
		}
		System.out.println();
	}

}
