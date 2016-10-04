
class	Jlab75	

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				18/02/2015
// Purpose : 			Read in an array of alphabetical characters and tell if the array of characters are a palindrome



{
	
		
    public static void main(String[] args)
    {
    	char myArray[];
    	int index;
    	String forwardChars;
    	String reversedChars;
    	myArray = new char [5];
    	forwardChars ="";
    	reversedChars ="";
    	for(index=0;index <= 4;index++)//loop till 5 characters are entered
    		{
    
    			System.out.print("Please enter your characters to check :");// prompt user to enter characters 
				myArray [index] = EasyIn.getChar();
			}
		System.out.println();
		System.out.println("The characters entered in the array are :" );
		System.out.println();
    	for (index = 0; index <= 4;index ++)
    		{
    			System.out.println(myArray [index]);//print the characters entered
    		}
    		System.out.println();
    	for (index = 0; index <=4; index ++)//loop through array for forward characters		 		
			{
			    forwardChars = forwardChars +myArray [index];
			}
    		
			
		for (index = 4; index >=0; index --)	//loop through array reversed characters	 		
			{
			     reversedChars = reversedChars +myArray [index];
			}
			 if(forwardChars.equals(reversedChars))
				{
			 		System.out.println("These characters make a palindrome");//prints if characters are palindrome
			 	}
			else
				{
					System.out.println("These characters do not make a palindrome");//prints if characters are not palindrome
				}
		System.out.println();
				 
			 
			 
			 
    }
}

