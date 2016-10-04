
/*
** Author:Colm Carey	Date: 23/02/2016
** Purpose: to ues throws catch statements
*/

public class ExceptionTest
{
	public static void main (String args[]) 
	{
		int[] myArray = new int[10]; 
		try {
			   myArray[100] = 1; // because array is set at 100 it throws error
		   }
		catch(ArrayIndexOutOfBoundsException e) 
		{
			e = new ArrayIndexOutOfBoundsException("Please ensure your array index is within bounds.");
			throw(e); // stops here a shows  error message because it has found an exception
			
		}
	}
} 
