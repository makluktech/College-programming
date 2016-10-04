
class	Jlab76	

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				05/03/2015
// Purpose : 		take in strings and check if there palindromes



{
	
	public static void fillArray(String newStringArray[])
	{    //method to fill the array.
		int index;

		for (index = 0; index <= newStringArray.length-1; index ++)
    		{
    			System.out.print("Please enter a string to check : "); 
				newStringArray[index] = EasyIn.getString();	
    		}
	}


	public static String reverse(String theWord)
	{  //method to to take in the array and output it in reverse 	
    	int index;
    	String reversedWords;
    	
    	
    	reversedWords="";
		for ( index = theWord.length()-1; index >= 0; index--) 
			{
	   			reversedWords = reversedWords + theWord.charAt(index); 
	   			
			}
				
		return reversedWords; 
	}
	
	
   
	public static void compareStrings(String newStringArray[])
	{     // method to compare two strings
		int index;
		int countPalindromes=0;

		for (index = 0; index <= newStringArray.length-1; index ++)
    		{
    			
    			if( (newStringArray[index]).equals(reverse(newStringArray[index])) )//compare and if it is palindrome do this
    				{
						System.out.println( newStringArray[index] + " is a palindrome.");  
						countPalindromes++;	
					}
					else
					{
						System.out.println( newStringArray[index] + " is not a palindrome."); //if not palindrome print this 
					}	
    		}
    		
		System.out.println("The total number of palindromes in your array was :" + countPalindromes );// print amount of palindromes  
	}	

    public static void main(String[] args)
    {
    	String newStringArray[];
    	int stringLength;
	    
    	System.out.print("Please enter the amount of words to check : "); //prompt user to enter amount of words to check
		stringLength = EasyIn.getInt();
		
		newStringArray = new String[stringLength]; // set the size of array
		fillArray(newStringArray); //array to be filled

		compareStrings(newStringArray);  	
   		
    
    }
}

