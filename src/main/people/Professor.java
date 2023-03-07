package people;

public class Professor extends Person {
	
	private float salary;
	private String dept;

	public Professor(String id_str, float salary, String dept) {
		super(id_str);
		this.salary = salary;
		this.dept = dept;
	}
	
	public String toString() {
		return String.format("%s, salary: %.2f, department: %s", super.toString(), salary, dept);
	}

}
