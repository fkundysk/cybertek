package assignment_14;

public class Q_2_LameCalculator {
	
	
	public int plus(int x, int y) {
		return x+y;
	}
	
	public int minus(int x, int y) {
		return x-y;
	}
	
	public int multiply(int x, int y) {
		return x*y;
	}
	
	public int divide(int x, int y) {
		return x/y;
	}
	
}


package assignment_14;

public class Q_2_LameCalculatorTest {

	public static void main(String[] args) {
		
		Q_2_LameCalculator lc = new Q_2_LameCalculator();
		
		System.out.println("returns: " + lc.plus(1, 1));
		System.out.println("returns: " + lc.minus(1, 1));
		System.out.println("returns: " + lc.multiply(2, 1));
		System.out.println("returns: " + lc.divide(10, 2));

	}

}
