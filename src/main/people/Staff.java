package people;

public class Staff extends Person {
	
	private float salary;

	public Staff(String id_str, float salary) {
		super(id_str);
		this.salary = salary;
	}
	
	public String toString() {
		return String.format("%s, salary: %.2f", super.toString(), salary);
	}

}
