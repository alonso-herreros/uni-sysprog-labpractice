package people;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FullProfessorTest {
	
	@Test
	public void testNetSalary() {
		FullProfessor c = new FullProfessor("00030000-C", 2000, 500, "math");
		float result = c.calculateNetSalary();
		float resultExpected = 1250.0f;
		assertEquals(resultExpected, result, 0.01);
	}
}