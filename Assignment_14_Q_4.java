package assignment_14;

public class Q_4_Person {
	
	private String FirstName;
	private String LastName;
	private int Age;
	
	public Q_4_Person() {
		
		this.FirstName = "undefined";
		this.LastName = "undefined";
		this.Age = -1;
	}
	
	public Q_4_Person (String FirstName, String LastName, int Age){
	
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Age = Age;
		
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	@Override
	public String toString() {
		return FirstName + " | " + LastName + " | " + Age ;
	}

}


package assignment_14;

public class Q_4_PersonTest {

	public static void main(String[] args) {
		
		Q_4_Person person = new Q_4_Person();
		
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		System.out.println(person.getAge());
		System.out.println(person.toString());
		
		
		person.setFirstName("John");
		person.setLastName("Doe");
		person.setAge(44);

		System.out.println(person.toString());
		
		Q_4_Person person2 = new Q_4_Person ("Fatima", "Lee", 22);
		
		System.out.println(person2.getFirstName());
		System.out.println(person2.getLastName());
		System.out.println(person2.getAge());
		System.out.println(person2.toString());
	}

}
