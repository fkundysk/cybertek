package Assignment_9;

public class Question_11 {

	public static void main(String[] args) {
		
		String message = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programming and problem solving}";
		
		String sender = message.substring(message.indexOf("<")+1, message.indexOf(">"));
		
		String number = message.substring(message.indexOf("[")+1, message.indexOf("]"));
		
		String messageBody = message.substring(message.indexOf("{")+1, message.indexOf("}"));
		
		
		System.out.println("Sender : " + sender);
		System.out.println("Phone Number : " + number);
		System.out.println("Message Body : " + messageBody);
				
		
		
		
		

	}

}
