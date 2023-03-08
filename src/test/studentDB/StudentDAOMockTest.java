package studentDB;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentDAOMockTest {

	StudentDAOMock sdao;
	private Student[] students;
	
	@BeforeEach
	void setUp() throws Exception {
		sdao = new StudentDAOMock();
		students = sdao.findAll();
	}

	@Test
	void testAvgGrade() {
		float avg = 0;
		for (int i=0; i<students.length; i++) {
			avg += students[i].getGrade();
		}
		avg /= students.length;
		assertEquals(avg, sdao.avgGrade(), 1e-10);
	}

	@Test
	void testMinGrade() {
		float min = Float.MAX_VALUE;
		for (int i=0; i<students.length; i++) {
			float grade = students[i].getGrade();
			min = grade < min ? grade : min;
		}
		assertEquals(min, sdao.minGrade(), 1e-10);
	}

	@Test
	void testMaxGrade() {
		float max = Float.MIN_VALUE;
		for (int i=0; i<students.length; i++) {
			float grade = students[i].getGrade();
			max = grade > max ? grade : max;
		}
		assertEquals(max, sdao.maxGrade(), 1e-10);
	}

}
