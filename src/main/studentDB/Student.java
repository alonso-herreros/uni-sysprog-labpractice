package studentDB;

public class Student {

	private String name;
	private float grade;
	
	public Student(String name, float grade) {
		setName(name);
		setGrade(grade);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getGrade() {
		return grade;
	}
	public void setGrade(float grade) {
		this.grade = grade;
	}

}
