package lab8;

public class exampleThrow 
{
	public static void main (String args[]) 
	{
		int[] myArray = new int[10]; 
		try {
			myArray[100] = 1;// the array set to 100 is causing the catch statement to kick in
		}
		catch(ArrayIndexOutOfBoundsException e) // catch if the array index is Out of bounds
		{
			e = new ArrayIndexOutOfBoundsException("Please 	ensure your array index is within bounds.");
			throw(e); 
		}
		

	}
} 
