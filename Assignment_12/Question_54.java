package Assignment_12;

import java.util.Arrays;

public class Question_54 {

	public static void main(String[] args) {
		
		int [] [] array = {{8, 20, 50}, {12, 30, 75}};
		
		System.out.print("[");
		
		for (int i=0; i<array.length; i++) {
		
			System.out.print(Arrays.toString(array[i]));
			
			if (i<array.length-1)
				System.out.print(", ");
			
		} System.out.print("]");
	}

}
