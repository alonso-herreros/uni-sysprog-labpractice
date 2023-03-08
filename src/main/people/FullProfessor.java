package people;

public class FullProfessor extends Person {

	String department;
	int salary, benefits;
	
	public FullProfessor(String string, int i, int j, String string2) {
		super(string);
		this.salary = i;
		this.benefits = j;
		this.department = string2;
	}

	public float calculateNetSalary() {
		// TODO Auto-generated method stub
		return (salary + benefits) / 2.0f;
	}
	
	

}
