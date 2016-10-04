/*
** Author: colm carey	Date:07/10/2015
** Purpose: Write a Java application to input a single integer value and output the
**	corresponding number of stars
*/

public class Ex2q2
{
	
	public static void main(String args[])
	{
		int input=0;
		boolean exit = false;
		
		while(!exit)
		{
		
			System.out.println("\n No of stars ? (-1 to quit): ");
			input = EasyIn.getInt();
			 
			if(input==-1){
				exit=true;
				System.out.println("Goodbye!");
			}
			
			for(int index=0; index < input; index++)
			{
				System.out.print("*");
			}
		
		}
	}
}
