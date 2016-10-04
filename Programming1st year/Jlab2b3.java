
class Jlab2b3

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				10/10/2014
// Purpose : 			Lowest of 3 numbers



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
    	
    		if(num2 < num1 && num2 < num3)						// if num2 is less than num1 and num3
    	{                                                      //   print num2 is lowest num
    		lowestNum = num2;
    		System.out.println("Number 2 is the lowest entered number :\t" + num2);
    	}
    	
    		if(num3 < num1 && num3 < num2)						// if num3 is less than num1 and num2
    	{     	                                               // num3 is lowest num
    	 
    		lowestNum = num3;
    		System.out.println("Number 3 is the lowest entered number :\t" + num3);
    	}
    
    
    }
}

