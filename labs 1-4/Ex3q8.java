/*
** Author: Colm Carey	Date:16/10/2015
** Purpose: Write a Method called evenlyDivisible that accepts to interger
* value and returns true or false if the first is divisible by the secound
*/
public class Ex3q8 
{
	
public static void evenlyDivisible()
	{
		int num1=0;
		int num2=0;
		
		
		// take in the numbers from user
		System.out.print("Enter your first number is :");
		num1 = EasyIn.getInt();
		System.out.print("Enter your second number is :");
		num2 = EasyIn.getInt();
		

			if(num1 % num2 ==0 ) // do calculation to see if num2 is % of num1
			{
				System.out.println(" true :");  //output if second num is divisible by first
			}
			
			else
			
			{
				System.out.println("false ");   //output if second num is not divisible by first 
			}

  }
	
		
	public static void main(String[] args)
	{
		evenlyDivisible(); // calling in the method evenlyDivisible

	}

	

}





