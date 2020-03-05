package Assignment_8;

import java.util.Scanner;


public class Question_15 {

	public static void main(String[] args) {
		
		do {
			Scanner task = new Scanner(System.in);
			
			System.out.print("Do you have task true/false : ");
			
			boolean TaskOrNot = task.nextBoolean();
			
			System.out.print("How many task have you : ");
			
			int taskId = task.nextInt();
			
			System.out.print("How many task have completed: ");
			
			int currentId = task.nextInt();
			
			System.out.println("ValitadeTask (" + TaskOrNot + "," + taskId + "," + currentId +")" );
						
			System.out.println("Returns : " + "\"" + ValidateTask(TaskOrNot,taskId,currentId) + "\"");
		
		}while (AnotherTry());
			
	}
	
	public static boolean ValidateTask(boolean TaskOrNot, int taskId, int currentId) {
		
		if (TaskOrNot && taskId<10) {
			
			if (taskId-currentId<=1) {
				return true;
			}
			
		}return false;
	
	}
	
	public static boolean AnotherTry() {
		
		boolean finish=false;
	
		Scanner AnotherTry = new Scanner(System.in);
	
		System.out.print("Do you want try another try ? (Y/N): ");
	
		String answer = AnotherTry.next();
	
	  switch (answer) {
	
		case "N": case "n":
			finish=false;
			System.out.println("Good Bye");
			break;
		
		case "Y": case "y":
			finish=true;
			break;
			default:
			System.out.println("Invalid Input");
			System.out.println("Good Bye");
			finish=false;
			break;
	}
		return finish;
	
	}

}
