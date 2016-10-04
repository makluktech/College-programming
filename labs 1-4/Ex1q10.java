/*Author: Colm Carey	Date:06/10/15 
 * Write a program that inputs any number and prints back the lowest and highest numbers
 *** 
*/
public class Ex1q10
{
	
	public static void main(String[] args) 
	{
		int input=0 ;
	
		int highestNum=0;
		int lowestNum=0;
		int counter =0;
		
		System.out.println("Plese enter an interger  to check:");
		input = EasyIn.getInt(); 
		
		while(input !=0 ) // exit doesnt equals true
		{
			
			if(lowestNum == 0)
			{
				lowestNum = input ;
			}
			
			if (input > highestNum)
				{
					highestNum = input ;			    	
				}
			
			if (input < lowestNum)
				{
					lowestNum = input ;			    	
				}
			System.out.println("Plese enter an interger  to check:");
			input = EasyIn.getInt();
			
				counter++;
		}
		System.out.println("the highest num entered was :"+highestNum);
		System.out.println("the highest num entered was :"+lowestNum);
		
	}

}
