
/*
** Author: Colm Carey	Date:16/10/2015
** Purpose: Write a Method to take in a temp in fahrenheit and return in celsius.
*/
public class Ex3q4 
{
	public static void fahToCel()
	{
		
		int  fahrenheit = 0;
		double celsius = 0.0;
		
		
		// prompt the user to enter num to convert
		System.out.print(" Please enter Fahrenheit to covert to Celsius :");
		fahrenheit = EasyIn.getInt();
		
	    celsius  = fahrenheit;		 
		celsius = ( ( fahrenheit-32) *5)/9; // does the convertion
		
		
		 System.out.println("Tempreture in celsius is :"+ celsius);
		
		 
	}
	
public static void main(String[]args)
   {
	
			fahToCel();
		
   }
	
	
	
	
	
}
