/*
 * Brendan Howell
 * CSC-151
 * BankAccount class (with no main method)
 * Example of overloading
 */
public class BankAccount {
	//  instance variable
	private double balance;
	
	//constructor
	public BankAccount(){
		balance = 0.0;
	}  //  End Constructor

	
	public BankAccount(double bal){
		balance = bal;
	}
	
	public BankAccount(String bal){
		balance = Double.parseDouble(bal);
	}
	
	public double getBalance(){
		return balance;
	}
	
}  //  End Class
