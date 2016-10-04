
class Jlab15

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				26/09/2014
// Purpose : 			Total amount repaid


// Error : "Invalid path, \bin\javac.exe -classpath"
// 	Solution
// 		Configure -> Options -> JDK Profiles -> New -> browse to C:\Program Files\Java\JDK1.7.03_03
//		Them click "OK" In the options dialogue box (if there is a blank line over "JDK ver . . delete it) Then click OK

{
    public static void main(String[] args)
    {
    	double loanAmount;
    	double interestRatePerAnum;
    	int    amountOfYears;
    	double interest;
    	double totalRepaidAmount;
    	
    	
    	System.out.print("Please enter your loan amount :");
    	loanAmount = EasyIn.getDouble();
    	
    	System.out.print("Please enter the amount of years on your loan :");
    	amountOfYears = EasyIn.getInt();
    	
    	System.out.print("Please enter your interest rate per anum :");
    	interestRatePerAnum = EasyIn.getDouble();
    	
    	interest = (double)( loanAmount * interestRatePerAnum ) * amountOfYears  ;	// calculates the interest
    	
    	totalRepaidAmount = interest +loanAmount;								// calculates the sum for total repaid
    	System.out.println("the total amount repaid is :" + totalRepaidAmount );	// shows total repaid
    	
    	
    
    }
}

