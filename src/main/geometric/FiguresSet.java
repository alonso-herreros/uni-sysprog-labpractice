package geometric;

import java.util.ArrayList;
import java.util.Collections;


public class FiguresSet {

	private ArrayList<Figure> figures;// Array of figures
	
	// Constructor of FiguresSet
	public FiguresSet() {
		figures = new ArrayList<Figure>();
	}
	public FiguresSet(Figure... figures) {
		Collections.addAll(this.figures, figures);
	}
	
	// Calculates the total area of the figures
	public double totalArea() {
		double total = 0;
		for (int i=0; i<figures.size(); i++) {
			total += figures.get(i).area();
		}
		return total;
	}
	
	// figures to String
	public String toString() {
		String str = "Figures:\n";
		for (int i=0; i<figures.size(); i++) {
			str += String.format("%d. %s\n", i, figures.get(i).toString());
		}
		return str;
	}
	
	// Adds a new figure to the FigureSet
	public void addFigure(Figure f) {
		figures.add(f);
	}
	
	// Main program
	public static void main(String args[]) throws Exception {
		FiguresSet fSet = new FiguresSet();
		Point O = new Point(0, 0); // Origin
		
		Circle circ = new Circle("circ", O, 2);
		Triangle tri = new Triangle("tri", O, new Point(2,0), new Point(1, 2));
		Rectangle rect = new Rectangle("rect", new Point(1,1), new Point(1,3), new Point(5,1), new Point(5,3));
		fSet.addFigure(circ);
		fSet.addFigure(tri);
		fSet.addFigure(rect);
		
		System.out.printf("Total area: %.2f.\n", fSet.totalArea());
		System.out.println(fSet);
	}

}
