package Assignment_11;

import java.util.Arrays;

public class Question_36 {

	public static void main(String[] args) {
		
		int [] nums = {1, 5, 5, 1,1};
		int [] nums1 = {1, 8, 5, 5, 0};
		int [] nums2 = {1, 5, 4, 1, 5};
		int [] nums3 = {1, 4, 4, 1, 99};
		
		findFiveInSquence(nums);
		findFiveInSquence(nums1);
		findFiveInSquence(nums2);
		findFiveInSquence(nums3);
	
	}

	public static void findFiveInSquence(int[] nums) {
		
		boolean result = false;
		
		for (int i=0; i<nums.length-1; i++) {
			
			if (nums[i] == 5) {
				
				if (nums[i+1] ==5 ) {
					
					result = true;
				}
				
			}
			
		} 
		System.out.print(Arrays.toString(nums) + "-->");
		System.out.println(result);
	
	}
}
