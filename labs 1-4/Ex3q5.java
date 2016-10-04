/*
** Author: Colm Carey	Date:16/10/2015
** Purpose: Write a Method called power which takes two integers values
*x and n and raise x to the power of n.
*the calculated value of x to the power of n returned to calling method
*/
public class Ex3q5
{
	public static void power()
	{
		int x =0;
		int n = 0;
		
		
		// prompt the user to enter num 1
		System.out.print(" Please enter the first value :");
		  x = EasyIn.getInt();
		// prompt the user to enter num 1
		 System.out.print(" Please enter the second value :");
		  n = EasyIn.getInt();
	   
		
		 System.out.println(Math.pow(x,n)); // do the calculation
		
		 
	}

	public static void main(String[] args)
	{
		power(); // calling in the method power

	}

}
