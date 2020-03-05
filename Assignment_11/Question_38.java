package Assignment_11;

import java.util.Arrays;

public class Question_38 {

	public static void main(String[] args) {
		
		int [] nums = {2, 1, 2, 3, 4};
		int [] nums1 = {2, 2, 0, 3, 5};
		int [] nums2 = {1, 3, 5, 7, 9};

		countEvens(nums);
		countEvens(nums1);
		countEvens(nums2);
	
	}

	public static void countEvens(int[] nums) {
		
		int counter =0;
		for (int arr : nums) {
			if (arr%2==0) {
				counter++;
			}
		}
		System.out.print(Arrays.toString(nums) + " --> ");
		System.out.println(counter);
	
	}

}
