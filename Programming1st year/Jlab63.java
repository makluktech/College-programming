
class	Jlab63	

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				23/01/2015
// Purpose : 			Method to take in a word a count the alpha chars



{
	public static int alphaCount(String word)
	{
		int index;
		char caps;
		int lcounter; 
		
		lcounter = 0;
    
      
	  for (index = 0;index <word.length();index++)
	  {
	  	 	  	caps = Character.toUpperCase(word.charAt(index));// set all to uppercase characters for the check
    		 if (caps >= 'A' && caps <='Z')    // checking if for non characters 
    		     { 
    		    	  
    		    	  
    		    	   lcounter++;	 
    		    }
	  	 		
	  	     
	  
	  }
		
		return lcounter;
		
	}
	
	
		public static void main(String[] args)  //Method to check uppercase A-Z was entered
	{
		String word;
		int getCount;
		
	  	System.out.println("Please enter word to check to check :");// prompt user for word to check
    	word=EasyIn.getString();
		getCount=alphaCount(word);
		System.out.println("The count of characters is"+getCount); 
	  	// return lcounter; // returns back to the main method
	  
		
	}
}
	


