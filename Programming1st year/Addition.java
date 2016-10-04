
class Addition

// Student Name : 		Colm Carey
// Student Id Number : 	CO0197157
// Date :				19/09/2014
// Purpose : 			A Sample skeleton program


// Error : "Invalid path, \bin\javac.exe -classpath"
// 	Solution
// 		Configure -> Options -> JDK Profiles -> New -> browse to C:\Program Files\Java\JDK1.7.03_03
//		Them click "OK" In the options dialogue box (if there is a blank line over "JDK ver . . delete it) Then click OK

{
    public static void main(String[] args)
    {
    	int number1; // variables being declared
    	int number2;
    	int answer;
    	
    	System.out.print("Enter thr First number->"); // promting user for input
    	number1 = EasyIn.getInt();
    	System.out.print("Enter the secound number->");
    	number2 = EasyIn.getInt();
    	
    	answer = number1 + number2;	//to calculate the sum
    	System.out.print("The sum of the two numbers is " + answer);//displays the answer
    }
}

