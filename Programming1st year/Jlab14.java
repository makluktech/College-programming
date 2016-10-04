
class	Jlab14

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				26/09/2014
// Purpose : 			DisplayCurrent


// Error : "Invalid path, \bin\javac.exe -classpath"
// 	Solution
// 		Configure -> Options -> JDK Profiles -> New -> browse to C:\Program Files\Java\JDK1.7.03_03
//		Them click "OK" In the options dialogue box (if there is a blank line over "JDK ver . . delete it) Then click OK

{
    public static void main(String[] args)
    {	// declare variables beening used
    	int number1;
    	int number2;
    	int number3;
    	double averageOfNumbers;
    	double ProductIs;
    	double sum;
    	
    	System.out.print("please enter your first number ");
    	number1 = EasyIn.getInt();
    	
    	System.out.println("the sum is :    " + number1);
    	System.out.println("the product is :" + number1);
    	System.out.println("the average is :" + number1);
    											
    	System.out.print("please enter your secound number ");			
    	number2 = EasyIn.getInt();
    	
    	ProductIs = (double)(number1 * number2);// calculates the product/sum/average for number1 and number2
    	sum = number1 + number2;			
    	averageOfNumbers = sum / 2;			
    	
    	System.out.println("the sum is :" + sum);
       	System.out.println("the product is :" + ProductIs);
       	System.out.println("the average is :" + averageOfNumbers);
    	
    	System.out.print("please enter your third number ");			
    	number3 = EasyIn.getInt();
    	
    	ProductIs = (double)(number1 * number2 * number3);// calculates the product/sum/average for number1/number2/number3
    	sum = number1 + number2 + number3;
    	averageOfNumbers = sum / 3;
    	
    	System.out.println("the sum is :" + sum);
       	System.out.println("the product is :" + ProductIs);			// display results to screen
       	System.out.println("the average is :" + averageOfNumbers);										
    
    	
    	
    	
    }
}

