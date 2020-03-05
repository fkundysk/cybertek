package Assignment_9;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		
		
		boolean notCont=false;
		
		Scanner sc = new Scanner(System.in);
		do {
			
			System.out.print("Enter your word : ");
			String word = sc.next();
			int lengthWord=word.length();
					
					
			if (lengthWord%2==1) {
				
				if (lengthWord>=3) {
					
					int mid = (lengthWord-1)/2;
					System.out.print(word.substring(mid,mid+1));
							
				} else if (lengthWord==1){
					for (int i=1; i<=3;i++) {
						System.out.print(word);
						
					}
				}
				
			}
			
			if (lengthWord%2==0) {
				
				if (lengthWord>2){
					int mid = lengthWord/2;
					System.out.print(word.substring(mid-1, mid+1));
					
				} else if (lengthWord==2) {
					for (int i=1;i<=2;i++) {
					System.out.print(word);
					}
				}
				
			}
			
			
			System.out.println("");
			System.out.print("Try another word ? (Y/N) : ");
			String answer = sc.next();
			if (answer.equalsIgnoreCase("y")) {
				notCont=true;
			} else if (answer.equalsIgnoreCase("n")){
				System.out.println("Bye bye");
			}
			
		}while (notCont);
	
	}

}
