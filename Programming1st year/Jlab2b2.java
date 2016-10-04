
class Jlab2b2

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				10/10/2014
// Purpose : 			Credit card Interest



{
    public static void main(String[] args)
    {
    
     double amountOwed;		// variables been used
     double outPut;
    
     
     System.out.print("Please enter amount owed to calculate interest :");
     amountOwed = EasyIn.getDouble();
     
     outPut = (amountOwed * .12) + amountOwed; // calculates amount owed with 12% interest
    
    	if (outPut <= 500)		// if less than 500 euro do below
    	
    		{
    		
    			System.out.println("your Credit Card bill is :" + outPut);
    		
    		}
    		
    		
    	else // else over 500 euro calculates below
    	
    		{
    			outPut = (amountOwed * .18) + amountOwed;// calculates amount owed with 18% interest
    			System.out.println("your Credit Card bill is :" + outPut);
    			
    		}
    
    
    
    
    }
}

