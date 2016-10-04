
class Jlab33

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				24/10/2014
// Purpose : 			Interger Values



{
    public static void main(String[] args)
    {
    	int number;
    	int index = 1;
    	int firstPosition=0;
    	int lastPosition=0;
    	boolean exit = false;
    	
    	
			while(exit == false)//starts loop 
    			{
    				
    				System.out.print("Enter zero to exit Begin entering your list of number : " );
    				number = EasyIn.getInt();
    				if(number == 0)   // to exit loop
    					
    					{
    						exit = true;
    					}
    						
    				else if (number == 12 && firstPosition ==0) // check num is 12 and is first occurance
    				{
    					firstPosition = index;
    					
    					
    				}
    				
    				else if (number == 12)// check num is 12 and is last occurance
    				{
    					lastPosition = index;
    					
    				}		
    						
    				index++; 
    			}
    			System.out.println("\t\nThe first occurance of 12 is :"+ firstPosition);// print first occurance of 12 
    			System.out.println("\t\nThe Last occurance of 12 is  :"+ lastPosition);	// print last occurance of 12 
    		
     
   
    
    
    }
}

