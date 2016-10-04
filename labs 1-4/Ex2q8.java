/*
** Author:Colm Carey	Date:10/10/2015
** Purpose: Write a Java application that 
*inputs a positive integer from the user and 
*then prints out all the prime numbers up to the integer.
*/
public class Ex2q8 
{
	public static void main(String args[])
	{
		 System.out.println(" Please enter number: ");
		 int input = EasyIn.getInt();
	      
		
		 System.out.println(" The Prime numbers from 1 to " + input + " are ");
		
		 
	     for (int i = 1; i <= input; i++)
	     {
	    	  
	    	 int counter=0; 
	    	  
	         for(int num =i; num>=1; num--)
	         {
	        	 
			    if(i%num==0)
			      {
			    	counter = counter + 1;
			      }
	         }
	         
			   if (counter==2)
			       {
			         System.out.print(i + ", ");
			      }	
			 
			 
	     }	
	 }


}
