
class	Jlab62	

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				21/01/2015
// Purpose : 			Method to take in interger as argument and return true if argument is an even number



{
	public static boolean isAlpha(char letter )  //Method to check uppercase A-Z was entered
	{
		boolean newLetter;	
    
    	
    	
         newLetter =  true;// sets the boolean to true
    
	  if (letter <'A'||letter >'Z')// if the character is outside of caps A-Z false
	  
	 	 {
	 	 	
	 	 	newLetter =false; // inistialise to false if outside the given range
	 	 	
	    }
	  
	  
	  
	  
	   return newLetter; // returns back to the main method
	  
		
	}
	
    public static void main(String[] args)
    {
    	// declare variable 
    	char letter;
    	
    	
    	System.out.println("Please enter character to check :");// prompt user for character to check
    	letter=EasyIn.getChar();
		System.out.println("The character entered is : "+isAlpha(letter));// return true or false from isAlpha method
    }
}

