package misc;

import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


public class MyClassTest {
	
	private static Stream<Arguments> squaresProvider() {
		return Stream.of(
		Arguments.of(2, 4),
		Arguments.of(5, 25),
		Arguments.of(11, 121));
	}
	
	@ParameterizedTest
	@MethodSource("squaresProvider")
	public void testSquare(int n, int square) {
		MyClass myClassInstance = new MyClass();
		assertEquals(myClassInstance.square(n), square);
	}
}