package assignment_14;

public class Q_11_BankAccount {
	
	
	private String accountHolder = "Mike Smith";
	private int accountNumber = 234567;
	
	
	
	
	public String getAccountHolder() {
		return accountHolder;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	@Override
	public String toString() {
		return "Q_11_BankAccount [Account Owner=" + accountHolder + ", Account Number=" + accountNumber + "]";
		
	}
	
}	


package assignment_14;

public class Q_11_AccountTest {

	public static void main(String[] args) {
		
		Q_11_SavingAccount account = new Q_11_SavingAccount(15.89);
		
		
		System.out.println("Account Interest Rate: " + account.getInterestRate());
		
		

	}

}


