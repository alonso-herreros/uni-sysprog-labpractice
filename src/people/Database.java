package people;

import java.util.ArrayList;

public class Database {

	public static void main(String[] args) {
		SpanishID.separator = "-";
		
		ArrayList<Person> poolUsers = new ArrayList<Person>();
		poolUsers.add(new Person("01100000­A"));
		poolUsers.add(new Person("00220000­B"));
		poolUsers.add(new Staff("00030000­C", 2000));
		poolUsers.add(new Staff("04040000­D", 1500));
		poolUsers.add(new Professor("50500000­E", 1000, "mathematics"));
		poolUsers.add(new Professor("66600000­F", 2000, "telematics"));
		poolUsers.add(new Student("77000000­G", 777777));
		poolUsers.add(new Student("88080000­H", 888888));
		poolUsers.add(new Intern("90990000­I", 999999, 400));
		poolUsers.add(new Intern("10100000­J", 888888, 800));
		poolUsers.add(new Tenured("11110000­K", "geography"));
		poolUsers.add(new Tenured("12120000­L", "mathematics"));
		
		
		if (args.length == 1 && args[0].equals("-s")) {
			for (int i=0; i<poolUsers.size(); i++) {
				System.out.println(poolUsers.get(i).toStringShort());
			}
		} else {
			for (int i=0; i<poolUsers.size(); i++) {
				System.out.println(poolUsers.get(i));
			}
		}
	}

}
