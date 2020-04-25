package assignment_14;

public class Q_7_GasTank {

	private double amount = 0;
	private double capacity;
	
	
	public Q_7_GasTank(double capacity) {
		
		this.capacity = capacity;
	}
	
	public void addGas(double addedGas) {

		if (amount+addedGas>=capacity) {
			
			this.amount = capacity;
			
		} else {
			
			this.amount = amount+addedGas;
		}
	
	}
	
	public void useGas(double usedGas) {
		
		if(amount-usedGas<0) {
			
			this.amount = 0;
			
		} else {
			
			this.amount = amount-usedGas;
		}
		
	}
	
	public boolean isEmpty() {
		
		if (amount<0.1) {
			return true;
				
		} else {	
			return false;
		}
		
	}
	
	
	public boolean isFull() {
		
		if (amount>(capacity-0.1)) {
			
			return true;
			
		} else {
			return false;
		}
		
	}
	
	public double fillUp() {
		
		return capacity-amount;
		
	}
	

	public double getGasLevel() {
		return amount;
	}

	
	@Override
	public String toString() {
		return "GasTank [amount=" + amount + ", capacity=" + capacity + "]";
	}

	
}



package assignment_14;

public class Q_7_GasTankTest {

	public static void main(String[] args) {
	
		Q_7_GasTank tank1 = new Q_7_GasTank(50);
		
		tank1.addGas(30);
		tank1.addGas(30);
		
		System.out.println(tank1.toString());
		
		tank1.useGas(25);
		System.out.println(tank1.fillUp());
		System.out.println(tank1.isFull());
		System.out.println(tank1.isEmpty());
		
		tank1.useGas(24.91);
		System.out.println(tank1.fillUp());
		System.out.println(tank1.isFull());
		System.out.println(tank1.isEmpty());
		System.out.println(tank1.getGasLevel());
		
		System.out.println(tank1.toString());
		
		

	}

}
