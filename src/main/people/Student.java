package people;

public class Student extends Person {
	private int sid;

	public Student(String id_str, String sid_str) {
		this(id_str, Integer.valueOf(sid_str));
	}
	public Student(String id_str, int sid) {
		super(id_str);
		this.sid = sid;
	}
	
	public String toString() {
		return String.format("%s, NIA: %d", super.toString(), sid);
	}
	
}
