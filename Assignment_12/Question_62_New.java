package Assignment_12;

import java.util.ArrayList;

public class Question_62_New {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(2);
		nums.add(5);
		nums.add(6);
		nums.add(45);
		nums.add(32);
		
		System.out.println(sumOfNums(nums));

	}

	private static int sumOfNums(ArrayList<Integer> nums) {
		
		int sum=0;
		
		for(int num:nums) {
			sum =sum+num;
			
		}
		
		return sum;
	}

}
