
 class 	TaxAllowance

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				17/09/2014
// Purpose : 		Tax allowance


// Error : "Invalid path, \bin\javac.exe -classpath"
// 	Solution
// 		Configure -> Options -> JDK Profiles -> New -> browse to C:\Program Files\Java\JDK1.7.03_03
//		Them click "OK" In the options dialogue box (if there is a blank line over "JDK ver . . delete it) Then click OK

{
    public static void main(String[] args)
    {	// declare variables
    	int numOfchildren;
    	double anualIncome;
    	double taxAmountDue;
    	int childAllowance;
    	int personalAllowance;
    
    	System.out.print("Enter Anual Income -> " );   
		anualIncome = EasyIn.getDouble();
		System.out.print("How many children do you have ");
		numOfchildren = EasyIn.getInt();
		childAllowance = 1000;			//get the sum for childAllowance
		personalAllowance = 5000;		//gets the sum for personal allowance
		taxAmountDue = (double) (anualIncome - personalAllowance - childAllowance)  * 0.24; //calulate the sum due
		
		

		
    	System.out.println("Amout due is " + taxAmountDue);// displays tax Due
    	
    	
    }
}

