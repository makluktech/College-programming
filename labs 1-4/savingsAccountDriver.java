/**
** Author: Colm Carey        Date: November '15
**

*/

public class savingsAccountDriver
{
	public static void main(String[] args) {
	    //Create object 
	    savingsAccount saver1 = new savingsAccount(2000.00);
	    savingsAccount saver2 = new savingsAccount(3000.00);
	    savingsAccount.setAnnualInterestRate(0.04);
		
	    saver1.calculateMonthlyInterest();
	    saver2.calculateMonthlyInterest();
	    System.out.println(saver1.toString());
	    System.out.println(saver2.toString());

	    savingsAccount.setAnnualInterestRate(0.05);  //set interest rate
	    saver1.calculateMonthlyInterest();
	    saver2.calculateMonthlyInterest();
	    System.out.println(saver1.toString());
	    System.out.println(saver2.toString());
	    

	}	
	

}
