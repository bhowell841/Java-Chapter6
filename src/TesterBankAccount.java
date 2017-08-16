/*
 * Brendan Howell
 * CSC-151
 * Program to test Bank Account 
 * overloading concept
 * 
 */
public class TesterBankAccount {

	public static void main(String[] args) {
		// create and instance of BankAccount
		BankAccount bal1 = new BankAccount();
		System.out.println(bal1.getBalance());
		
		// create another instance with different parameter
		BankAccount bal2 = new BankAccount(1000.00);
		System.out.println(bal2.getBalance());
		
		// create another instance with different parameter
		BankAccount bal3 = new BankAccount("5000.00");
		System.out.println(bal3.getBalance());
		
	}  //  End Main

}  //  End Class
