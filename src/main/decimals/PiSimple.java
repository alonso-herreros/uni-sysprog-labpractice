package decimals;

import java.math.BigDecimal;

public class PiSimple implements PiProvider {

	public BigDecimal computePi() {
		return new BigDecimal(3.14);
	}

}
