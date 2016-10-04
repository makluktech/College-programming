/*
** Author: Colm Carey	Date:16/10/2015
** Purpose: Write a Method called Search which will search a string object 
*for occurrences of specified character. the user inputs  the string and search character
*the method should return the number of occurrences of the character in the string
*/
public class Ex3q6 
{
	public static void search()
	{
		String  theSen=" ";
		char  theChar=' ';
		int counter=0;
		
		// prompt the user to enter a word
		System.out.print(" Please enter the word to search :");
		theSen= EasyIn.getString();
		// prompt the user to enter the character to search for 
		 System.out.print(" Please enter the character:");
			theChar = EasyIn.getChar();
	   
		for(int i=0;i < theSen.length();i++)  // loop through the string
			{
			   if (theChar == theSen.charAt(i)) // check if the char is in the string and count
				   {
					  counter++;
				      
				  }
		     
		
			}
		if(counter == 0)
	     {//print if char is not in sent
		    System.out.println("Sorry the character you entered is not in the string:");
	     }
		 System.out.println("The character count for " +theChar +" : "+counter);// print char count
	}
	
	public static void main(String[] args)
	{
		search(); // calling in the method search

	}

	

}
