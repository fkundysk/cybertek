package Assignment_10;

public class Question_22 {

	public static void main(String[] args) {
		
		String htmlTag = "<!DOCTYPE html><html><head><title>Java</title></head><body><p id=\"myid\"></p></body></html>";
		
		
		
		if (!(htmlTag.contains("<html>"))) {
			
			System.out.println("Invalid input!.");
			
		}
		
		htmlTag = htmlTag.replace("<", "").replace(">", "").replace("/", "").replace("head", "").
						replace("!","").replace("DOCTYPE", "").replace("html", "").replace("body", "").
						replace("title", "").replace("Java", "").replace("p", "").replace("\"", "").replace("id=", "");
		
		htmlTag = htmlTag.trim();
		System.out.println(htmlTag);
	
	}

}
