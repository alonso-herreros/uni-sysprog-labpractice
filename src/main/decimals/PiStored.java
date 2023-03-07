package decimals;

import java.math.BigDecimal;

public class PiStored implements AdvancedPiProvider {
	
	private static final String PI = "3.14159265358979323846264338327950"
			+ "2884197169399375105820974944592307"
			+ "8164062862089986280348253421170679";
	private int precision;
	
	public PiStored() {
		this.precision = 30;
	}

	public int getPrecision() {
		return precision;
	}
	public void setPrecision(int precision) throws PrecisionException {
		if (precision > 30) {
			throw new PrecisionException(precision);
		}
		this.precision = precision;

	}

	public int getMaximumPrecision() {
		return 30;
	}

	public BigDecimal computePi() {
		return new BigDecimal(PI.substring(0, 2+precision));
	}

}
