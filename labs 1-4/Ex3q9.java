/*
** Author: Colm Carey	Date:30/10/2015                                                                             /10/2015
** Purpose: Write a Method calledmultiConcat that takes in astring and an interger 
*return astring that consist ofthe string parameter  with itself count times
*
*/
public class Ex3q9
{
	public static String multiConcat(String name, int num1)
	{
		
		String names="";
	
		
		
			if(num1 > 2 )// checking for upper case characters
	
				{
				for(int i =0; i < num1 ;i++)	//looping while there is characters in the name
				  {
						names = names + name; // cancat
				  }
					
				}

		return names;
		
		
		
	}
	
	public static void main(String[] args)
	{
		int num1=0;
		String name="";
		
		
		System.out.print("Enter your string :");
		name = EasyIn.getString();
		
		System.out.print("Enter the number to repeat string :");
		num1 = EasyIn.getInt();
		
		
		
		
		System.out.print(multiConcat(name,num1));
		

	}


}
