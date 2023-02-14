package rationals;

public class TestRational {

	public static void main(String[] args) {
		System.out.println(new Rational(3,4));
		System.out.println(new Rational(3,4).sum(new Rational(4,3)));
		System.out.println(new Rational(3,4).multiply(new Rational(5,3)));
		
	}

}
