
class Jlab34

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				24/10/2014
// Purpose : 			collection of numbers get largest and smallest num



{
    public static void main(String[] args)
    {
    
    	int number;
    	int AverageNum = 0;
    	int largestNum;
    	int smallestNum;
    	int counter =1;
    	
    	boolean exit = false;
    	
    	System.out.print("Please enter first number  :");
    	number = EasyIn.getInt();
    	largestNum = number;
    	smallestNum = number;
    	
		while(number != 0)//starts loop 
			{
				if (number > largestNum ) // find largest number
					{
						largestNum = number;
					
					
					}
				
				else if (number < smallestNum)// find smallest number
					{
						smallestNum = number;
					
					}		
						
					counter++; 
					
				System.out.println("Enter zero to exit. " );
				System.out.print("Enter your list of numbers : " );
				number = EasyIn.getInt(); // Exit the loop
			} // while 
		System.out.println("\t\nThe largest number is :" +largestNum);
		System.out.println("\t\nThe smallest number is :"+smallestNum ); 
    		
     
   
    	
			
    			
    				
    				
    				
    				
    				
    			
    
    }
}

