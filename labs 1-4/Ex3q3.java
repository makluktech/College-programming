/*
** Author: Colm Carey	Date:16/10/2015
** Purpose: Write a Method sum100 that returns the sum of integers from 1 to 100, inclusive.
*/
public class Ex3q3 
{
	public static void sum100()
	{
		int sum =0;
		
		for(int i = 1;i <= 100; i++)//loop till hits 100
		   {  
			
	          sum = sum +1;
	          System.out.println( sum);
		   }
		
		 
	}
public static void main(String[]args)
   {
	    sum100();// call method sum100 to print 1 to 100
		
   }

}
