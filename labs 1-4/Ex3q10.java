/*
 * ** Author: Colm Carey	Date:30/10/2015                                                                            /10/2015
** Purpose: Write a method called factorial 
*that takes a single integer value and returns its factorial
*
*/
public class Ex3q10 {
	public static int factorial(int num1,int result)
	 {
		
		result = 1;
        while(num1 != 0)
        {
          result = result * num1;
            num1--;  // reduce number by 1 each time
        }
      
        return result;
			
	 }
	
	public static void main(String[] args)
	{
		int num1=0;
		int result=1;
		
		
		
		
		
		//take in num to get factorial of
		System.out.print("Enter the number to get factorial of :");
		num1 = EasyIn.getInt();
			
		// call back in method
		System.out.print("the factorial of "+ num1 +" is :" +factorial(num1,result));
		

	}


}
