package Assignment_11;

import java.util.Arrays;

public class Question_51 {

	public static void main(String[] args) {
		
		int [] outer = {1, 2, 4, 6};
		int [] inner = {2, 4};
		
		int [] outer1 = {1, 2, 4};
		int [] inner1 = {6, 5};
		
		innerOrNot(outer, inner);
		innerOrNot(outer1, inner1);
	}

	public static void innerOrNot(int[] outer, int[] inner) {
		
		Arrays.parallelSort(outer);
		Arrays.parallelSort(inner);
		
		
		if (inner[0]>outer[0] && inner[inner.length-1]<outer[outer.length-1]) {
			System.out.println("true");
			
		} else {
			System.out.println("false");
		}
		
	}

}
