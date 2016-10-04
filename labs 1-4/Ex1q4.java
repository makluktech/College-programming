/*Author: Colm Carey	Date:25/09/15
 **
 */

public class Ex1q4 
{
	public static void main(String[] args) 
	{
		int index = 1 ;
		int square ;
		int cube ; 
		
		System.out.println("Number Square Cube");// print - number square cube to screen
		
			while (index != 6)// loop while index is not = to 6
			{
				square = (int) Math.pow(index, 2) ;  //square the num at index
				cube = (int) Math.pow(index, 3) ;     //cubes the num at index
				
				// prints the result to the screen
				System.out.println("  " + index + "      " + square + "     " + cube);
				index ++ ;
			}
	}
}
