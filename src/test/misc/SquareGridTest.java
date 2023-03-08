 package misc;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


public class SquareGridTest {

	private static Stream<Arguments> positionsAndZonesProvider() {
		return Stream.of(
			Arguments.of(0, 0, "SW"),
			Arguments.of(5, 2, "SE"),
			Arguments.of(4, 7, "NE"),
			Arguments.of(3, 4, "NW"));
	}

	@ParameterizedTest
	@MethodSource("positionsAndZonesProvider")
	void testGetZone(int x, int y, String zone) {
		SquareGrid grid = new SquareGrid(8);
		assertTrue(grid.getZone(x, y).equals(zone));
	}

}
