/*
** Author: colm carey	Date: 07/10/2015
** Purpose: Write a Java application to input a single integer value and output the
** corresponding number of stars
*/

public class Ex2q1
{
	
	public static void main(String args[])
	{
		int input=0;
		
		System.out.println("Please enter a number: ");
		input = EasyIn.getInt();
		
		for(int index=0; index < input; index++){
			System.out.print("*");
		}
	}
} 
