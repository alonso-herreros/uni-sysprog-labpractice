package misc;

public class SquareGrid {
	private int size;
	
	// precondition n%2 == 0
	SquareGrid(int n) {
		size = n;
	}
	
	// precondition 0 <= x <= n
	// precondition 0 <= y <= n
	public String getZone(int x, int y) {
		String s = "";
		if (y >= size / 2) {
			s = s+"N";
		} else {
			s = s+"S";
		}
		if (x >= size / 2) {
			s = s+"E";
		} else {
			s = s+"W";
		}
		return s;
	}
}