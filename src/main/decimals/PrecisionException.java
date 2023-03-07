package decimals;

	
public class PrecisionException extends Exception {

	public PrecisionException() {
		super("Unsupported precision.");
	}

	public PrecisionException(int precision) {
		super("Unsupported precision: " + precision);
	}

}
