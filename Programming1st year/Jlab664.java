
class	Jlab664	

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				21/01/2015
// Purpose : 			Method to modify 663 to count uppercase charcater only



{
		public static int countUpperCase(String name)
	{//METHOD TO TAKE IN A STRING AND RETURN ONLY THE SURNAME
	
		
		int numOfChar=0;
		int counter;
		
		
	//	numOfChar = name.length();// gets number of characters 
		
			for(counter =0; counter <name.length();counter++)	//looping while there is characters in the name
				{
					if(name.charAt(counter)>='A'&& name.charAt(counter)<='Z')// checking for upper case characters
			
						{
							 numOfChar++; //counting uppercase characters found
				
						}	
				}
		
		return numOfChar;
		
	}
	
    public static void main(String[] args)
    {
    	String name;
    
    	System.out.print("Please enter a Name :");// prompt user to enter a name
		name = EasyIn.getString();//take in user input
				
    
    	System.out.println(" The Number of Characters in the name entered was  :"+countUpperCase(name));  // call method with upper case count
    }
}

