package decimals;

import java.math.BigDecimal;
import java.math.MathContext;

public class PiFromBBP implements AdvancedPiProvider {
	private int precision;
	private MathContext mc;

	public PiFromBBP() {
		setPrecision(30);
	}

	public BigDecimal computePi() {
		BigDecimal pi = new BigDecimal(0);
		BigDecimal limit = new BigDecimal(1).movePointLeft(precision);
		boolean stop = false;
		for (int k = 0; !stop; k++) {
			BigDecimal piK = piFunction(k);
			pi = pi.add(piK);
			if (piK.compareTo(limit) < 0) {
				stop = true;
			}
		}
		return pi.round(mc);
	}

	private BigDecimal piFunction(int k) {
		int k8 = 8 * k;
		BigDecimal val1 = new BigDecimal(4);
		val1 = val1.divide(new BigDecimal(k8 + 1), mc);
		BigDecimal val2 = new BigDecimal(-2);
		val2 = val2.divide(new BigDecimal(k8 + 4), mc);
		BigDecimal val3 = new BigDecimal(-1);
		val3 = val3.divide(new BigDecimal(k8 + 5), mc);
		BigDecimal val4 = new BigDecimal(-1);
		val4 = val4.divide(new BigDecimal(k8 + 6), mc);
		BigDecimal val = val1;
		val = val.add(val2);
		val = val.add(val3);
		val = val.add(val4);
		BigDecimal multiplier = new BigDecimal(16);
		multiplier = multiplier.pow(k);

		BigDecimal one = new BigDecimal(1);
		multiplier = one.divide(multiplier, mc);
		val = val.multiply(multiplier);
		return val;
	}

	public void setPrecision(int precision) {
		this.precision = 30;
		mc = new MathContext(precision);
	}

	public int getPrecision() {
		return this.precision;
	}

	public int getMaximumPrecision() {
		return Integer.MAX_VALUE;
	}
}
