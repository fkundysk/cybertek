package Assignmet_13;

import java.util.ArrayList;

public class Question_76 {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(1);
		nums.add(5);
		nums.add(3);
		nums.add(7);
		
		System.out.print(nums.toString() + " ------> ");
		System.out.println(twoTimes(nums).toString());
		
		

	}

	private static ArrayList<Integer> twoTimes(ArrayList<Integer> nums) {
		
		ArrayList<Integer> newNums = new ArrayList<Integer>();
		
		for (Integer arr : nums) {
			
			newNums.add(arr);
			newNums.add(arr);
			
		}
		
		return newNums;
	}

}
