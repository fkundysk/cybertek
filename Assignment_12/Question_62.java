package Assignment_12;

public class Question_62 {

	public static void main(String[] args) {
		
		int [] ints = {3, 5, 6, 4, 7, 9, 10};
		
		System.out.println(sumOfInts(ints));
		

	}

	private static int sumOfInts(int[] ints) {
		int sum=0;
		
		for (int arr : ints){
			
			sum = sum+arr;
		}
		
		return sum;
	}

}
