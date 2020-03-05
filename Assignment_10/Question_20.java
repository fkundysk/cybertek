package Assignment_10;

public class Question_20 {

	public static void main(String[] args) {
		
		
		System.out.println(fractorialNumber(1));
		System.out.println(fractorialNumber(2));
		System.out.println(fractorialNumber(3));
		System.out.println(fractorialNumber(4));
		System.out.println(fractorialNumber(5));
		System.out.println(fractorialNumber(-5));

	}

	public static int fractorialNumber(int n) {
		int result = 1;
		
		if (!(n>0)) {
			System.out.print("Invalid number, number have to be positive integer!...");
			result = 0;
		}
	
		if (n>0) {
			for (int i = n; i>0; i-- ) {
			
				result = result * i;
			
			}
		}	
		return result;
	}

}
