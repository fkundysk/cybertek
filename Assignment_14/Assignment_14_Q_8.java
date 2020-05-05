package assignment_14;

public class Q_8_Value {
	
	private int x;
	
	
	
	public Q_8_Value() {
		
	}
	
	public Q_8_Value(int x) {
		this.x = x;
		wasModified();
	}

	public void setVal(int x) {
		wasModified();
		this.x = x;
	}
	
	public boolean wasModified() {
		return true;
	}

	public int getVal() {
		if (wasModified()) {
		return x;
		} else {
		this.x = 0;	
		return x;	
		}
	}
	
	
	

}


package assignment_14;

public class Q_8_ValueTest {

	public static void main(String[] args) {
	
		Q_8_Value val = new Q_8_Value();
		
		val.setVal(5);
		System.out.println(val.getVal());
		

	}

}
