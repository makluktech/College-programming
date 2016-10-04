
class Jlab11

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				17/09/2014
// Purpose : 			to convert from inches to centimeters


// Error : "Invalid path, \bin\javac.exe -classpath"
// 	Solution
// 		Configure -> Options -> JDK Profiles -> New -> browse to C:\Program Files\Java\JDK1.7.03_03
//		Them click "OK" In the options dialogue box (if there is a blank line over "JDK ver . . delete it) Then click OK

{
    public static void main(String[] args)
    { // declare the variables used
    	int inches;
    	double centimeters;
    	double answer;
    	
    	System.out.print("Enter in inches to convert to centimeters-. ");  		// promts user to enter number 
		inches = EasyIn.getInt();												// takes in the number entered by user
		
		centimeters = 2.54; 													//sets the calculation size of 2.54 to 2.54
    	answer = inches * centimeters; 											// calculates the inches to centimeters
    	
    	System.out.println("your covertion to centimeters is ! " + answer) ;  	// displays the calculation to the screen
    }	
}

