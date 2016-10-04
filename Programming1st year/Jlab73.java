


class Jlab73
// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				16/02/2015
// Purpose : 			To get the amount of times higest and lowest numbers were entered


{	
      
   public static void main (String[]args )  
	{  
		int 	myArray [];
    	int 	index ;
    	int 	highestNumber;
    	int		lowestNumber;
    	int		highNumAppear;
    	int		lowestNumApper;
    	
        myArray = new int [5];//set array to 5
        
		highestNumber =0;
		lowestNumber  =0;
		highNumAppear =0;
		lowestNumApper=0;
		
    	for (index = 0; index <= 4;index ++)//for loop to take in 5 numbers
    		{
    			System.out.print("Please enter your numbers :");
				myArray [index] = EasyIn.getInt();
    		}
    	System.out.println();
    	System.out.println("The numbers entered in the array were :" );
    	for (index = 0; index <= 4;index ++)
    		{
    			System.out.println(myArray [index]);//print the numbers entered
    		}
    	
    	for (index = 0; index <= 4;index ++)// to check for highest and lowest number entered
    		{
    			
    		if (index == 0)
    			{
    				lowestNumber = myArray [index];
    				highestNumber = myArray [index];	
    			}
    	 
    	 	else if(myArray [index] < lowestNumber)
    			{
    				lowestNumber = myArray [index];
    				lowestNumApper = 0;
    			}	
    			
    	 	else if(myArray [index] > highestNumber)
    			{
    				highestNumber = myArray [index];
    				highNumAppear = 0;
    			}	
			}
			
			for (index = 0; index < 5; index ++) // 
		 		{
		 	
		  		if (myArray [index] == lowestNumber)   
					
					{
						lowestNumApper ++;			 // Counts how many times lowest number was entered in array
					}
			
			else if (myArray [index] == highestNumber)
					
					{
						highNumAppear ++;		// Counts how many times highest number was entered in array
					}
				}//end for loop for times highest and lowest numbers appeared
		System.out.println("\nThe highest number entered was: " + highestNumber);//print highest num entered
		System.out.println("\nThe lowest number entered was  : " + lowestNumber);//prints lowest num entered
		System.out.println("\nThe largest number appeared    : " + highNumAppear);//print times highest num was entered
		System.out.println("\nThe lowest number appeared     : " + lowestNumApper);//print times lowest num was entered
			
    		
		
	    	
    }
   
}
