/*
** Author:Colm Carey	Date:10/10/2015
** Purpose: Write a Java application that produces a multiplication table showing results of
*multiplying integers 1 through 12 by themselves.
*/

public class Ex2q6 
{
	public static void main(String[] args) 
	{
		int num1;
	    int num2;
	    int total;
	    for (num1 = 1; num1 <= 12; num1++)
	    {
	        for (num2 = 1; num2 <= 12; num2++) 
	        {
	            total = num1 * num2;
	            System.out.print(total);
	            if(total < 10)
	            {
	                System.out.print("    ");
	            }
	            else if(total >= 100)
	            {
	            System.out.print("  ");
	            }
	            else if(total >= 10)
	            {
	            System.out.print("   ");
	            }

	        }
	        System.out.println();
	    }
	}

}
