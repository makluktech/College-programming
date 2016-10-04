/*
** Author: colm carey	Date:07/10/2015
** Purpose: Write a Java application to input a single integer value and output the
**			 corresponding number of *'s
*/

public class Ex2q3
{
	
	public static void main(String args[])
	{
		int input=0;
		
		System.out.println("Please enter a number: ");
		input = EasyIn.getInt();
	
		for(int index=input; index > 0; index--)
		{ // while input is > 0 loop and take one star off
	
			for(int x=0; x<input; x++)
			{
				
				System.out.print("*");
			
			}
			
			input--;
			System.out.println(" ");
		}
	}
}
