/*Author: Colm Carey	Date:06/10/15 
 * Write a program that inputs 10 numbers and determines 
 * and returns the largest of the numbers
 *** 
*/
public class Ex1q9 
{

	public static void main(String[] args) 
	{
		int input ;
		int highNum =0 ;
	
		int index ;
		
		
		for(index =0; index < 10; index++)
		{
			System.out.println("Plese enter an interger  to check:");
			input = EasyIn.getInt();		
			
			if (input > highNum)
				{
				 highNum  = input ;			    	
				}
		
			
		}
		System.out.println("the highest num entered was :"+highNum);
	}

}
