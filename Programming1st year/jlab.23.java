
class Jlab23

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				03/10/2014
// Purpose : 			Odd or Even


// Error : "Invalid path, \bin\javac.exe -classpath"
// 	Solution
// 		Configure -> Options -> JDK Profiles -> New -> browse to C:\Program Files\Java\JDK1.7.03_03
//		Them click "OK" In the options dialogue box (if there is a blank line over "JDK ver . . delete it) Then click OK

{
    public static void main(String[] args)
    {
    	int num1;
    	
    	int output;
    	
    	
    	
    	System.out.print("Enter your first number is :");
    	num1 = EasyIn.getInt();
    	output = num1;
    	
    		if(num1 % 2 == 0 ) // does calculation for % of num1
    		{
    			System.out.println("Your number even :" + output);  //output if even
    		}
    		
    		else
    		
    		{
    			System.out.println("Your number is odd :" + output);  // output if even  
    		}
    	
    }
}

