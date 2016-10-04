
class Jlab32

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				17/10/2014
// Purpose : 			Find sumof Data



{
    public static void main(String[] args)
    {	//declar variables
    	double sum =0;
    	double input;
    	boolean value = false;
    							//starts while loop while value is true
    		while(value == false)
    			{
    				
    				System.out.print("Enter you numbers to add : " );
    				input = EasyIn.getDouble();
    					if(input == 0)   // if entry ==0 sets value to true and exits loop
    					
    						{
    							value = true;
    						}
    						
    						sum = sum + input; //calculating the sum
    				
    			}
    			System.out.print("Them sum is "+ sum);// prints complete value 
    	
    	
    	
    	
    
    
    }
}

