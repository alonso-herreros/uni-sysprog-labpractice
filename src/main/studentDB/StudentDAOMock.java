package studentDB;

import java.util.ArrayList;

public class StudentDAOMock implements StudentDAOApi {
	
	private ArrayList<Student> students = new ArrayList<Student>();

	public StudentDAOMock() {
		students.add(new Student("Paco", (float) Math.random()*10));
		students.add(new Student("Titi", (float) Math.random()*10));
	}
	
	public Student[] findAll() {
		return students.toArray(new Student[students.size()]);	
	}
	
	public float minGrade() {
		float min = Float.MAX_VALUE;
		for (int i=0; i<students.size(); i++) {
			float grade = students.get(i).getGrade();
			min = grade < min ? grade : min;
		}
		return min;
	}

	public float maxGrade() {
		float max = Float.MIN_VALUE;
		for (int i=0; i<students.size(); i++) {
			float grade = students.get(i).getGrade();
			max = grade > max ? grade : max;
		}
		return max;
	}
	
	public float avgGrade() {
		float sum = 0;
		for (int i=0; i<students.size(); i++) {
			sum += students.get(i).getGrade();
		}
		return sum / students.size();
	}

}
