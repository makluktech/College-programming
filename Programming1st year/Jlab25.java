
class Jlab25

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				03/10/2014
// Purpose : 			Divisible by 3


// Error : "Invalid path, \bin\javac.exe -classpath"
// 	Solution
// 		Configure -> Options -> JDK Profiles -> New -> browse to C:\Program Files\Java\JDK1.7.03_03
//		Them click "OK" In the options dialogue box (if there is a blank line over "JDK ver . . delete it) Then click OK

{
    public static void main(String[] args)
    {
    	int num1;		// variables been used
    	int num2;
    	int num3;
    	
    	
    	
    	
    	System.out.print("Enter your first number is :");	//	prompts to user for numbers
    	num1 = EasyIn.getInt();
    	System.out.print("Enter your secound number is :");
    	num2 = EasyIn.getInt();
    	System.out.print("Enter your third number is :");
    	num3 = EasyIn.getInt();
    	;
    	
    		if(num1 % num2 == 0 && num1 % num3 == 0) 	// if to calculate if both nums are divisible			 
    			{
    			
    				System.out.println("Your first number is divisible by both :" );  //output if both are divisible
    			}
    		
     	 	else if(num1 % num2 == 0 ) //if to clculate num1 % num2
    		
    			{
    				System.out.println("first number is divisible by number 2 :" );  // output if 1 num is devisible
    			}
    		else if(num1 % num3 == 0 )	//if to calculate num1 % num3
    		
    			{
    				System.out.println("first number is divisible by number 3 :" );  // output if 1 num is devisible
    			}
    
    		
    		else  // for numbers not divisible
    			{
    			
    				System.out.println("Your numbers are not divisible"); // out put if none are divisible 
    			}
    	
    
    }
}

