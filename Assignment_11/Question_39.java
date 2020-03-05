package Assignment_11;

public class Question_39 {

	public static void main(String[] args) {
		
		emailSeperate("info@cybertek.com");	
		emailSeperate("hello-gmail.com");
		emailSeperate("my@fancy@email.com");
	
	}

	public static void emailSeperate(String email) {
		
		int counter =0;
	
		for (int i=0; i<email.length(); i++) {
			
			if (email.charAt(i) == '@') {
		
				counter++;
			}			
		}
		if (counter==1) {
		
		String [] emailArray = email.split("@");
		
		System.out.println("email : " + emailArray[0]);
		System.out.println("domain : " + emailArray[1]);
		
		} else {
			System.out.println("invalid email");
		}
		
	}
}
