package people;

public class SpanishID {
	
	private static final char[] LETTERMAP = {
			'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
			'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
	
	private int number;
	private char letter;
	private boolean valid;

	public static String separator = "";
	
	public SpanishID(String id_str) {
		this(id_str, false);
	}
	public SpanishID(String id_str, boolean ignoreValidity) {
		if (id_str.length() < 9 || id_str.length() > 10) {
			throw new IllegalArgumentException("id_str must be in a valid Spanish ID format.");
		}

		number = Integer.parseInt(id_str.substring(0,8));
		letter = id_str.charAt(id_str.length()-1);
		
		valid = ignoreValidity || checkLetter(number, letter);
		if (!valid) {
			throw new SecurityException("The letter is not correct for the provided number (" + id_str + ")");
		}
	}

	public static boolean checkLetter(int id_n, char id_char) {
		return LETTERMAP[id_n%23] == id_char;
	}
	
	public String toString() {
		return String.format("%08d%s%c", number, separator, letter);
	}
}
