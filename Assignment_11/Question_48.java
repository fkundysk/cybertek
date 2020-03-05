package Assignment_11;

import java.util.Arrays;

public class Question_48 {

	public static void main(String[] args) {
		
		int [] binary = {0, 0, 0, 0, 0, 0, 1, 1};
		int [] binary1 = {0, 0, 1, 0, 0, 0, 1, 1};
		int [] binary2 = {1, 1, 1, 1, 1, 1, 1, 1};
		
		binaryToDecimal(binary);
		binaryToDecimal(binary1);
		binaryToDecimal(binary2);

	}

	public static void binaryToDecimal(int[] binary) {
		
		int binaryResult=0;
		int [] decimal = new int [binary.length];
		
		for (int i = decimal.length-1; i>=0; i--) {
			
			decimal [i] = (int) Math.pow(2, ((decimal.length-1)-i));
			
			binaryResult= binaryResult + (binary[i] * decimal[i]);
		} 
		System.out.println("decimal ---> " + binaryResult);
		System.out.print("binary ---> ");
		System.out.println(Arrays.toString(binary));
		System.out.println("* * * * * * * * * * * * * * * * *");
		 
		 
		
	}

}
