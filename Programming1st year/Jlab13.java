
class	Jlab13

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				24/09/2014
// Purpose : 			Average of 3 sums


// Error : "Invalid path, \bin\javac.exe -classpath"
// 	Solution
// 		Configure -> Options -> JDK Profiles -> New -> browse to C:\Program Files\Java\JDK1.7.03_03
//		Them click "OK" In the options dialogue box (if there is a blank line over "JDK ver . . delete it) Then click OK

{
    public static void main(String[] args)
    {	// declre variables beening used
    	int number1;
    	int number2;
    	int number3;
    	double averageOfNumbers;
    	
    	System.out.print("please enter your first number ");			//prompts for first number
    	number1 = EasyIn.getInt();										//takes in first number
    	System.out.print("please enter your secound number ");			//prompts for secound number
    	number2 = EasyIn.getInt();										// takes in the secound number
    	System.out.print("please enter your third number ");			//prompts for third number
    	number3 = EasyIn.getInt();										// takes in the third number
    	averageOfNumbers = (double)(number1 + number2 + number3 )/ 3;  //Calculates the average sum
    	System.out.println("The average of your three numbers is " + averageOfNumbers);	// prints the average to the screen
    	
    	
    	
    	
    }
}

