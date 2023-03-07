package decimals;

import java.math.BigDecimal;


/**
 * Interface to be implemented by classes that compute the number pi.
 *
 */
public interface PiProvider {
	/**
	* Computes and returns the value of the number pi. Implementations
	* may decide the precision with which they compute the value.
	*
	* @return The number pi, with the precision each implementation
	* 		decides.
	*
	*/
	BigDecimal computePi();
}
