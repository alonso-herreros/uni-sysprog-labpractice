package geometric;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


public class PointTest_Fixtures {
	
	static Point[] points;
	static Point p;

	@BeforeAll
	static void setUp() throws Exception {
		p = new Point(4,6);
		points = new Point[]{new Point(1, 1), new Point(5, 3),
				new Point(10, 10), new Point(-3, 2), new Point(-4, -5)};
	}

	@AfterAll
	static void tearDown() throws Exception {
		
	}

	static Stream<Arguments> pointsAndQuadrants() {
		return Stream.of(
			Arguments.of(points[0], 1),
			Arguments.of(points[1], 1),
			Arguments.of(points[2], 1),
			Arguments.of(points[3], 2),
			Arguments.of(points[4], 3));
	}

	@ParameterizedTest
	@MethodSource("pointsAndQuadrants")
	void testQuadrant(Point p, int quadr) {
		assertTrue(p.quadrant() == quadr);
	}
	
	void testNearest(Point p, Point[] points) {
		assertTrue(p.nearest(points).equals(points[1]));
	}

}
