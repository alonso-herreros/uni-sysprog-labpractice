package people;

public class Person {
	
	private SpanishID id;
	
	public Person(String id_str) {
		this.id = new SpanishID(id_str, true);
	}
	
	public String toString() {
		return String.format("DNI: %s", id.toString());
	}
	
	public String toStringShort() {
		return String.format("DNI: %s", id.toString());
	}
	
}
