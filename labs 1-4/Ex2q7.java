/*
** Author:Colm Carey	Date:010/10/2015
** Purpose: Write a Java application that
* will teach the user basic multiplication
* up as far as 12 times tables.
*/
public class Ex2q7
{

	public static void main(String args[])
	{
		int ans;
		int input=0;
		boolean exit = false;
		
		while(!exit)
		{
			//Generate two random integers between 0->12
			int ramdom1 = (int) (Math.random()*12);
			int ramdom2 = (int) (Math.random()*12);
			
			ans = ramdom1*ramdom2;
			
			//Keep repeating if the answer is incorrect
			while(input!=ans)
			  {
				System.out.println(" How much is " + ramdom1 + " times " + ramdom2 + " ? (-1 to quit): ");
				input = EasyIn.getInt();
				
				if(input==ans)
				  {
				    	System.out.println("Correct answer Very Good!!!!");
				  }
				else
					{
						System.out.println("Sorry pleased Try Again !!!");
					}
				
				//If -1 is entered exit loop and end program
				if(input==-1)
				  {
					exit=true;
					input=ans;
					System.out.println("end");
				  }
				  
			}
		}	
	}		


}
