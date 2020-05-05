package assignment_14;

public class Q_1_Atts {
	
	public String name;
	public String color;
	public int amount;
	
	
	public String asString() {
		return ("name: " + name + " color: " + color + " amount: " + amount);
		
	}

}

package assignment_14;

public class Q_1_AttsTest {

	public static void main(String[] args) {
		
		Q_1_Atts a = new Q_1_Atts();
		
		a.name = "table";
		a.color = "brown";
		a.amount = 1;
		
		System.out.println(a.asString());
	
		
		
	}

}
