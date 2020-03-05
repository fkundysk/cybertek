package Assignment_9;

public class Question_10 {

	public static void main(String[] args) {
		
		takeInfo("craig_federighi@apple.com");

	}

	public static void takeInfo(String mail) {
		
		String name = mail.substring(0, mail.indexOf("_"));
		
		char ch1 = name.toUpperCase().charAt(0);
		
		name = name.replace(name.charAt(0), ch1);
		
		String surName = mail.substring(mail.indexOf("_")+1, mail.indexOf("@"));
		
		ch1 = surName.toUpperCase().charAt(0);
		surName = surName.replace(surName.charAt(0), ch1);
		
		String domain= mail.substring(mail.indexOf("@")+1, mail.indexOf("."));
		
		String topLvlDmn = mail.substring(mail.indexOf(".")+1);
		
		System.out.println("First Name : " + name);
		System.out.println("Last Name : " + surName);
		System.out.println("Domain : " + domain);
		System.out.println("Top-Level Domain : " + topLvlDmn);
		
		
		
		
	}

}
