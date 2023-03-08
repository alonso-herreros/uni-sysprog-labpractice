package geometric;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class PointTest {
	
	@Test
	public void testDistance() {
		Point p = new Point(4, 6);
		assertEquals(p.distance(), 7.211102550927978f, 0.00001f);
	}
}