package decimals;

import java.math.BigDecimal;

public class PiFromMath implements PiProvider {

	public BigDecimal computePi() {
		return new BigDecimal(Math.PI);
	}

}
