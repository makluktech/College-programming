/*
** Author:Colm Carey	Date:07/10/2015
** Purpose: Write a Java application to input a number and quantity sold and calc the retail
*			value of the goods sold.
*/

public class Ex2q5
{
	public static void main(String args[])
	{
		int productId  =0;
		int quantity    =0;
		double product  =0;
		double result  =0;
		
		while(productId <= 0 || productId >= 6)
		{
			System.out.println("Please enter a product ID: ");
			productId =EasyIn.getInt();
			
			if(productId <= 0 || productId >= 6)
			{
				System.out.println("Sorry: you entered an invailad product Id please try again");
			}
				
			else
				{
					System.out.println("Please enter the quantity :");
					quantity = EasyIn.getInt();
				}
			
			
			
			  switch (productId)
			  {
			  case 1:  product = 2.98;
			           break;
			           
			  case 2:  product = 4.50;
			           break;
			           
			  case 3:  product = 9.98;
			           break;
			           
			  case 4:  product = 4.49;
			           break;
			           
			  case 5:  product = 6.87;
			           break;
			  }	
			  
			  result=product * quantity;
			  
			  System.out.println("\n This product will cost you : €" +result);
		}

	}
}
			
			
			
		
		
	
	

