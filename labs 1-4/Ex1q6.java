/*Author: Colm Carey	Date:29/09/15
 **
 */
public class Ex1q6
{
	public static void main(String[] args) 
	{
		int age;
	  
		System.out.println("Please enter your age:");// prompt user to enter age
		
		age = EasyIn.getInt();
		
		
			if (age >= 18) // if statement to check if old enough to vote
				{
				
				
					System.out.println("You are of age to vote :" + age);
				}
			else
				{
					System.out.println("You are not of age to vote ");
				}
			

}
}
