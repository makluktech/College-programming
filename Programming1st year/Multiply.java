
class Fahrenheit

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				17/09/2014
// Purpose : 			to convert degrees to Fahrenheit


// Error : "Invalid path, \bin\javac.exe -classpath"
// 	Solution
// 		Configure -> Options -> JDK Profiles -> New -> browse to C:\Program Files\Java\JDK1.7.03_03
//		Them click "OK" In the options dialogue box (if there is a blank line over "JDK ver . . delete it) Then click OK

{
    public static void main(String[] args)
    {  // declare the variables been used
    	double degreesFahernheit;
    	double Result;
    	
    
    	System.out.print("Enter Degrees to convert to Fahernheit ->");   
		degreesFahernheit = EasyIn.getDouble();
		Result = (degreesFahernheit - 32)*5/9;			// Calculates the sum
		
    	System.out.println("convertion is  " + Result) ;	// prints the convertion
    	
    	
    }
}

