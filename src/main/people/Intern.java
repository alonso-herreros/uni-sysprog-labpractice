package people;

public class Intern extends Student {
	private float salary;

	public Intern(String id_str, String sid_str, float salary) {
		this(id_str, Integer.valueOf(sid_str), salary);
	}
	public Intern(String id_str, int sid, float salary) {
		super(id_str, sid);
		this.salary = salary;
	}

	public String toString() {
		return String.format("%s, salary: %.2f", super.toString(), salary);
	}

}
