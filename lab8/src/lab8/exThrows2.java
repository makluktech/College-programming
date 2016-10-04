package lab8;

import java.io.IOException;

public class exampleThrows {
	//waiting on input error
	public static void mymethod() throws IOException
	{
	//  this is what can cause problem and is thrown back to caller which must handle it
		System.in.read();
	
	}
	public static void main(String[]args)
	{
		try {
			 mymethod();//call method
			
		}
	//  catch and handle the exception
		catch (IOException e)
		{  
			 
		}

		
	}
}
