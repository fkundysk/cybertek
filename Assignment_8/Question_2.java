package Assignment_8;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		
		cube();
		
	}

	public static void cube() {

		Scanner number = new Scanner(System.in);
		
		System.out.print("Input : " );
		
		int CubeNum = number.nextInt();
		
		System.out.println("Output : " + (CubeNum*CubeNum*CubeNum));
		
		
	}

}
