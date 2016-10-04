/**
** Author: Colm Carey        Date: 10/11/15
**

*/

public class savingsAccount {
	// A static variable is one that's associated with a class, not objects of that class. 
	public static double annualInterestRate;
	
	// A static counter to count the number of SavingAccount objects created to assign ID's
	private static int count;
	
	private int accountNo;
	private double savingsBalance;
		

	public savingsAccount(double savingsBalance) {
		count = count + 1;
		this.accountNo = count;
		this.savingsBalance = savingsBalance;
	}
	
	public int getAccountNo() {
		return accountNo;
	}
	
	public double getSavingsBalance() {
		return savingsBalance;
	}
	
	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public static void setAnnualInterestRate(double annualInterestRate) {
		savingsAccount.annualInterestRate = annualInterestRate;
	}
	public double calculateMonthlyInterest(){
		double interest;
		
		interest = (savingsBalance * annualInterestRate) / 12;
		
		setSavingsBalance(getSavingsBalance()+interest);
		
		return interest;
		
	}
	
	public String toString() {
		
		double newBal;
		//Round the getcurrentSavingBal to two places before print.
		newBal = Math.round(getSavingsBalance()*100)/100.0d;

		return "SavingsAccount [accountNo=" + accountNo + ", savingsBalance=" + newBal;
	}


}
