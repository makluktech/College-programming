
class	Jlab61	

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				21/01/2015
// Purpose : 			Method to take in interger as argument and return true if argument is an even number other wise return false 



{
	public static boolean isEven(int num1 )		// METHOD TO SEE IF NUM IS EVEN OR ODD //////////
	{
		boolean evenNumber;
		evenNumber = false; //set boolean to false
		
		num1 =num1%2; //devides num1 by num1
		
		
			if(num1 ==0) // find even if num1 is set to zero
				{
				
					isEven=true;
				
				}
		
		return isEven;//returns back true or false to the main method
		
		
	}
	
    public static void main(String[] args)		//MAIN METHOD ////////
    {
    	int myNumber; 
    	
     	myNumber = 0;
    	
    	
    	
    	System.out.println("Please enter number to check :");// prompt user to enter the number to check
    	myNumber=EasyIn.getInt();//take in num entered
		System.out.println("the number is: "+isEven(myNumber));// returns the answer from the method isEven
    }
}

