package Assignment_12;

import java.util.Arrays;
import java.util.Scanner;

public class Question_61 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter Your Array Length : ");
		
		int arrayLength = sc.nextInt();
		
		String [] stringArray = new String [arrayLength];
		
		for (int i=0; i<arrayLength; i++) {
			
			if (i==0) {
				stringArray[i]="git";
				System.out.println((i+1) + ". value of your array : " + "git" + " (assigned by default) " );
			} else if (i==2) {
				stringArray[i]="gud";
				System.out.println((i+1) + ". value of your array : " + "gud" + " (assigned by default) " );
			} else {
			
			System.out.print ("Enter " + (i+1) + " value of your array : "  );
			stringArray[i] = sc.next();
			}
			
		}
		System.out.print("Your array is : --> ");
		System.out.println(Arrays.toString(stringArray));
		sc.close();
	
	}

}
