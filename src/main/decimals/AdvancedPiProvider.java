package decimals;

import java.math.BigDecimal;

/**
 * Interface to be implemented by classes that compute the number pi.
 * Classes that implement this interface can provide the value of pi
 * with the requested precision, understood as the number of exact
 * digits of the computed value.
 *
 */
public interface AdvancedPiProvider extends PiProvider {
	/**
	* Sets the desired precision.
	*
	* @param precision The desired precision (number of digits).
	*
	* @throws PrecisionException if the desired precision is
	* negative, zero or bigger than the maximum precision
	* this class can provide.
	*
	*/
	
	void setPrecision(int precision) throws PrecisionException;
	/**
	* Returns the current value of precision.
	*
	* @return The current value of precision (number of digits).
	*
	*/

	int getPrecision();
	
	/**
	* Returns the maximum precision with which this provider is able
	* to generate the value of pi.
	*
	* @return The maximum precision available from this provider, or
	* Integer.MAX_VALUE if the provider can provide an
	* arbitrarily big precision.
	*
	*/
	int getMaximumPrecision();
}
