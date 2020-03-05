package Assignment_9;

public class Question_13 {

	public static void main(String[] args) {
		
		naviLetter("a","d");
		naviLetter("c","c");
		naviLetter("c","b");
	
	}

	public static void naviLetter(String start, String finish) {
		
		start = start.toUpperCase();
		finish = finish.toUpperCase();
		
		String route = "ABCDABC";
		
		int startPoint = route.indexOf(start);
		int finishPoint = route.indexOf(finish, startPoint);
		
		if (startPoint==finishPoint) {
			System.out.println(finish + " found");
			
		}
		
		for (int i = startPoint ; i<finishPoint; i++  ) {
			
			if (route.charAt(i) == 'A') {
				System.out.print("right ");
				
			} else if (route.charAt(i) == 'B') {
				System.out.print("down ");
				
			} else if (route.charAt(i) == 'C') {
				System.out.print("left "); 
				
			} else if (route.charAt(i) == 'D') {
					System.out.print("up "); 
			
			} 
			if (!(i==finishPoint-1)) {
			System.out.print("> ");
			
			} else {
			System.out.print(": " + route.charAt(i+1) + " found");
			System.out.println();
			
			}
		} 
	}
	
}
