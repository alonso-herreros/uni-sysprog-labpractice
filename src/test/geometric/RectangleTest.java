package geometric;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class RectangleTest {

	@Test
	public void testDivisionWithException() {
		assertThrows(ArithmeticException.class, ()->{int a=1/0;});
	}
	
	@Test
	public void testDivisionWithException2() {
		try {
		int a = 1 / 0;
		fail("Failed test");
		}
		catch(ArithmeticException e) {
		}
	}
	
	@Test
	public void testIsRegularValid(){
		Point O = new Point(0,0);
		Point p1 = new Point(2,0);
		Point p2 = new Point(0,1);
		Point p3 = new Point(2,1);
		try {
			new Rectangle("", O, p1, p2, p3);
		} catch (Exception e) {
			fail("Exception thrown for valid rectangle definition.");
		}
	}
	
	@Test
	public void testIsRegular() {
		Point O = new Point(0,0);
		Point p1 = new Point(2,0);
		Point p2 = new Point(0,1);
		Point p3 = new Point(2,2);
		try {
			new Rectangle("", O, p1, p2, p3);
			fail("Exception expected but not thrown for an invalid rectangle definition.");
		}
		catch (Exception e) {
			
		}
	}
	
	@Test
	public void testIsRegular2(){
		Point O = new Point(0,0);
		Point p1 = new Point(2,0);
		Point p2 = new Point(0,1);
		Point p3 = new Point(2,2);
		assertThrows(Exception.class, ()->{new Rectangle("", O, p1, p2, p3);});
		
	}

}
