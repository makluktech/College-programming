
class	Jlab663	

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				13/02/2015
// Purpose : 			Method to take in a string and give back the count of characters



{
		public static int countName(String name)
	{//METHOD TO TAKE IN A STRING AND RETURN ONLY THE SURNAME
	
		//String name;
		int numOfChar;
		
		numOfChar = name.length();// gets number of characters 
	
		
	
		
		return numOfChar;
		
	}
	
    public static void main(String[] args)
    {
    	String name;
    
    	
    	
    	System.out.print("Please enter a Name :");// prompt user to enter a name
		name = EasyIn.getString();//take in user input
				
    
    		System.out.println(" The Number of Characters in the name entered was  :"+countName(name));  // call in surname method and print it
    }
}

