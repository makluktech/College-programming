
class Jlab24

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				03/10/2014
// Purpose : 		


// Error : "Invalid path, \bin\javac.exe -classpath"
// 	Solution
// 		Configure -> Options -> JDK Profiles -> New -> browse to C:\Program Files\Java\JDK1.7.03_03
//		Them click "OK" In the options dialogue box (if there is a blank line over "JDK ver . . delete it) Then click OK

{
    public static void main(String[] args)
    {
    	int num1;		// variables been used
    	int num2;
    	int output;
    	
    	
    	
    	System.out.print("Enter your first number is :");	//	prompts to user for numbers
    	num1 = EasyIn.getInt();
    	System.out.print("Enter your secound number is :");
    	num2 = EasyIn.getInt();
    	output = num1 % num2;
    	
    		if(num1 %num2 == 0 ) // does calculation for num1 % num2
    		{
    			System.out.println("Your number divisible :" );  //output if divisible
    		}
    		
    		else
    		
    		{
    			System.out.println("Your number is not divisible :" );  // output if not divisible
    		}
    	
    
    }
}

