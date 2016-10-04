
class Jlab2b4

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				10/10/2014
// Purpose : 			to show numbers in order lowest to highest


{
    public static void main(String[] args)
    {
    
      int num1;		// variables been used
      int num2;
      int num3;
      int lowestNum;
      
      System.out.print("Please enter your first number :");		 // takes in numbers from the user
      num1 = EasyIn.getInt();
      System.out.print("Please enter your secound number :");
      num2 = EasyIn.getInt();
      System.out.print("Please enter your third number :");
      num3 = EasyIn.getInt();
    
    
    	if(num1 < num2 && num1 < num3)							// if num1 is less than num2 and num3
    	{													   //  print num1 is lowest num
    		lowestNum = num1;
    		System.out.println("Number 1 is the lowest entered number :\t" + num1);
    	}
    	
    	 else if(num1 > num2 && num1 > num3)					// if num1 is greater than num2 and num3
    	{													   //  print num1 is lowest num
    		lowestNum = num1;
    		System.out.println("Number 1 is the higest number entered number :\t" + num1);
    	}
    	
    	else
    	{
    		System.out.println("number1 is the middle number:\t" + num1);
    	}
    	
    		if(num2 < num1 && num2 < num3)						// if num2 is less than num1 and num3
    	{                                                      //   print num2 is lowest num
    		lowestNum = num2;
    		System.out.println("Number 2 is the lowest entered number :\t" + num2);
    	}
    	 else if(num2 > num1 && num2 > num3)					// if num2 is greater than num2 and num3
    	{													   //  print num1 is lowest num
    		lowestNum = num1;
    		System.out.println("Number 2 is the higest number entered number :\t" + num2);
    	}
    	else												// else num 2 is middle num
    	{
    		System.out.println("number 2 is the middle number:\t" + num2);
    	}
    	
    		if(num3 < num1 && num3 < num2)						// if num3 is less than num1 and num2
    	{     	                                               // num3 is lowest num
    	 
    		lowestNum = num3;
    		System.out.println("Number 3 is the lowest entered number :\t" + num3);
    	}
    	 else if(num3 > num1 && num3 > num2)					// if num3 is greater than num2 and num1
    	{													   //  print num1 is lowest num
    		lowestNum = num1;
    		System.out.println("Number 3 is the higest number entered number :\t" + num3);
    	}
    	else													// else num3 is middle num
    	{
    		System.out.println("number 3 is the middle number:\t" + num3);
    	}
    
    
    
    
    }
}

