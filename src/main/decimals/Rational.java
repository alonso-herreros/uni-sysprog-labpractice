package decimals;

public class Rational {
	private int num, denom;
	
	public Rational(int num, int denom) {
		if(denom<0) {
			num = -num;
			denom = -denom;
		}
		int divisor = gcd(num, denom);
		this.num = num / divisor;
		this.denom = denom / divisor;
	}
	public Rational(int n) {
		this(n, 1);
	}
	
	public int getNum() {
		return num;
	}
	public int getDenom() {
		return denom;
	}
	
	public String toString() {
		return String.format("%d / %d", num, denom);
	}
	
	public Rational sum(int xn, int xd) {
		return this.sum(new Rational(xn, xd));
	}
	public Rational sum(Rational x) {
		return new Rational(num*x.getDenom() + x.getNum()*denom, denom*x.getDenom());
	}

	public Rational multiply(int xn, int xd) {
		return this.multiply(new Rational(xn, xd));
	}
	public Rational multiply(Rational x) {
		return new Rational(num*x.getNum(), denom*x.getDenom());
	}
	
	private int gcd(int x1, int x2) {
		int a = x1, b = x2;
		while (b != 0) {
			int tmp = b;
			b = a % b;
			a = tmp;
		}
		if (a<0) {
			a = -a;
		}
		return a;
	}
}
